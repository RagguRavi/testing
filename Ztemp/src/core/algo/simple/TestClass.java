package core.algo.simple;
import java.io.*;

import java.util.*;

public class TestClass {

	public static void main(String[] args) throws IOException {

		Scanner s = new Scanner(System.in);
		int rem = 0, no;
		int N = s.nextInt();
		for (int i = 0; i < N; i++) {
			no = s.nextInt();
			if (i < N / 2) {
				while (true) {
					if (no / 10 == 0)
						break;
					else
						no = no / 10;
				}

			} else {
				no = no % 10;
			}
			rem = (rem * 10 + no) % 11;
		}
		if (rem == 0)
			System.out.println("OUI");
		else
			System.out.println("NON");
	}

}