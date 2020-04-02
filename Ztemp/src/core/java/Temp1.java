package core.java;

import java.util.regex.Pattern;

public class Temp1 {
	private static String PHONE_NUMBER_PATTERN = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";
	public static void main(String[] args) {

		String phoneNumber = "(980) 288-3865";
		
		
		if(Pattern.matches(PHONE_NUMBER_PATTERN, phoneNumber)) {
			
			String str = phoneNumber.replaceAll("[()\\s-]", "");
			System.out.println(str);
		
		}



	}
}
