package core.timeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class Test7 {
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test4();
	}
	
	public static void test1() {
		String dateStr = "11/03/2018 09:00 PM";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		try {
			Date date = sdf.parse(dateStr);
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			
			LocalDateTime ldt = LocalDateTime.parse(dateStr, dtf);
			System.out.println(ldt);
			
			ldt = ldt.plus(3, ChronoUnit.DAYS);
			
			
			ZonedDateTime zdt = ldt.atZone(ZoneId.of("UTC"));
			System.out.println(zdt.withZoneSameInstant(ZoneId.of("US/Eastern")));
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test3() {
		String dateStr = "11/03/2019 12:00 AM";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
		
		LocalDateTime ldt = LocalDateTime.parse(dateStr, dtf);
		System.out.println(ldt);
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("UTC"));
	
		System.err.println(zdt.withZoneSameInstant(ZoneId.of("US/Eastern")));
		
		zdt = zdt.minus(3, ChronoUnit.DAYS);
		
		System.err.println(zdt.withZoneSameInstant(ZoneId.of("US/Eastern")));
		
	}
	
	public static void test2() {
		String dateStr = "11/03/2018 09:00 PM";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");

		ZoneId zi = ZoneId.of("US/Eastern");
		TimeZone tz = TimeZone.getTimeZone(zi);
		
		boolean isDST;
		try {
			isDST = tz.inDaylightTime(sdf.parse(dateStr));
			System.out.println(isDST);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test4() {
		String dateStr = "11/03/2019 01:00 AM";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
		
		LocalDateTime ldt = LocalDateTime.parse(dateStr, dtf);
		System.out.println(ldt);
		
		ldt = ldt.minus(1, ChronoUnit.DAYS);
		
		System.out.println(ldt);
		
		System.out.println();
	}
}
