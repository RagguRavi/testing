package twilioTest;

import java.io.InputStream;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;

public class TwilioTest3 {
	public static void main(String[] args) throws Exception {
		String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
		String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
		//     String serviceSid = "IS5135ecc78064425aa6e12500231a48cd";

		Twilio.init(twilioAccountSid, twilioAuthToken);
		TwilioRestClient twilioRestClient = Twilio.getRestClient();
		
		Request request = new Request(HttpMethod.GET, "https://mcs.us1.twilio.com/v1/Services/IS68b5ef95bd9f4a60affa0f035fcef092/Media/ME80844118982cf45372f8d4d16cf77ea1");
		Response response = twilioRestClient.request(request);
		String responseText = response.getContent();
		System.out.println(request.getAuthString()+"\t");
		
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String,Object> objcectMapper = objectMapper.readValue(responseText,new TypeReference<Map<String, Object>>() {} );
		
		
		objcectMapper.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
		System.out.println("===============================================================");
		Map<String, String> type = (Map<String, String>)objcectMapper.get("links");
		
		type.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
		
		 request = new Request(HttpMethod.GET, type.get("content_direct_temporary"));
		 response = twilioRestClient.request(request);
		 responseText = response.getContent();
//		 System.out.println(responseText);
		
		InputStream inputStream = response.getStream();
		System.out.println(inputStream.available());
		
		/*try {
			File file = new File("d:/"+"abc.jpg");
			if(!file.exists()) {
				System.out.println(file.createNewFile());
			}

			OutputStream outputStream = new FileOutputStream(file);
			while(true) {
				int tempValue = inputStream.read();
				System.out.println(tempValue);
				if(tempValue == -1) {
					break;
				} else {
					System.out.println(tempValue);
					outputStream.write(tempValue);
				}
			}
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/

		}
}
