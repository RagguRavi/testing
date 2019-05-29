package core.java;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

public class Test28 {
	public static void main(String[] args) {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy hh:mm a");
		Date date2 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEE,MMM,mm,yyyy");
		try {
			Date date = sdf1.parse("13/05/2019 11:45 AM");
			
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
			String str = sd.format(date);
			String str2 = sd.format(date2);
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(str, formatter);
			
			LocalDateTime localtDateAndTime2 = LocalDateTime.parse(str2, formatter);
			
			Duration duration = Duration.between(localtDateAndTime, localtDateAndTime2);
			
			
			LocalDate ld1 = LocalDate.parse(str, formatter);
			LocalDate ld2 = LocalDate.parse(str2, formatter);
			
			Period period = Period.between(ld1, ld2);
			System.out.println(period.getYears());
			Long second = duration.getSeconds();
			Long minutes = second/60;
			Long hours =  minutes/60;
			System.out.println(minutes+"\t"+hours);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
