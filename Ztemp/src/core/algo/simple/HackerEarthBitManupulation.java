package core.algo.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HackerEarthBitManupulation {

	 static int[] BitsSetTable256 = new int[256]; 
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		 XorOfNumbers();
//		System.out.println(Arrays.toString(BitsSetTable256));
	}
	 
	
	public static void specialBits() {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		System.out.println();
		for(int i=0;i<testCases;i++) {
			long from = sc.nextLong();
			long to = sc.nextLong();
			
			int number = sc.nextInt();
			int bitCounts = number;
			long result = -1;
			for(long j = from;j<=to;j++) {

				if(bitCounts == Long.bitCount(j)) {
					result = j;
					break;
				}
			}
			
			System.out.println(result);
			
		}
	}

	public static void XorOfNumbers() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.lines().collect(Collectors.joining(System.lineSeparator()));
			System.out.println(str);
			String temp[] = br.readLine().split(" ");

			int size = Integer.parseInt(temp[0]);
			int testCases = Integer.parseInt(temp[1]);

			int tempResult = 0 ;
			int arr[] = new int[size];
			
			temp = br.readLine().split(" ");
			
			for(int i=0;i<size;i++) {
				int no = Integer.valueOf(temp[i]);
				arr[i]=no;
				tempResult = tempResult ^ no;
			}


			for(int i=0;i<testCases;i++) {
				temp = br.readLine().split(" ");
				int result = tempResult;
				int from = Integer.valueOf(temp[0])-1;
				int to = Integer.valueOf(temp[1])-1;

				for(int j=from;j<=to;j++) {
					result = result ^ arr[j];
				}


				System.out.println(result);

			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Method to calculate xor
    static int computeXOR(int n) {
        if (n % 4 == 0)
            return n;
        // If n%4 gives remainder 1
        if (n % 4 == 1)
            return 1;
        // If n%4 gives remainder 2
        if (n % 4 == 2)
            return n + 1;
        // If n%4 gives remainder 3
        return 0;
    }
	
public static void xorSplit(Long no) {
		
	}
	
	public static void xorSplit() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			long orignalNo = sc.nextLong();
			long no = orignalNo;
			long half = no >> 1;
			long firstNo = 1;
			while(no > half) {
				no = no - firstNo;
				
				if((no ^ firstNo) == orignalNo && (no&firstNo )== 0) {
					break;
				}
				
				firstNo++;
			}
			
//			System.out.println(firstNo+"\t"+(orignalNo-firstNo));
			if(no <= half) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}
		}
	}

}
