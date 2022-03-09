package core.xmlParser;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.w3c.dom.Document;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {

	public static void main(String[] args) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			EvsRequestBO bo = new EvsRequestBO();

			EvsCredentials credentials = new EvsCredentials();
			credentials.setUserName("E581-C6A32D6D-3218-44AB-8B75-124CD01B58C2");
			credentials.setPassword("w#UQd8W#j2tzKAt");
			
			bo.setCredentials(credentials);
			bo.setCustomerReference("aaaa");
			
			JAXBContext contextObj = JAXBContext.newInstance(EvsRequestBO.class,EvsResponse.class);

			Marshaller marshallerObj = contextObj.createMarshaller();  
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);  

			StringWriter sw = new StringWriter();
			marshallerObj.marshal(bo, sw);

			String xmlContent = sw.toString();
			
			RestTemplate restTemplate = new RestTemplate();
			
			ResponseEntity<String> rs = null;
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_XML_VALUE);
			headers.add("Content-Type", MediaType.APPLICATION_XML_VALUE);

			HttpEntity<String> entity = new HttpEntity<>(xmlContent,headers);
			rs = restTemplate.exchange("https://identiflo.everification.net/WebServices/Integrated/Main/V210/Consumer",HttpMethod.POST, entity, String.class);

			System.out.println(rs.getBody());
			if(HttpStatus.OK.equals(rs.getStatusCode())) {
				
				
				  Unmarshaller jaxbUnmarshaller = contextObj.createUnmarshaller();
				  
				  EvsResponse response = (EvsResponse)jaxbUnmarshaller.unmarshal(new StringReader(rs.getBody()));
				  
				   System.out.println(response.getTransactionDetails().getTransactionDate());
				  System.out.println(response.getTransactionDetails().errors);
				  System.out.println(response.getTransactionDetails().product.attr);
				  
				  
				 
				
				/*
				 * DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				 * DocumentBuilder builder = factory.newDocumentBuilder(); InputStream
				 * targetStream = new ByteArrayInputStream(rs.getBody().getBytes());
				 * 
				 * Document doc = builder.parse(targetStream);
				 * doc.getDocumentElement().normalize();
				 * 
				 * NodeList node = doc.getChildNodes();
				 * 
				 * System.out.print(node.item(0).getChildNodes().item(1).getChildNodes().item(5)
				 * );
				 */
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	public static String getResponse() {

		
		String str = "<?xmlversion=\"1.0\"encoding=\"utf-8\"standalone=\"yes\"?><PlatformResponse><TransactionDetails><TransactionId/><TransactionDate>2021-05-12T08:05:28.3971782Z</TransactionDate><Productname=\"IdentiFraudConsumer\"version=\"2.1.0\"/><CustomerReference></CustomerReference><DataProviderDuration>0</DataProviderDuration><TotalDuration>0.0156339</TotalDuration><Errors><Errorcode=\"2010\"message=\"IPaddressisnotinacceptablerange.YourIPAddress:157.36.196.15\"/></Errors><Warnings/></TransactionDetails><Response/></PlatformResponse>";
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			InputStream targetStream = new ByteArrayInputStream(str.getBytes());
			
			Document doc = builder.parse(targetStream);
			doc.getDocumentElement().normalize();
			
			System.out.print(doc);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return str;
	}

}
