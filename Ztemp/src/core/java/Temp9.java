package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Temp9 {
	public static void main(String[] args) {
		String date = "3/1/18";
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
		try {
			System.out.println(format.parse(date));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
