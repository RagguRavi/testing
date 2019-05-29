package core.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp25 {

	public static void main(String[] args) {
		String tenantIdentifier = "  2343 Ravi  23424 Kumar  ";
		System.out.println(getTenantidentifier(tenantIdentifier));
	}
	
	private static  String getTenantidentifier(String clientName) {
		
		String regex = "[0-9\\s]+";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(clientName);
		
		
		return matcher.replaceAll("");
	}
}
