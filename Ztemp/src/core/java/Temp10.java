package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp10 {

	public static void main(String[] args) {
		String name = "MANOLAKOS DEMETRI 12/15/1995 DEMETRI";
		System.out.println(name);
		try {
			String result = setDobFromName(name);
			 String[] patientNameSplitted = result.split(" ");
			 System.out.println(Arrays.asList(patientNameSplitted));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String setDobFromName(String nameString) throws Exception {
		Pattern pattern = Pattern.compile("((\\d{1,2}/\\d{1,2}/\\d{4})|(\\d{1,2}/\\d{1,2}/\\d{2}))");
		Matcher matcher = pattern.matcher(nameString);
		
		if(matcher.find()) {
			String dateString = matcher.group(0);
			nameString = nameString.replace(dateString+" ", "");
			if(dateString.matches("((\\d{1}/\\d{2}/\\d{4})|(\\d{2}/\\d{2}/\\d{4})|(\\d{2}/\\d{1}/\\d{4})|(\\d{1}/\\d{1}/\\d{4}))")) {
    			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    			System.out.println(dateFormat.parse(dateString));
    		} else if(dateString.matches("((\\d{1}/\\d{2}/\\d{2})|(\\d{2}/\\d{2}/\\d{2})|(\\d{2}/\\d{1}/\\d{2})|(\\d{1}/\\d{1}/\\d{2}))")) {
    			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    			System.out.println(dateFormat.parse(dateString));
    		}
		}
		
		return nameString;
	}
}
