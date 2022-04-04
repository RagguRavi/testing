package core.java1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController(value = "/api")
public class Test9 {
	public static void main(String args[]) {

		try {
			Future<String> f = calculateAsync();
			String st = f.get();
			System.out.println(st);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	public static Future<String> calculateAsync() throws InterruptedException {
	    CompletableFuture<String> completableFuture = new CompletableFuture<>();

	    Executors.newCachedThreadPool().submit(() -> {
	        Thread.sleep(500);
	        completableFuture.complete("Hello");
	        return null;
	    });

	    return completableFuture;
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


