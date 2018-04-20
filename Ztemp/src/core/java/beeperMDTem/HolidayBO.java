package core.java.beeperMDTem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class HolidayBO implements Comparable<HolidayBO>{
	String id;
	
	int day;

	int month;

	Integer year;
	
	String name;

	String createdBy;
	public HolidayBO(){}

	public HolidayBO(String id,int day, int month,String name) {
		this.id=id;
		this.day = day;
		this.month = month;
		this.name = name;
	}

	public HolidayBO(String id,int day, int month, Integer year, String name, String createdBy) {
		this.id=id;
		this.day = day;
		this.month = month;
		this.year = year;
		this.name = name;
		this.createdBy = createdBy;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int compareTo(HolidayBO holidayBO) {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		try {
			Date date1 = sdf.parse(holidayBO.month+"-"+holidayBO.day);
			Date date2 = sdf.parse(this.month+"-"+this.day);

			if(date2.after(date1)) {
				return 1;
			}
			else if(date2.before(date1)) {
				return -1;
			}
			else if(date2.equals(date1)) {
				return 0;
			}
		} catch (ParseException e) {
			System.out.println(e);
		}
		return 0;
	}

	public String toString() {
		return "HolidayBO [id=" + id + ", day=" + day + ", month=" + month + ", year=" + year + ", name=" + name
				+ ", createdBy=" + createdBy + "]";
	}

}
