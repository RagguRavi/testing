package core.algo.simple;

import java.util.Arrays;
import java.util.Scanner;

public class HackerEarthInterviewQuestion {
	
	public static int dp[][][];
	public static int k;
	static int M2 =  1000000007;
	public static void main(String args[]) {
//		Arrays.fill(dp, Integer.valueOf(-1));
		// Fill each row with -1. 

		blueAndRedBalls();
		
      System.out.println(Arrays.deepToString(dp));
		
	}
	
	public static void blueAndRedBalls() {
		Scanner sc = new Scanner(System.in);
		int redBalls = sc.nextInt();
		int blueBalls = sc.nextInt();
		k = sc.nextInt();
		dp = new  int[redBalls+1][blueBalls+1][2];
		
		for (int[][] row : dp) {
            for (int[] rowColumn : row) {
                Arrays.fill(rowColumn, -1);
            }
        }
        
		
		int possibleWays = (go(redBalls, blueBalls, 0) + go(redBalls, blueBalls, 1)) % M2;
		System.out.println(possibleWays);
		
	}
	public static int go(int red,int blue,int type) {
		
		if(red == 0 && blue == 0) {
			return 1;
		}
		
		 if((red != 0 && (type == 1 && blue == 0)) || (blue != 0 && (type == 0 && red == 0))) {
			  return 0;
		 }
		 
		 dp[red][blue][type] = 0;
		 
		 for(int i = 1; i <= Math.min(k, (type>0? blue: red)); i++) {
			    if(type == 0)
			      dp[red][blue][type] = (dp[red][blue][type] + go(red - i, blue, 1)) % M2;
			    else
			      dp[red][blue][type] = (dp[red][blue][type] + go(red, blue - i, 0)) % M2;
			  }
			  return dp[red][blue][type];
		
	}
}
