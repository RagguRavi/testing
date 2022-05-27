package core.algo.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.joda.time.Hours;

import java.util.Scanner;

public class HackerEarchSolutions {

	public static void main(String[] args) {
		splitHouse();
		
//		System.out.println((int)(Math.pow(10,9) + 7));
	}
	
	public static void splitHouse() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String houses = sc.next();
		
		houses = houses.replace(".", "B");
		
		if(houses.contains("B")) {
			
			int count = 0;
			char chars[] = houses.toCharArray();
			for(char ch: chars) {
				if(ch == 'H') {
					count++;
				} else {
					count =0;
				}
				
				if(count >1 ) {
					System.out.println("NO");
					break;
				}
			}
			
			if(count == 0 || count == 1) {
				System.out.println("YES");
				System.out.println(houses);
			}
		} else {
			if(houses.contains("H") && houses.length() == 1) {
				System.out.println("YES");
				System.out.println(houses);
			} else {
				System.out.println("NO");
			}
		}
	}
	
	public static void noOfSteps() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int minNumber = Integer.MAX_VALUE;
		int arr1[] = new int[size];
		int minimumIndex = -1;
		for(int i=0;i<size;i++) {
			int no = sc.nextInt();
			arr1[i] = no;
			if(no < minNumber) {
				minNumber = no;
				minimumIndex = i;
			}
			
		}
		
		int arr2[] = new int[size];
		for(int i=0;i<size;i++) {
			arr2[i] = sc.nextInt();
		}
		
		int count = 0;
		for(int i=0;i<size;i++) {
			int tempNo = arr1[i];
			if(tempNo>minNumber) {
				while(tempNo > minNumber) {
					count++;
					tempNo = tempNo - arr2[i];
				}
				
				if(tempNo != minNumber) {
					
					if(tempNo == (arr1[minimumIndex] - arr2[minimumIndex])) {
						minNumber = arr1[minimumIndex] - arr2[minimumIndex];
					} else {
						System.out.println(-1);
						return;
					}
				} 
				
				arr1[i] = tempNo;
			}
		}
		
		System.out.println(count);
		
	}
	public static void moduloStrength() {
		Scanner sc = new Scanner(System.in);
		int noOfStudents = sc.nextInt();
		int specialValue = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<noOfStudents;i++) {
			int mod = sc.nextInt()%specialValue;
			
			if(map.containsKey(mod)) {
				map.put(mod, map.get(mod)+1);
			} else {
				map.put(mod, 1);
			}
		}
		long asnwer = 0;
		for(Entry<Integer, Integer> entry:map.entrySet()) {
			long temp = entry.getValue();
			asnwer = asnwer + (temp * (temp-1));
		}
		
		System.out.println(asnwer);
		sc.close();
	}
	
	public static void toggleString() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(char ch:arr) {
			if(ch >=65 && ch<=90) { //For upper case
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(Character.toUpperCase(ch));
			}
		}
		
		System.out.println(sb.toString());
	}
	public static void findProduct() {
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		long answer = 1;
		
		long mod = (long)(Math.pow(10,9) + 7);
		for(int i=0;i<no;i++) {
			int val = sc.nextInt();
			answer = (answer%mod * val%mod) % mod;
		}
		
		System.out.println(answer);
		
	}
	
	public static void uploadProfilePic() {
		Scanner sc = new Scanner(System.in);
		int minimumDimension = sc.nextInt();
		int testCases = sc.nextInt();
		
		for(int i=0;i<testCases;i++) {
			int width = sc.nextInt();
			int height = sc.nextInt();
			
			if(width == height & width >= minimumDimension) {
				System.out.println("ACCEPTED");
			}else if(width < minimumDimension || height < minimumDimension) {
				System.out.println("UPLOAD ANOTHER");
			} else if(width > minimumDimension || height > minimumDimension) {
				System.out.println("CROP IT");
			}
		}
	}
	
	
	public static void aliAndHelpingPeople() {
		Scanner sc = new Scanner(System.in);
		List<Character> chars = Arrays.asList('A','E','I','O','U','Y');
		
		String str = sc.nextLine();
		
		String arr[] = str.split("");
		
		int firstNo = Integer.parseInt(arr[0]);
		int secondNo = Integer.parseInt(arr[1]);
		
		if((firstNo+secondNo) % 2 == 0) {
			 Character char1 = arr[2].charAt(0);
			 if(chars.contains(char1)) {
				 int forthNo = Integer.parseInt(arr[3]);
				 int fifthNo = Integer.parseInt(arr[4]);
				 int sixthNo = Integer.parseInt(arr[5]);
				 
				 if((forthNo+fifthNo) % 2 ==0 && (fifthNo+sixthNo) % 2 == 0) {
					 int eighthNo = Integer.parseInt(arr[7]);
					 int ninethNo = Integer.parseInt(arr[8]);
					 if((eighthNo+ninethNo) % 2 ==0 ) {
						 System.out.println("valid");
					 } else {
						 System.out.println("invalid");
					 }
				 } else {
					 System.out.println("invalid");
				 }
			 } else {
				 System.out.println("invalid");
			 }
		} else {
			System.out.println("invalid");
		}
		
		sc.close();
		
	}
	public static void costOfBallons() {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		
		for(int i=0;i<testCases;i++) {
			int purpleCost = sc.nextInt();
			int greenCost = sc.nextInt();
			int users = sc.nextInt();
			
			int problem1Count = 0;
			int problem2Count = 0;
			for(int j=0;j<users;j++) {
				problem1Count += sc.nextInt();
				problem2Count += sc.nextInt();
			}

			int totalCost = 0;
			if(problem1Count >= problem2Count) {
				totalCost = (greenCost > purpleCost ? greenCost:purpleCost)*problem2Count + (greenCost < purpleCost ? greenCost:purpleCost)*problem1Count;
			} else {
				totalCost = (greenCost > purpleCost ? greenCost:purpleCost)*problem1Count + (greenCost < purpleCost ? greenCost:purpleCost)*problem2Count;
			}
			
			System.out.println(totalCost);
			StringBuffer sb = new StringBuffer("");
			sb.reverse();
			
		}
	}

}
