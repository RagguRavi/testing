package core.algo.simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class HackerEarthArray {

	public static void main(String[] args) {
//		minimumAddition1();
		int arr[] = {9,21,64,50,82,31,42,-33,62,24,19,-30,28,-2,73,23,94,-45,84,7,1,25,20,77,9,-6,56,2,3,3,64,83,28,-24,59,-37,55,43,77,-22,24};
		System.out.println(findTriplets(arr, arr.length));
	}
	
	
	public static  boolean findTriplets(int arr[] , int n) {
		  Arrays.sort(arr);
	       for(int i=0;i<n;i++) {
	           int temp = arr[i];
	           int p=n-1;
	           
	           for(int j=0;j<n;j++) {
	               
	               if(p < j) {
	                   break;
	               }
	               
	               if(i != j) {
	                int sum = temp+arr[j]+arr[p];
	                if(sum == 0) {
	                    return true;
	                }
	                
	                p--;
	               }
	           }
	           
	       }
	       
	       return false;  
    }
	
	public static int doubleInversion(int numMenus, int numItems, long[][] menus) {

		int bestMenu = 0;

		long[] bestPrices = new long[numItems];

		int[] countBestForMenus = new int[numMenus];

		for (int i = 0; i < numItems; i++) {
			long max = menus[0][i];

			for (int j = 0; j < numMenus; j++) {
				max = Math.max(max, menus[j][i]);
			}
			bestPrices[i] = max;
		}

		int maxBestCount = 0;
		for (int i = 0; i < numMenus; i++) {
			for (int j = 0; j < numItems; j++) {
				if (menus[i][j] == bestPrices[j]) {
					countBestForMenus[i]++;
				}
			}
			maxBestCount = Math.max(maxBestCount, countBestForMenus[i]);

		}

		long[] avgMenus = new long[numMenus];
		for (int i = 0; i < numMenus; i++) {
			long avg = 0;
			for (int j = 0; j < numItems; j++) {
				avg += menus[i][j];

			}
			avg = avg / numItems;
			avgMenus[i] = avg;
		}

		long maxAvg = 0;
		for (int i = 0; i < numMenus; i++) {
			if (countBestForMenus[i] == maxBestCount) {
				if (avgMenus[i] > maxAvg) {
					bestMenu = i + 1;
					maxAvg = avgMenus[i];
				}
			}
		}

		return bestMenu;

	}
	public static void minimumAddition1() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int testCases = Integer.valueOf(br.readLine());
			int size=0;
			long reuiredAverage,sum = 0;

			while (testCases > 0) {
				sum = 0;
				String SizeAndAverage = br.readLine();
				String temp[] = SizeAndAverage.split(" ");
				size = Integer.valueOf(temp[0]);
				int a[] = new int[size];
				reuiredAverage = Integer.valueOf(temp[1]);

				temp = br.readLine().split(" ");
				for (int i = 0; i < size; i++) {
					a[i] = Integer.valueOf(temp[i]);
					sum += a[i];
				}

				if (sum / size <= reuiredAverage) {
					System.out.println("0");
				} else {
					long res = (sum / (reuiredAverage + 1)) + 1;
					System.out.println(res - size);
				}

				testCases--;

			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static void minimumAddition() {
		Scanner s = new Scanner(System.in);

		int testCases = s.nextInt();
		int size=0;
		long reuiredAverage,sum = 0;

		while (testCases > 0) {
			sum = 0;
			
			size = s.nextInt();
			int a[] = new int[size];
			reuiredAverage = s.nextInt();

			for (int i = 0; i < size; i++) {
				a[i] = s.nextInt();
				sum += a[i];
			}

			if (sum / size <= reuiredAverage) {
				System.out.println("0");
			} else {
				long res = (sum / (reuiredAverage + 1)) + 1;
				System.out.println(res - size);
			}

			testCases--;

		}
}
	
	public static void maximumTheSum1() {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		
		for(int i=0;i<testCases;i++) {
			int size = sc.nextInt();
			int ditinctNo = sc.nextInt();
			
			List<Long> list = new ArrayList<>();
			for(int j=0;j<size;j++) {
				long no = sc.nextLong();
				list.add(no);
			}
			Collections.sort(list, Collections.reverseOrder());
			
			long maxSum = 0;
			
			Set<Long> set = new HashSet<>();
			long addedElements = 0;
			for(int k=0;;k++) {
				
				
				long val = list.get(k);
				
				if(val >0) {
					maxSum += val;
				}
				
				if(!set.contains(val)) {
					set.add(val);
					addedElements++;
					
					if(addedElements >= ditinctNo) {
						break;
					}
				} 
				
			}
			
			System.out.println(maxSum);
			
		}
		
	}
	
	
	public static void maximumTheSum() {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		
		for(int i=0;i<testCases;i++) {
			int size = sc.nextInt();
			int ditinctNo = sc.nextInt();
			
			Map<Long,Long> map = new HashMap<>();
			for(int j=0;j<size;j++) {
				long no = sc.nextLong();
				if(map.containsKey(no)) {
					map.put(no, map.get(no)+no);
				} else {
					map.put(no, no);
				}
			}
			
			List<Long> values = map.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
			long maxSum = 0;
			
			ditinctNo = ditinctNo < values.size() ? ditinctNo:values.size();
			
			for(int k=0;k<ditinctNo;k++) {
				long val = values.get(k);
				if(val >0) {
					maxSum += val;
				}
			}
			
			System.out.println(maxSum);
			
		}
		
	}
}
