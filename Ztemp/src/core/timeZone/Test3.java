package core.timeZone;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class Test3 {
	public static void main(String[] args) throws Exception {
		String dateStr = "11/03/2018 02:30 AM";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
		
//		test1();//US/Eastern
		convertDateFromOneTZToAnotherTZ("Asia/Kolkata", "US/Eastern", new Date());
	}

	public static void test() {
		try {
			String dateStr = "11/03/2018 09:00 AM";
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

			System.out.println(sdf.parse(dateStr));
			// ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zone)
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void test1() {
		try {
			ZoneId australia = ZoneId.of("US/Eastern");
			String str = "11/03/2018 03:00 AM";
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
			ZonedDateTime dateAndTimeInSydney = ZonedDateTime.of(localtDateAndTime, australia);

			System.out.println("Current date and time in a particular timezone : " + dateAndTimeInSydney);

			ZonedDateTime utcDate = dateAndTimeInSydney.withZoneSameInstant(ZoneOffset.UTC);

			System.out.println("Current date and time in UTC : " + utcDate);

		} catch (Exception e) {
			
		}
	}

	static Date convertDateFromOneTZToAnotherTZ(String fromTimeZone, String toTimeZone, Date date){

		Date resultedDate = null;
		try {
			ZoneId fromTZ = ZoneId.of(fromTimeZone);
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			String str = sd.format(date);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
			
			ZonedDateTime fromZoneDT = ZonedDateTime.of(localtDateAndTime, fromTZ);
			ZonedDateTime toZoneDT = fromZoneDT.withZoneSameInstant(ZoneId.of(toTimeZone));
			
			String fromatted = toZoneDT.format(formatter);
			
			
			resultedDate = sd.parse(fromatted);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
		return resultedDate;

	}
	
	/*System.out.println("date and time in : "+fromTimeZone+"\t is "+ fromZoneDT);
	System.out.println("date and time in timezone : "+toTimeZone+"\t" + toZoneDT);	*/
				
}
