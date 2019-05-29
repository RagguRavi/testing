package core.java;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Temp23 {
public static void main(String[] args) {
	/*int i=1;
	while(true) {
		System.out.println(i);
		if(++i == 50) {
			break;
		}
	}*/
	/*LocalDate ld = LocalDate.now();
	Date date = Date.from(ld.atStartOfDay(ZoneId.of("UTC")).toInstant());
	System.out.println(date);
	
	int a = 2+12/3*2%2+3;
	System.out.println(a);*/
	System.out.println("one".equals(myEnum.one.name()));
}
}

enum myEnum{
	one,two,three
	
}