package Test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HitUrlContinously {
	private static Logger log = LoggerFactory.getLogger(HitUrlContinously.class);
	public static void main(String args[]) {
		try {
			while(true) {
				try {
//					Thread.sleep(200);
				 ResponseEntity<String>	 re = new RestTemplate().getForEntity("http://localhost:8000/sample-api", String.class);
				System.out.println ("Hitting url response {}"+ re.getBody());
				 
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
