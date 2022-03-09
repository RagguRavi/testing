package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Temp14 {

	public static void main(String[] args) throws ParseException {
		/*// TODO Auto-generated method stub
			A14 a1 = new A14(1,"Nitin");
			A14 a2 = new A14(2,"Manish");
			A14 a3 = new A14(3,"Lovedeep");
			A14 a4 = new A14(4,"Mahipal");
			A14 a5 = new A14(5,"Ramesh");
			A14 a6 = new A14(6,"Sachin");
			A14 a7 = new A14(7,"Ravi");
			
			A14[] array = {a1,a2,a3,a4,a5,a6,a7};
			List<A14> list = Arrays.asList(array);
			
			list.stream().sorted((a,b) ->{
				return b.name.compareTo(a.name);
			});
		
			System.out.println(list);*/
		Date date = new Date(); 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
//		calendar.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(calendar.getTime());
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy hh:mm a"); 
		String formattedDate = df.format(calendar.getTime()); 
		System.out.println(formattedDate);
//		System.out.println(calendar);
		/*TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		LocalDate localDate = LocalDate.now();
		localDate = localDate.plusDays(14);
		Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());*/
		
	}

}

class A14 {
	int id;
	String name;
	
	public A14(int id , String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+"\t"+name;
	}
}