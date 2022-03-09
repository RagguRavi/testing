package core.timeZone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Set;

public class Test9 {
	public static void main(String[] args) {
		Date date = Date.from(LocalDateTime.now().atZone(ZoneId.of("EST5EDT")).toInstant());
		System.out.println(date);
		printAllTimeZones();
	}
	
	
	public static void printAllTimeZones() {
		Set<String> zones =  ZoneId.getAvailableZoneIds();
		zones.forEach(zone -> {
			System.out.println(zone);
		});
	}
}
