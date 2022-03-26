package core.java1;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController(value = "/api")
public class Test9 {
	public static void main(String args[]) {
		List<String> strList = Arrays.asList("nitin","ravi","nimrat","roni");
		
	String st = 	strList.stream().filter(name -> name.startsWith("n")).findFirst().get();
	System.out.println(st);
	}
	
	@GetMapping("/person")
	public ResponseEntity<String> getPerson(@RequestParam("id") Long id,HttpRequest res) {
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	
	/*
	 *  List<Integer> number = 	Arrays.asList(23,12,10,9,20,87);
	 
	 number.stream().mapToInt(i ->{ 
		int square =  i*i;
		if(square<=100) {
			return square;
		} else {
			return 0;
		}
	 }).average().getAsDouble();
	 
	 number.stream().mapToInt(i -> i*i).filter(i-> i<100).average().getAsDouble();
	 */
}


