package core.timeZone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Test9 {
	public static void main(String[] args) {
		Date date = Date.from(LocalDateTime.now().atZone(ZoneId.of("EST5EDT")).toInstant());
		System.out.println(date);
	}
}
