package core.timeZone;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
//		test1();
//		test2(new Date());
		isValidNotificationTime3();
	}
	
	public static void test1() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
	}
	
	public static void test2(Date date) {
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		String str = sd.format(date);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
		LocalDate localtDate = LocalDate.parse(str, formatter);
		
		System.out.println(localtDate.getDayOfMonth()+"\t"+localtDate.getMonthValue()+"\t"+localtDate.getYear());
		
		System.out.println(localtDate);
	}
	
	public static void isValidNOtificationTime() {
		String notificationTime = "08:00 AM - 08:00 PM";
		 String startTimeStr = notificationTime.split("-")[0].trim();
	     String endTimeStr = notificationTime.split("-")[1].trim();
	     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
	     /*dtf.withZone(ZoneId.of("Asia/Kolkata"));*/
	     
	     LocalTime startTime = LocalTime.parse(startTimeStr, dtf);
//	     startTime.
	     LocalTime endTime = LocalTime.parse(endTimeStr, dtf);
	     
	     System.out.println(startTime+"\t"+endTime);
	}
	
	public static void isValidNotificationTime2() {
		String notificationTime = "dd/MM/yyyy hh:mm a";
		String startTimeStr = notificationTime.split("-")[0].trim();
	    String endTimeStr = notificationTime.split("-")[1].trim();
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
	    LocalDate date = LocalDate.now();
	    LocalTime startTime = LocalTime.parse(startTimeStr, dtf);
	    LocalTime endTime = LocalTime.parse(endTimeStr, dtf);
	    
	    LocalDateTime startLdt = LocalDateTime.of(date, startTime);
	    LocalDateTime endLdt = LocalDateTime.of(date, endTime);
	    
	    System.out.println(startLdt+"\t"+endLdt);
	    
//	    startLdt.
	     
	}
	
	public static void isValidNotificationTime3() {
		String notificationTime = "31/12/2018 12:00 PM";
	    SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
	    
	    try {
			Date date = convertDateFromOneTZToAnotherTZ("Asia/Kolkata", "UTC", sd.parse(notificationTime));
			date.getTime();
			
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	}
	
	public static Date convertDateFromOneTZToAnotherTZ(String fromTimeZone,String toTimeZone,Date date) {
		Date convertedDate = null;
		try {
			ZoneId fromTZ = ZoneId.of(fromTimeZone);
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			String str = sd.format(date);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
			
			ZonedDateTime fromZoneDT = ZonedDateTime.of(localtDateAndTime, fromTZ);
			ZonedDateTime toZoneDT = fromZoneDT.withZoneSameInstant(ZoneId.of(toTimeZone));
			
			String formattedDate = toZoneDT.format(formatter);
			
			convertedDate = sd.parse(formattedDate);
		} catch (Exception e) {
//			LOGGER.error("Error in converting date from"+fromTimeZone+" to "+toTimeZone+" Where date is"+date);
		}
		
		return convertedDate;

	}
}
