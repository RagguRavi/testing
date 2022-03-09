package twilioTest;

import java.net.URL;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Base64;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TwilioChat4 {
public static void main(String[] args) {
	try {
		String twilioAccountSid = "AC6718409023f7d83d34ae1e9b38b73f76";
		String twilioAuthToken = "f961f9ada9a79003b92836a52bc28cff";
        URL url = new URL ("https://mcs.us1.twilio.com/v1/Services/IS68b5ef95bd9f4a60affa0f035fcef092/Media/ME80844118982cf45372f8d4d16cf77ea1");
        String str = twilioAccountSid+":"+twilioAuthToken;
        String encoding = Base64.getEncoder().encodeToString(str.getBytes());

        System.out.println(str+"\t"+encoding);
        
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setRequestProperty  ("Authorization", "Basic " + encoding);
        InputStream content = connection.getInputStream();
        
        ObjectMapper objectMapper = new ObjectMapper();
		Map<String,Object> objcectMapper = objectMapper.readValue(content,new TypeReference<Map<String, Object>>() {} );
		
		
		objcectMapper.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
		System.out.println("===============================================================");
		Map<String, String> type = (Map<String, String>)objcectMapper.get("links");
		
		type.forEach((k,v)->{
			System.out.println(k+"\t"+v);
		});
		
		url = new URL (type.get("content_direct_temporary"));
		connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoOutput(true);
        connection.setRequestProperty  ("Authorization", "Basic " + encoding);
        content = connection.getInputStream();
        
        System.out.println(content.available());
        File file = new File("d:/"+"abc.jpg");
		if(!file.exists()) {
			System.out.println(file.createNewFile());
		}

		OutputStream outputStream = new FileOutputStream(file);
		while(true) {
			int tempValue = content.read();
			System.out.println(tempValue);
			if(tempValue == -1) {
				break;
			} else {
				System.out.println(tempValue);
				outputStream.write(tempValue);
			}
		}
    } catch(Exception e) {
        e.printStackTrace();
    }
}
}
