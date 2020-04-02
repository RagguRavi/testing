package core.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp19 {
public static void main(String[] args) {
	/*Calendar calendar = Calendar.getInstance();
	calendar.add(Calendar.MINUTE, -2);
	
	Date date = calendar.getTime();
	System.out.println(date+"\t"+System.currentTimeMillis());
	
	System.out.println((date.getTime() - System.currentTimeMillis()));
	Pattern pat = Pattern.compile("[.]");

	Matcher matcher = pat.matcher("234");
	System.out.println(matcher.matches());*/
	/*Object obje = null;
	Integer intt = (Integer)null;
	System.out.println(intt);
	double d  = 333444.5553;
	System.out.println((long)d);*/
//	System.out.println((10%2) == 0);
	/*try {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	Date date1 = sdf.parse("02/07/2018");
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(date1);
	calendar.add(Calendar.DAY_OF_MONTH, -7);
	
	Date date2 = new Date();

//	final DayOfWeek firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek();
	System.out.println(calendar.getFirstDayOfWeek()+"\t"+Calendar.SUNDAY+'\t'+Calendar.MONDAY);
	System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	System.out.println(calendar.getTime());
	} catch (Exception e) {
		System.out.println(e);
	}*/
	
	List<String> list = new ArrayList<>(Arrays.asList("aaa","bbb","cccc","dddd"));
	list.remove(1);
	System.out.println(list);
	
	Double d = 1234.56788;
	
	System.out.println(Math.ceil(d*100)/100);
	System.out.println(Math.round(d));
	
	Long duration = 260l;
	System.out.println(duration/60);
	System.out.println(duration%60);
}
}
