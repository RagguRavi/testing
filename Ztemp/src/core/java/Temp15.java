package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp15 {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		
		 String regex = "^[a-zA-Z0-9\\s'_.-]+$";
		 String input = "Lisa Jacquin";
		 
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(input);
	
		 if(matcher.find()) {
			 System.out.println(matcher.group(0));
		 } else {
			 System.out.println("No matches");
		 }
		 
		 System.out.println(matcher.groupCount());
//		 System.out.println(matcher. );
	}
}
