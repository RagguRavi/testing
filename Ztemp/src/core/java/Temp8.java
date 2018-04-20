package core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp8 {
	public static String PHONE_PREFIX = "+91";
	
	public static void main(String[] args) {
		String str = "12/11/2012@lvm 305-733-6762*appmnt rschldmom given";
		System.out.println(filterPhonesFromNotes(str));
	}
	
	public static String formatPhoneNumber(String phoneNumber) {
		if(phoneNumber != null && !"".equals(phoneNumber)) {
			String formattedPhoneNumber = phoneNumber;
			try {
				String regexToBeReplaced = "(\\D)";
				formattedPhoneNumber = formattedPhoneNumber.replaceAll(regexToBeReplaced, "");
				System.out.println(formattedPhoneNumber);

			}
			catch(Exception e) {
				System.out.println("Exception while formatting the Phone number "+phoneNumber+":"+ e);
			}
			return formattedPhoneNumber;
		} else {
			return null;
		}
	}
	
	public static List<String> filterPhonesFromNotes(String str){
		List<String> phoneList = new ArrayList<>();
		String regex = "(\\d{3}\\D\\d{3}\\D\\d{4})|(\\d{2}\\s\\d{3}-\\d{5})|(\\d{6}-\\d{4})|(\\d{3}-\\d{7})|(\\d{10})|(\\d{1}\\D\\d{2}\\D\\d{3}-\\d{4})|(\\d{3}\\s\\d{7})";
		String regexToBeReplaced = "(\\D)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while(matcher.find()) {
			phoneList.add(matcher.group(0).replaceAll(regexToBeReplaced, ""));
		}
		return phoneList;
	}
}

