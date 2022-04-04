package core.java1;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Test13 {

	public static void main(String[] args) {
		try {
			int day = 5;
			DayOfWeek dayOfWeek = DayOfWeek.of(Integer.valueOf(day));
			Calendar cal = Calendar.getInstance();

			cal.set(Calendar.DAY_OF_WEEK, dayOfWeek.getValue()+2);
			LocalDate from = converDateToLocalDate(cal.getTime());
			cal.add(Calendar.DAY_OF_YEAR, 6);
			LocalDate to = converDateToLocalDate(cal.getTime());
			

			System.out.println(String.format("From : %s and To: %s and dayof week: %s", from,to,dayOfWeek));
			
			LocalTime lt = LocalTime.parse("08:00", DateTimeFormatter.ofPattern("HH:mm"));
			Calendar cal1 = Calendar.getInstance();
			cal1.set(Calendar.DAY_OF_WEEK, Integer.valueOf(day+2));
			SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, MMM dd, yyyy");
			String deadLineDateStr = sdf1.format(cal1.getTime())+" before "+lt.format(DateTimeFormatter.ofPattern("hh:mm a"));
			
			System.out.println(deadLineDateStr);
			System.out.println(new Date());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static LocalDate converDateToLocalDate(Date date) {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 return LocalDate.parse(sdf.format(date), formatter);
	 }

}
