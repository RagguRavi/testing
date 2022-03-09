package core.java;

import java.util.Scanner;

public class Temp5 {
	public static void main(String[] args) {
		System.out.println("--------Application is started -------------");
		

		while (true) {
			Scanner sc = new Scanner(System.in);
			String string = null;
			System.out.println("INput value :" + string);
			switch (string) {
			case "a": {
				System.out.println("a case");
				break;
			}
			case "b": {
				System.out.println("b case");
				break;
			}
			case "c": {
				System.out.println("c case");
				break;
			}
			case "d": {
				System.out.println("d case");
				break;
			}
			default: {
			System.err.println("default case ");
			}
			}
		}

	}
}
