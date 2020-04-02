package core.java;

import java.util.Arrays;
import java.util.List;

public class Temp20 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("/paymentIntegration","schedule","chat");
		String str = "NDE/settings/paymentIntegration";
		
		boolean isavailable = list.stream().anyMatch((value)->{
			System.out.println(value);
			return str.contains(value);
		});

		System.out.println(isavailable);
		
		check("",90d);
	}
	
	
	public static void check(String str,Double dob) {
		
	}

}
