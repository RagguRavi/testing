package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Temp22 {
	public static void main(String[] args) {
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy hh:mm a");
		String str = "12/01/2019 10:00 AM";
		try {
			Date d2 = sdf.parse(str);
			System.out.println(d1.compareTo(d2));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
