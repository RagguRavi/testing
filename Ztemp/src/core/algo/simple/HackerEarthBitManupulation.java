package core.algo.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HackerEarthBitManupulation {

	 static int[] BitsSetTable256 = new int[256]; 
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		specialBits();
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
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int testCases = sc.nextInt();
		
		int tempResult = 0 ;
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			int no = sc.nextInt();
			arr[i]=no;
			tempResult = tempResult ^ no;
		}
		
		
		for(int i=0;i<testCases;i++) {
			int result = tempResult;
			int from = sc.nextInt()-1;
			int to = sc.nextInt()-1;
			
			for(int j=from;j<=to;j++) {
				result = result ^ arr[j];
			}
			
						
			System.out.println(result);
			
		}
		sc.close();
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
