package core.java;

import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
