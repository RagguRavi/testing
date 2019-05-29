package core.java;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Temp28 {
	public static void main(String[] args) throws Exception{
		Calendar cal = Calendar.getInstance();
		
//		cal.get(Calendar.da)
		String str = "ravikumar @beepermd.com+";
		/*String str2 = str.replaceAll("\\s","_");
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
		
		String regex = "[0-9\\s_]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("text_2");
		String resultedTenantIdentifier = matcher.replaceAll("").toLowerCase();
		System.out.println(resultedTenantIdentifier);
		*/
		str = "04:00 PM";
		
		str = "15/07/1995";
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
//		LocalTime lt = LocalTime.parse(str, dtf);
//		System.out.println(lt);
//		sdf.fo
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/YYYY");
//		Date date = sdf1.parse(str);
//		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
//		
//		
//		System.out.println(sdf.format(date));
		
		System.out.println(170/60);
		System.out.println(170%60);
		
	}
}
