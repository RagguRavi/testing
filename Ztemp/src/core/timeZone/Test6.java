package core.timeZone;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import org.joda.time.LocalTime;

public class Test6 {
	public static void main(String[] args) {
		test2();
//		zonedTest();
	}
	
	public static void test1() {
		LocalTime localTime = new LocalTime(13,00);
		 TimeZone tz = TimeZone.getTimeZone(ZoneId.of("US/Eastern"));
		 System.out.println(tz.getRawOffset());
		    
		System.out.println(localTime);
	}
	
	public static void zonedTest() {
		String str="08:00 PM";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
		LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
		
		System.out.println(localtDateAndTime.getHour());
//		ZonedDateTime fromZoneDT = ZonedDateTime.of(localtDateAndTime, fromTZ);
//		ZonedDateTime toZoneDT = fromZoneDT.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(arg0)
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(zdt.withZoneSameInstant(ZoneId.of("UTC")));
		
//		zoned
		
//		zdt.
	}
	
	public static void test2() {
		String str = "10/03/2019 06:00 AM";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		try {
			Date resultDate = Test2.convertDateFromOneTZToAnotherTZ("UTC", "EST5EDT", sdf.parse(str));
			System.out.println(resultDate);
			System.out.println(sdf.format(resultDate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
