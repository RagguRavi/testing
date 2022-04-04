package core.java1;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class Test10 {
	public static void main(String []args) {
		DayOfWeek dayOfWeek = DayOfWeek.of(7);
		
		String name = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
		System.out.println(name);;
		
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_WEEK, dayOfWeek.getValue()+1);
		
		Date from = cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, 6);
		Date to = cal.getTime();
		
		System.out.println(from+"         "+to);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(sdf.format(from)+"\t"+sdf.format(to));
		
		LocalDate lt1 = LocalDate.parse(sdf.format(from), formatter);
		LocalDate lt2 = LocalDate.parse(sdf.format(to), formatter);
		
		System.out.println(lt1+"\t"+lt2);
	}
}
