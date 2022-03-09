package httpRequest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.stripe.net.RequestOptions;

public class RestTemplateTest1 {
	public static String secretKey = "sk_test_qzKWYPniItZmhB2Vmft6OTwG007NDTP6zK";
	public static String authToken = "ac_F8uerGdcNhdmpqh0tdXhSggZWXKjCZVN";
	public static String authURL="https://connect.stripe.com/oauth/token";
	public static void main(String[] args) {
		test5();
	}
	public static void test6() {
		try {
			URI url = new URI(authURL);
			RestTemplate restTemplate = new RestTemplate(new SimpleClientHttpRequestFactory());
			
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void test5() {

		RestTemplate restTemplate = new RestTemplate();
	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		Map<String, String> paramMap = new HashMap<>();
		paramMap.put("client_secret",secretKey);
		paramMap.put("code", authToken);
		paramMap.put("grant_type", "authorization_code");

		HttpEntity<Map<String, String>> request = new HttpEntity<Map<String,String>>(paramMap,headers);
		
		StripeConnectAuthResponseBO str = restTemplate.postForObject(authURL, request, StripeConnectAuthResponseBO.class);
		System.out.println(str);
		
	}
	
	public static void test4() {
		try {
		RequestOptions req = RequestOptions.builder().setApiKey(secretKey).build();
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(authURL);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
		map.add("client_secret", "sk_test_qzKWYPniItZmhB2Vmft6OTwG007NDTP6zK");
		map.add("code", authToken);
		map.add("grant_type", "authorization_code");

		List<NameValuePair> nvps = new ArrayList<NameValuePair>();
		nvps.add(new BasicNameValuePair("client_secret", secretKey));
		nvps.add(new BasicNameValuePair("code", authToken));
		nvps.add(new BasicNameValuePair("grant_type", "authorization_code"));
		httpPost.setEntity(new UrlEncodedFormEntity(nvps));
		CloseableHttpResponse response = httpclient.execute(httpPost);
		System.out.println(response.getAllHeaders());
		System.out.println(response.getEntity().getContent());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	public static void test3() {
		CloseableHttpClient httpClient = HttpClients.custom().setSSLHostnameVerifier(new NoopHostnameVerifier()).build();
		 HttpComponentsClientHttpRequestFactory requestFactory 
	      = new HttpComponentsClientHttpRequestFactory();
	    requestFactory.setHttpClient(httpClient);
	    HttpHeaders headers = new HttpHeaders();
//		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		
		MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
		map.add("client_secret", "sk_test_qzKWYPniItZmhB2Vmft6OTwG007NDTP6zK");
		map.add("code", authToken);
		map.add("grant_type", "authorization_code");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		
	    ResponseEntity<?> response = new RestTemplate(requestFactory).exchange("https://connect.stripe.com/oauth/token", HttpMethod.POST, request, Object.class);
	    
	    System.out.println(response.getBody());
	    
	}
	public static void test2() {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(restTemplate.getRequestFactory());
		HttpHeaders headers = new HttpHeaders();
		
		HttpEntity<?> request = new HttpEntity<>(headers);

		ResponseEntity<String> str = restTemplate.exchange("http://localhost:8080/NDE/payment/connectWithStripe", HttpMethod.GET, request, String.class);
		System.out.println(str.getBody());
	}
	public static void test1() {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		
/*
		StripeAuthBO stripe = new StripeAuthBO();
		stripe.setClient_secret("sk_test_qzKWYPniItZmhB2Vmft6OTwG007NDTP6zK");
		stripe.setCode(authToken);
		stripe.setGrant_type("authorization_code");*/

		MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
		map.add("client_secret",secretKey);
		map.add("code", authToken);
		map.add("grant_type", "authorization_code");

		HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
		
		ResponseEntity<String> str = restTemplate.exchange("https://connect.stripe.com/oauth/token", HttpMethod.POST, request, String.class);
		System.out.println(str.getBody());
		System.out.println(str.getStatusCode()+"\t"+str.getHeaders());
	}
}
