package core.java;

import java.util.Calendar;
import java.util.Date;

public class Temp19 {
public static void main(String[] args) {
	Calendar calendar = Calendar.getInstance();
	calendar.add(Calendar.MINUTE, -2);
	
	Date date = calendar.getTime();
	System.out.println(date+"\t"+System.currentTimeMillis());
	
	System.out.println((date.getTime() - System.currentTimeMillis()));
}
}
