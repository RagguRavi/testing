package core.java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter; 

public class Test15 {

	public static void main(String[] args) {
		/*Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR,calendar.get(Calendar.HOUR)+16);
		
//		System.out.println(calendar.get(Calendar.HOUR)+"\t"+calendar.get(Calendar.HOUR_OF_DAY)+"\t"+calendar.get(Calendar.AM_PM));
//		System.out.println(calendar.getTime()+"\t");
		getInt();*/
		
		/*Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.set(Calendar.HOUR_OF_DAY,13);
		calendar.add(Calendar.DAY_OF_MONTH, 21);
		
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(new Date());
		calendar1.set(Calendar.HOUR_OF_DAY,14);
		calendar1.add(Calendar.DAY_OF_MONTH, 21);*/
		
//		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a");
		
//		int a = calendar1.get(Calendar.DAY_OF_YEAR)-calendar.get(Calendar.DAY_OF_YEAR);
//		System.out.println(sdf.format(calendar.getTime())+"\t"+calendar.getTime()+"\t" +a);
//		System.out.println(isValidNotificationTime(calendar.getTime(), "8:00 AM-8:00 PM"));
		/*Date date1 = calendar.getTime();
		Date date2 = calendar1.getTime();
		
		System.out.println("Date 1 :"+date1+"\tDate  :s"+date2);
		
		System.out.println(date1.before(date2));*/
		
		int i = 0;
		while(i <= 50) {
			i++;
			System.out.println(i);
		}
		

	}
	
	public static boolean isValidNotificationTime(Date actualNotificationDate, String notificationTime) {
		System.out.println(actualNotificationDate); 
		LocalTime actualNotificationLocalTime = LocalTime.fromDateFields(actualNotificationDate);
	        String startTimeStr = notificationTime.split("-")[0].trim();
	        String endTimeStr = notificationTime.split("-")[1].trim();

	        DateTimeFormatter formatter = DateTimeFormat.forPattern("hh:mm a");
	        LocalTime startTime = LocalTime.parse(startTimeStr, formatter);
	        LocalTime endTime = LocalTime.parse(endTimeStr, formatter);

	        //actualNotificationLocalTime must be between startTime and endTime
	        if(actualNotificationLocalTime.isBefore(startTime)) {
	            return false;
	        } else if(actualNotificationLocalTime.isAfter(endTime)) {
	            return false;
	        } else {
	            return true;
	        }
	}
	
	static void compare(Long id) {
		List<Long> longList = new ArrayList<>();
		longList.add(new Long(12));
		longList.add(new Long(13));
		longList.add(new Long(14));
		longList.add(new Long(15));
		longList.add(new Long(16));
		
		System.out.println(longList.contains(id));
	}
	
	
	public static int getInt() {
		int i = 0;
		while(true) {
			i++;
			System.out.println(i);
			if(i>5) {
				return i;
			}
		}
		
	}
}
