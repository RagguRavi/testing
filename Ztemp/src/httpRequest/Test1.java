package httpRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = test();
//		getRequest(result);
		getRequest2(result);
	}

	public static String test() {
		String result = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(AddressValidateRequest.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE); // To format XML

			Address address = new Address("1", "29851 Aventura #k", "", "chandigarh", "CA", "92688", "");
			AddressValidateRequest avr = new AddressValidateRequest("873BEEPE1114", address);
			//Print XML String to Console
			StringWriter stringWriter = new StringWriter();
			jaxbMarshaller.marshal(avr,stringWriter);

			result =stringWriter.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	public static void getRequest2(String data) {
		try {
		String urlStr = "https://secure.shippingapis.com/ShippingAPI.dll?API=Verify&XML="+URLEncoder.encode(data,"UTF-8");
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.ALL));
		headers.setContentType(MediaType.APPLICATION_ATOM_XML);
		HttpEntity<?> request1 = new HttpEntity<Void>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<?> response1 = restTemplate.exchange(urlStr, HttpMethod.GET, null,Object.class);
		System.out.println(response1.getHeaders());
		System.out.println(response1.getBody());
		System.out.println(urlStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void getRequest(String data) {
		try {
			System.out.println(data);
			String urlStr = "https://secure.shippingapis.com/ShippingAPI.dll?API=Verify&XML="+URLEncoder.encode(data,"UTF-8");

			URL url = new URL(urlStr);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");

			System.out.println(url);
			System.out.println("Response code is :"+con.getResponseCode());
			BufferedReader in = new BufferedReader( new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();

			convertToObj(content.toString());

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void convertToObj(String xmlData) {
		try {
			
			JAXBContext jaxbContext = JAXBContext.newInstance(AddressValidateResponse.class);
			StringReader sr = new StringReader(xmlData);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

			Object obj = unmarshaller.unmarshal(sr);
			System.out.println(obj);
			;
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
