package core.objectMapper;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {
	public static void main(String[] args) {
		test2();
	}
	
	public static void test2() {
		try {
		String str = "{\"TIME\":\"03:00 AM\",\"DATA\":[{\"EMAIL\":\"ravikumar@beepermd.com\",\"ANALYTICS_REPORTS\":{\"ENABLED\":true,\"REPORTS\":[\"NO_OF_PATIENTS_CONTACTED_TODAY\",\"ENGAGEMENT_PERCENTAGE_TODAY\",\"NO_OF_APPOINTMENTS_CONFIRMED_TODAY\",\"NO_OF_APPOINTMENTS_CANCELLED_TODAY\",\"NO_OF_SLOTS_BOOKED_TODAY\",\"NO_OF_PATIENTS_CONTACTED_YESTERDAY\",\"ENGAGEMENT_PERCENTAGE_YESTERDAY\",\"NO_OF_APPOINTMENTS_CONFIRMED_YESTERDAY\",\"NO_OF_APPOINTMENTS_CANCELLED_YESTERDAY\",\"NO_OF_SLOTS_BOOKED_YESTERDAY\"]},\"ACTIONABLE_REPORTS\":{\"ENABLED\":true,\"REPORTS\":[\"TODAY_UNCONFIRMED_APPOINTMENTS\",\"TODAY_UNCONFIRMED_APPOINTMENTS\",\"APPOINTMENTS_CANCELLED_TODAY\",\"APPOINTENTS_CANCELLED_YESTERDAY\",\"ALL_CANCELLED_APPOINTMENTS_FUTURE\",\"TODAY_BOOKED_SLOTS\",\"YESTERDAY_BOOKED_SLOTS\"]}},{\"EMAIL\":\"ravikumartholiya@gmail.com\",\"ANALYTICS_REPORTS\":{\"ENABLED\":true,\"REPORTS\":[\"NO_OF_PATIENTS_CONTACTED_TODAY\",\"ENGAGEMENT_PERCENTAGE_TODAY\",\"NO_OF_PATIENTS_CONTACTED_YESTERDAY\",\"ENGAGEMENT_PERCENTAGE_YESTERDAY\",\"NO_OF_APPOINTMENTS_CONFIRMED_YESTERDAY\",\"NO_OF_APPOINTMENTS_CANCELLED_YESTERDAY\"]},\"ACTIONABLE_REPORTS\":{\"ENABLED\":true,\"REPORTS\":[\"TODAY_UNCONFIRMED_APPOINTMENTS\",\"TODAY_UNCONFIRMED_APPOINTMENTS\",\"APPOINTMENTS_CANCELLED_TODAY\",\"TODAY_BOOKED_SLOTS\",\"YESTERDAY_BOOKED_SLOTS\"]}}]}";
		ObjectMapper om = new ObjectMapper();
		Map<String, Object> map = om.readValue(str, new TypeReference<Map<String,Object>>() {});
		
		System.out.println(map.get("TIME"));
		
		map.remove("TIME");
		map.put("SEND_APPOINTMENT_REPORTS_BY_EMAIL_ENABLED", true);
		
		List<Map<String, Object>> abc = (List<Map<String,Object>>)map.get("DATA");
		
		for(Map<String,Object> a: abc) {
			a.put("REPORT_SEND_TIME", "5:00 AM");
			a.put("TIMEZONE", "US/Eastern");
			String id = "abcdedf";
			a.put("ID", id);
//			System.out.println(a);
		}
		
		
		ObjectMapper mapper = new ObjectMapper();
		String reportingByEmailDetailsString = mapper.writeValueAsString(map);
		System.out.println(reportingByEmailDetailsString);
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void test1() {
		String str = "{SEND_APPOINTMENT_REPORTS_BY_EMAIL_ENABLED=true, SEND_APPOINTMENT_REPORTS_BY_EMAIL_DETAILS=[{EMAIL=ravikumar@beeprmd.com, REPORT_SEND_TIME=01:00 AM, TIMEZONE=UTC, ANALYTICS_REPORTS={ENABLED=true, REPORTS=[NO_OF_PATIENTS_CONTACTED_YESTERDAY, ENGAGEMENT_PERCENTAGE_YESTERDAY, NO_OF_APPOINTMENTS_CONFIRMED_YESTERDAY]}, ACTIONABLE_REPORTS={ENABLED=false, REPORTS=[]}}, {EMAIL=, REPORT_SEND_TIME=01:00 AM, TIMEZONE=UTC, ANALYTICS_REPORTS={ENABLED=false, REPORTS=[]}, ACTIONABLE_REPORTS={ENABLED=false, REPORTS=[]}}]}";
		String str2 = "[{\"EMAIL\":\"ravikumar@beeprmd.com\",\"REPORT_SEND_TIME\":\"01:00 AM\",\"TIMEZONE\":\"UTC\",\"ANALYTICS_REPORTS\":{\"ENABLED\":true,\"REPORTS\":[\"NO_OF_PATIENTS_CONTACTED_YESTERDAY\",\"ENGAGEMENT_PERCENTAGE_YESTERDAY\",\"NO_OF_APPOINTMENTS_CONFIRMED_YESTERDAY\"]},\"ACTIONABLE_REPORTS\":{\"ENABLED\":false,\"REPORTS\":[]}},{\"EMAIL\":\"\",\"REPORT_SEND_TIME\":\"01:00 AM\",\"TIMEZONE\":\"UTC\",\"ANALYTICS_REPORTS\":{\"ENABLED\":false,\"REPORTS\":[]},\"ACTIONABLE_REPORTS\":{\"ENABLED\":false,\"REPORTS\":[]}}]";
		
		ObjectMapper om = new ObjectMapper();
		
		try {
			
			List<Map<String, Object>> li = om.readValue(str2,new TypeReference<List<Map<String, Object>>>() {});
			li.forEach(a ->{
				System.out.println(a.get("EMAIL"));
			});
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
