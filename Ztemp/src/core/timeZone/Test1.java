package core.timeZone;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;
import java.util.TimeZone;

public class Test1 {
	public static void main(String[] args) {
//		localDateTime();
//		timeZone();
//		conversion();
		
//		conversion2();
		convertFromOneTimeZoneToAnother(ZoneId.of("Etc/GMT+12"),ZoneId.of("America/Los_Angeles"),LocalDateTime.now());
		
	}
	
	static void localDateTime() {
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1.plus(3,ChronoUnit.DAYS));
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
	}
	static void timeZone() {
		ZoneId zi = ZoneId.systemDefault();
		System.out.println(zi);
		System.out.println(zi.getRules());
		System.out.println(zi.getId());
		
		ZoneId fromString = ZoneId.of("America/Grand_Turk");
		System.out.println("Zone id from string: "+fromString.getRules());
		
		
		System.out.println("============================================");
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		System.out.println(zdt.getOffset());
	}
	
	static void conversion() {
		Date date = new Date();
		System.out.println("Current System time: "+date);
		
		Instant instant = date.toInstant();
		System.out.println("UTC time: "+instant);
		
		ZoneId fromString = ZoneId.of("America/Nome");
		LocalDateTime ldt = LocalDateTime.ofInstant(instant, fromString);
		System.out.println("Converted time of timezone: "+ldt);
	}	
	
	static void convertFromOneTimeZoneToAnother(ZoneId from,ZoneId to,LocalDateTime localDateTime) {
		LocalDateTime ldt= localDateTime;
		ZonedDateTime zdt1 = ldt.atZone(from);
		System.out.println(zdt1);
		System.out.println("================================================================");
		System.out.println(zdt1.withZoneSameInstant(to));
		/*ZonedDateTime zonedDateTime = localDateTime.atZone(to);
		System.out.println("Time of from timezone: "+from.getId()+" is "+localDateTime+"\t and in to timezone: "+to.getId() +" time is:"+zonedDateTime.toLocalDateTime());*/
	}
	
	static void conversion2() {
		Date date = new Date();
		
		ZonedDateTime zdt = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		
		LocalDateTime ldt= LocalDateTime.now();
		ZonedDateTime zdt1 = ldt.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(ldt+"\t"+zdt1);
		System.out.println("================================================================");
		System.out.println(zdt1.withZoneSameInstant(ZoneId.of("America/New_York")));
//		System.out.println(zdt);
		
	}
}
