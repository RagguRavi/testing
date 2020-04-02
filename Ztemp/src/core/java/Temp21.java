package core.java;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Temp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("");
		
		System.out.println(file.getName());
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MILLISECOND, 9600000);
		
		Date date = new Date(66600000l);
		
		
		System.out.println(date);
		
	}

}
