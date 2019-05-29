package core.timeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class Test5 {
	public static void main(String[] args) {
//		test1();
		String dateStr = "03/10/2019 08:00 AM";
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		try {
			Date date = Test2.convertDateFromOneTZToAnotherTZ("US/Eastern", "UTC", sd.parse(dateStr));
			System.out.println(sd.format(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void test1() {
		String notificationTime = "08:00 AM - 08:00 PM";
		String startTimeStr = notificationTime.split("-")[0].trim();
	    String endTimeStr = notificationTime.split("-")[1].trim();
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
	    
	    LocalTime startTime = LocalTime.parse(startTimeStr, dtf);
	    LocalTime endTime = LocalTime.parse(endTimeStr, dtf);
	   
	   /* Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.HOUR_OF_DAY , startTime.getHour());
	    cal.set(Calendar.MINUTE,startTime.getMinute());*/
//	    System.out.println(cal.getTime());
	    
	    TimeZone tz = TimeZone.getTimeZone(ZoneId.of("US/Eastern"));
	    System.out.println(tz.getRawOffset());
	    
	    startTime = startTime.minus(18000000, ChronoUnit.MILLIS);
	    endTime = endTime.minus(18000000, ChronoUnit.MILLIS);
	    System.out.println(startTime+"\t"+endTime);
	}
	
	public static void test2() {
		org.joda.time.LocalTime temLocalTime = new org.joda.time.LocalTime(13, 0);
		 TimeZone tz = TimeZone.getTimeZone(ZoneId.of("Asia/Kolkata"));
//		 temp
	}
}
