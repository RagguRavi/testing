package core.java;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.ZoneId;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Temp23 {

	public static void main(String[] args) {
		double d1 = 92.4975;
		
		System.out.println(getRoundOfStr(d1));
		
		System.out.println(getRoundOfStr1(d1));
		
		Set<String> ids = ZoneId.getAvailableZoneIds();
		
		Set<String>  ids1 = ids.stream().sorted((s1,s2) -> {
			return s2.compareToIgnoreCase(s1);
		}).collect(Collectors.toSet());
		
		for (String id : ids1) {
			if(id.contains("US")) {
				System.out.println(displayTimeZone(TimeZone.getTimeZone(id)));
			}
		}
		
		System.out.println("\nTotal TimeZone ID " + ids.size());
	}
	
	public static String getRoundOfStr(double value) {
		double two_decimal_value = Math.round(value*100.0)/100.0;
		return Double.toString(two_decimal_value);
	}
	
	private static String displayTimeZone(TimeZone tz) {

		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset()) 
                                  - TimeUnit.HOURS.toMinutes(hours);
		// avoid -4:-30 issue
		minutes = Math.abs(minutes);

		String result = "";
		if (hours > 0) {
			result = String.format("(GMT+%d:%02d) %s", hours, minutes, tz.getID());
		} else {
			result = String.format("(GMT%d:%02d) %s", hours, minutes, tz.getID());
		}

		return result;

	}
	
	public static String getRoundOfStr1(double value) {
		BigDecimal bd = new BigDecimal(Double.toString(value));
		return bd.round(new MathContext(5)).toString();
	}

}
