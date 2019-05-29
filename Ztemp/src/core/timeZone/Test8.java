package core.timeZone;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.joda.time.format.DateTimeFormat;

public class Test8 {
	public static void main(String[] args) {
		String str = "04:30 PM";
		DateTimeFormatter dtf =DateTimeFormatter.ofPattern("hh:mm a");
		LocalDateTime ldt = LocalDateTime.of(LocalDate.now(), LocalTime.parse(str, dtf));
		ZonedDateTime zdt = ldt.atZone(ZoneId.of("US/Eastern"));
		ZoneId zi = ZoneId.of("US/Eastern");
		TimeZone tz = TimeZone.getTimeZone(zi);
		System.out.println(tz.getRawOffset());
		
//		zi = ZoneId.of("Africa/Nairobi");
		 tz = TimeZone.getTimeZone(zi);
		 System.out.println(tz.getRawOffset()+"\t"+zi.getRules());
		 ZonedDateTime zdt2 = ZonedDateTime.now(zi);
		 System.out.println(zdt2.getOffset()+"\t"+zdt2.getZone());
		 String st = "-5:00";
		 ZonedDateTime z = ZonedDateTime.now();
		 
//		System.out.println(zdt);
//		ZonedDateTime zdt1 = zdt.withZoneSameInstant(ZoneId.of("UTC"));
//		System.out.println(zdt1.toLocalTime().format(dtf));
//		System.out.println(ldt);
		
//		System.out.println(convertDateFromUTCToTimeZone("US/Eastern", new Date()));
	}
	
	public static Date convertDateFromUTCToTimeZone(String toTimeZone,Date date) {
		Date convertedDate = null;
		try {
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			String str = sd.format(date);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
			
			ZonedDateTime fromZoneDT = ZonedDateTime.of(localtDateAndTime, ZoneId.of("UTC"));
			ZonedDateTime toZoneDT = fromZoneDT.withZoneSameInstant(ZoneId.of(toTimeZone));
			
			String formattedDate = toZoneDT.format(formatter);
			
			convertedDate = sd.parse(formattedDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return convertedDate;
	}
}
