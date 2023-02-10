package core.algo.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


public class Test1 {
	
	private interface I {
		default void test() {
			
		}
		static void test1() {
			
		}
		
		public void test2();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 3; 
		int matrix[][] = {
						  {1, 2, 3},
				          {4, 5, 6},
				          {7, 8, 9}
				          };
		
//		transpose(matrix, N);
		
//		System.out.println(Arrays.deepToString(matrix));
		
//		Long count = Optional.of(null).stream().count();
		Long c = Optional.ofNullable(100).stream().count();
		Long count = Optional.empty().stream().count();
		System.out.println(c);
		
		List<Integer> set = new ArrayList<>(9);
		int[] re = set.stream().sorted().mapToInt(Integer::intValue).toArray();

	}
	
	
	static void transpose(int matrix[][],int n) {
		 
        for(int row =0;row<n;row++) {
       	 for(int col = 0;col <n;col++) {
       		 if(row < col) {
       			 int temp = matrix[row][col];
       			 
       			 matrix[row][col] = matrix[col][row];
       			 matrix[col][row] = temp;
       		 }
       	 }
       	 
        }
        
   
	}
	
	static void rotateby90(int matrix[][], int n) { 
         int[][] temp = new int[n][n];
         int idx = 0;
         for(int row =n-1;row>=0;row--) {
        	 for(int col = 0;col <n;col++) {
        		 temp[idx][col] = matrix[col][row];
        	 }
        	 idx++;
         }
         
//         System.out.println(Arrays.deepToString(temp));
         
         for(int row =0;row<n;row++) {
        	 for(int col = 0;col <n;col++) {
        		 matrix[row][col] = temp[row][col];
        	 }
        	 
         }
         
    }

}
