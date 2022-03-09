package core.java;

import java.util.concurrent.TimeUnit;

public class Temp23 {
public static void main(String[] args) {
	/*int i=1;
	while(true) {
		System.out.println(i);
		if(++i == 50) {
			break;
		}
	}*/
	/*LocalDate ld = LocalDate.now();
	Date date = Date.from(ld.atStartOfDay(ZoneId.of("UTC")).toInstant());
	System.out.println(date);
	
	int a = 2+12/3*2%2+3;
	System.out.println(a);*/
//	System.out.println("one".equals(myEnum.one.name()));
	
	
	/*
	 * final List<String> timeZonesInUS = Stream.of(TimeZone.getAvailableIDs())
	 * .collect(Collectors.toList());
	 * 
	 * System.out.println(timeZonesInUS);
	 * 
	 * for (String str : timeZonesInUS) { System.out.print("'" + str + "',"); }
	 * 
	 * 
	 * Calendar cal = Calendar.getInstance(); cal.setTime(new Date());
	 * 
	 * int dow = cal.get(Calendar.DAY_OF_WEEK);
	 */
	
//	DayOfWeek d = DayOfWeek.of(7);
	System.out.println(TimeUnit.SECONDS.toMinutes(400l));
	
	String test = "this is testing for the ";
	System.out.println(getAddress("6829 Dove Cross Loop, Lakeland, FL 33810"));
}

private static AddressBO getAddress(String address) {
	AddressBO bo = null;
	try {
		bo = new AddressBO();
		String[] add = address.split(",");
		if(add.length == 4 || add.length > 4) {
			bo.setAddress1(add[0].trim());
			bo.setCity(add[1].trim());
			bo.setState(add[2].trim());
			bo.setZip4(add[3].trim());
		} else  if(add.length == 3) {
			bo.setAddress1(add[0].trim());
			bo.setCity(add[1].trim());
			
			String[] stateZip = add[2].trim().split(" ");
			if(stateZip.length == 2) {
				bo.setState(stateZip[0].trim());
				bo.setZip4(stateZip[1].trim());
			} else if(stateZip.length == 1){
				bo.setState(add[2].trim());
			}
		}
	} catch(Exception e) {
		e.printStackTrace();
		bo = null;
	}
	
	return bo;
}

}


enum myEnum{
	one,two,three
	
}