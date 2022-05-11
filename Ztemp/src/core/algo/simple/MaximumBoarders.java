package core.algo.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MaximumBoarders {

	public static void main(String[] args) {
		int arr[] = {};
//		solve(arr);
		System.out.println(3%9);
		
	}
	
	
	
	static String solve(int[] A){
		int length = A.length;
		int rem=0,no=0;
		
		for (int i = 0; i < length; i++) {
			no = A[i];
			if (i < length / 2) {
				no = Integer.parseInt(Integer.toString(A[i]).substring(0, 1));
			} else {
				no = no % 10;
			}
			rem = (rem * 10 + no) % 11;
		}
	if (rem == 0)
		return "OUI";
	else
		return "NON";
	}
	
	public static void splitHouse() {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
        String name = s.nextLine();                 
        System.out.println(name.replaceAll(".", "H"));   
        s.close();
	}
	
	public static void divisibleBy10() {
		Scanner s = new Scanner(System.in);
		int N = 0;
		N = s.nextInt();

		int[] data = new int[N];
		for(int i=0; i<N; i++){
			data[i] = s.nextInt();
		}
		
		int lastNo = 1;
		for(int no: data) {
			lastNo = no%10;		}

		if(lastNo== 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		s.close();
	}
	public static void zooProblem() {
		Scanner s = new Scanner(System.in);
        String name = s.nextLine();   
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String st: name.split("")) {
        	if(map.get(st) != null) {
        		Integer count = map.get(st);
        		count++;
        		map.put(st,count);
        	} else {
        		map.put(st, 1);
        	}
        }
        
        int zValue = map.get("z");
        int oValue = map.get("o");
        
        if((2*zValue) == oValue) {
        	System.out.println("yes");
        } else {
        	System.out.println("no");
        }
        
        s.close();
	}
	
	public static void getCell() {

		Scanner sc = new Scanner(System.in);
		try {
			int p = sc.nextInt();

			for (int k = 0; k < p; k++) {
				int m = sc.nextInt();
				int n = sc.nextInt();

				char[][] arr = new char[m][n];

				for (int i = 0; i < m; i++) {
					String input = sc.next();
					for (int j = 0; j < n; j++) {
						arr[i][j] = input.charAt(j);
					}

				}

				int count = 0;

				List<Integer> list = new ArrayList<>();

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						if (arr[i][j] == '#') {
							count++;
							list.add(count);
						}
					}
					count = 0;

				}

				System.out.println(Collections.max(list));

			}

		} finally {
			sc.close();
		}
	}


}
