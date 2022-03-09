package core.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Temp4 {

	public static void main(String[] args) {
		MyDate d1=new MyDate(2, 3);
		List<MyDate> dateList=Arrays.asList(new MyDate(2, 2),new MyDate(4, 8),new MyDate(4, 10),new MyDate(8, 8),new MyDate(2, 1),new MyDate(16, 2));
		
		Set<MyDate> dateSet=new TreeSet<>(dateList);
		dateSet.stream().forEach(date->{
			System.out.println(date);
			
		});
		
	}
	
	static class MyDate implements Comparable<MyDate>
	{
		int day;
		int month;
		public MyDate(int day, int month) {
			super();
			this.day = day;
			this.month = month;
		}
		@Override
		public String toString() {
			return "MyDate [day=" + day + ", month=" + month + "]";
		}
		
		@Override
		public int compareTo(MyDate d) {
			 SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		        try {
					Date date1 = sdf.parse(d.month+"-"+d.day);
					  Date date2 = sdf.parse(this.month+"-"+this.day);
					  
					  if(date2.after(date1))
						  return 1;
					  else if(date2.before(date1))
						  return -1;
					  else if(date2.equals(date1))
					  return 0;
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      
			
			return (this.month-d.month);
		}
		
		@Override
		public int hashCode() {
			System.out.println("hashcode called");
			return super.hashCode();
		}
		@Override
		public boolean equals(Object obj) {
			System.out.println("equals called");
			return super.equals(obj);
		}
	}
}

