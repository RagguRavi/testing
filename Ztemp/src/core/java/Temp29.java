package core.java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Temp29 {

	public static void main(String[] args) {
		try {
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
		
		
		String str = dtfDate.format(ld)+" "+dtf.format(lt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy hh:mm a");
		System.out.println(ld+" "+lt);
		
		System.out.println(sdf.parse(str));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
