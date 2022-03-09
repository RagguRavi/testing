package core.java;

import java.text.ParseException;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp15 {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		
		 String regex = "^[\\(]\\d{3}\\)\\s\\d{3}-\\d{4}|\\d{3}\\s\\d{3}\\s\\d{4}|^[\\+]\\d{1}\\s\\d{3}\\s\\d{3}\\s\\d{4}";
		 String input = "+1 727 452 7564";
		 
		 Pattern pattern = Pattern.compile(regex);
		 Matcher	matcher = pattern.matcher(input);
	
		 if(matcher.find()) {
			 System.out.println(matcher.group(0));
			 System.out.println(input.replaceAll("\\(|\\)|\\s|\\+\\d{1}|\\-", ""));
		 } else {
			 System.out.println("No matches");
		 }
		 
		 System.out.println(matcher.groupCount());
//		 System.out.println(matcher. );
	}
}
