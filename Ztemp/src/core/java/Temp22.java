package core.java;

import java.time.ZoneId;
import java.util.Date;

import org.joda.time.Months;

public class Temp22 {
	public static void main(String []args) {
		System.out.println(getRoundOfStr(338.3856));
		
		System.out.println(ZoneId.systemDefault());
		
		Date d1 = new Date();
		Date d2 = new Date(2003, 4, 15);
		
		int a = Months.monthsBetween(
				new org.joda.time.LocalDate(d1.getTime()), new org.joda.time.LocalDate(d2.getTime()))
				.getMonths();
		
		System.out.println(a);
	}
	
	public static String getRoundOfStr(double value) {
		double two_decimal_value = Math.round(value*100.0)/100.0;
		return Double.toString(two_decimal_value);
	} 	
}
