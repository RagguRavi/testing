package core.algo.simple;

import java.util.Scanner;

class TestClass {

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);

		long testCases = s.nextInt();
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

}