package core.java;

import java.util.Date;

public class Temp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "image/jpeg";
		System.out.println("image".contains(str));
		System.out.println("image");*/
		
		Date date = new Date();
		Date date2 =new  Date(1535717725103l);
		System.out.println(date.getTime());
		
		long diff = (date.getTime() - date2.getTime())/1000;
		System.out.println(diff);

	}

}
