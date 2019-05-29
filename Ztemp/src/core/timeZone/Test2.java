package core.timeZone;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Test2 {

	/*public static void main(String[] args) {
		System.out.println("main with args[]");
	}*/
	
	public static void main() {
		System.out.println("main without any argument");
		
	}
	
	public static void main(String...args) throws Exception {
		String dateStr = "11/03/2018 09:00 AM";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		sdf.setTimeZone(TimeZone.getTimeZone("EDT"));
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("US/Eastern"));
		
		System.out.println(ZonedDateTime.ofInstant(sdf.parse(dateStr).toInstant(), ZoneId.of("US/Eastern")));
		
		
//		Set<?> set = ZoneId.getAvailableZoneIds();
//		set.forEach(a -> {
//			System.out.println(a);
//		});
		System.out.println(zdt);
//		System.out.println(sdf.parse(dateStr));
		
//		System.out.println(convertDateFromOneTZToAnotherTZ("UTC","EST",sdf.parse(dateStr)));
	}
	static Date convertDateFromOneTZToAnotherTZ(String fromTimeZone,String toTimeZone,Date date) throws Exception {
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
			e.printStackTrace();
		}
		return convertedDate;

	}
	
	static void test1() {
		Date actualScheduledDate = new Date();
		try {
			ZoneId fromTZ = ZoneId.of("UTC");
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			String str = sd.format(actualScheduledDate);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
			
			ZonedDateTime fromZoneDT = ZonedDateTime.of(localtDateAndTime, fromTZ);
			ZonedDateTime toZoneDT = fromZoneDT.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
			
			String formattedDate = toZoneDT.format(formatter);
			
//			actualScheduledDate = formattedDate;
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}
