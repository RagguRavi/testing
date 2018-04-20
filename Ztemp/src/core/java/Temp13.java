package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp13 {
	public static void main(String[] args) throws ParseException {
		String one = "((\\d{1,2}\\s\\d{1,2}\\s\\d{4})|(\\d{1,2}\\s\\d{1,2}\\s\\d{2}))";
		String two = "((\\d{1,2}\\-\\d{1,2}\\-\\d{4})|(\\d{1,2}\\-\\d{1,2}\\-\\d{2}))";
		String three = "((\\d{1,2}\\/\\d{1,2}\\/\\d{4})|(\\d{1,2}\\/\\d{1,2}\\/\\d{2}))";
		String four = "((\\d{1,2}\\=\\d{1,2}\\=\\d{4})|(\\d{1,2}\\=\\d{1,2}\\=\\d{2}))";
		String five = "((\\d{1,2}\\.\\d{1,2}\\.\\d{4})|(\\d{1,2}\\.\\d{1,2}\\.\\d{2}))";
		String six = "((\\d{1,2}\\*\\d{1,2}\\*\\d{4})|(\\d{1,2}\\*\\d{1,2}\\*\\d{2}))";
		
		StringBuffer dateRegex = new StringBuffer();
		dateRegex.append(one+"|"+two+"|"+three+"|"+four+"|"+five+"|"+six);
		String nameString = "6/4/7";
		Pattern pattern = Pattern.compile(dateRegex.toString());
		Matcher matcher = pattern.matcher(nameString);
		while(matcher.find()) {
			System.out.println(matcher.group(0));
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
			
		}
		
		
		
	}
}
