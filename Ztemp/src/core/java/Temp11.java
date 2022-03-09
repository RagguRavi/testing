package core.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp11 {
 
	public static void main(String[] args) {
		String str = " 561v267-1725CURRAN COLIN 10-14-2005 980*-2823-8650 4*8*22";
		
		Pattern pattern = Pattern.compile("(\\d{3}v\\d{3}\\-\\d{4})");
		
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			System.out.println(matcher.group(0));
			/*String matchedString = matcher.group(0);
			String monthInArray = null;
			String dayInArray = null;
			String yearInArray = null;
			SimpleDateFormat dateFormat = null;
			
			String[] dateArray = matchedString.split("(\\D{1})");
				
			monthInArray = dateArray[0];
			if(monthInArray.length() == 0) {
				monthInArray = "0" + monthInArray;
			}

			dayInArray = dateArray[1];
			if(dayInArray.length() == 0) {
				dayInArray = "0"+dayInArray;
			}

			yearInArray = dateArray[2];
			if(yearInArray.length() == 2) {
				dateFormat = new SimpleDateFormat("MM/dd/yy");
			} else if(yearInArray.length() == 4) {
				dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			}

			String dateString = monthInArray+"/"+dayInArray+"/"+yearInArray;

			try {
				System.out.println(dateFormat.parse(dateString));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(patient.getDob() == null) {
				if(dateString.matches("((\\d{1}/\\d{2}/\\d{4})|(\\d{2}/\\d{2}/\\d{4})|(\\d{2}/\\d{1}/\\d{4})|(\\d{1}/\\d{1}/\\d{4}))")) {
	    			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    			patient.setDob(dateFormat.parse(dateString));
	    		} else if(dateString.matches("((\\d{1}/\\d{2}/\\d{2})|(\\d{2}/\\d{2}/\\d{2})|(\\d{2}/\\d{1}/\\d{2})|(\\d{1}/\\d{1}/\\d{2}))")) {
	    			SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
	    			patient.setDob(dateFormat.parse(dateString));
	    		}
			}*/
		}
	}
}
