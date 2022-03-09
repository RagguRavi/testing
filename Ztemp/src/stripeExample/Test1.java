package stripeExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.model.WebhookEndpoint;

public class Test1 {
	static String apiKey = "sk_test_qzKWYPniItZmhB2Vmft6OTwG007NDTP6zK";
	
	public static void main(String[] args) throws Exception {
		Stripe.apiKey = apiKey;
		test2();
	}
	private static void test2() throws Exception {

		Map<String, Object> webhookendpointParams = new HashMap<String, Object>();
		webhookendpointParams.put("url", " http://c70a3006.ngrok.io/NDE/payment/completed");
		webhookendpointParams.put("enabled_events", Arrays.asList("charge.failed", "charge.succeeded","checkout.session.completed"));
		
		WebhookEndpoint.create(webhookendpointParams);
//		webhookendpoint.crea
		
	}
	private static void test1() {
		try {
			/*PaymentIntent pi = PaymentIntent.retrieve("pi_1EcmsRG86ArdtJikgzOZ4hGi");
			System.out.println(pi.getAmount()+"\t"+pi.getCurrency()+"\t"+pi.getStatus());
			Map<String, String> str = pi.getMetadata();
			System.out.println(str);*/
			
//			String string = "{  \"id\": \"evt_1Eco1wG86ArdtJiks0R9jCW6\",  \"object\": \"event\",  \"api_version\": \"2019-03-14\",  \"created\": 1558506868,  \"data\": {    \"object\": {      \"id\": \"cs_test_BafMS3ytB1a1wJpSdKJR0Tk6jGym3ZyekGQmlrXsOOWngE0cCtQyHKtq\",      \"object\": \"checkout.session\",      \"billing_address_collection\": null,      \"cancel_url\": \"http://f7588973.ngrok.io/NDE/payment/fail\",      \"client_reference_id\": null,      \"customer\": \"cus_F726IZj5g74TfL\",      \"customer_email\": \"student3@mailinator.com\",      \"display_items\": [        {          \"amount\": 5500,          \"currency\": \"usd\",          \"custom\": {            \"description\": \"This is descripration constant string\",            \"images\": null,            \"name\": \"aa kumar is paying\"          },          \"quantity\": 1,          \"type\": \"custom\"        }      ],      \"livemode\": false,      \"locale\": null,      \"payment_intent\": \"pi_1Eco1dG86ArdtJikTqvSdwto\",      \"payment_method_types\": [        \"card\"      ],      \"subscription\": null,      \"success_url\": \"http://f7588973.ngrok.io/NDE/payment/success\"    }  },  \"livemode\": false,  \"pending_webhooks\": 1,  \"request\": {    \"id\": null,    \"idempotency_key\": null  },  \"type\": \"checkout.session.completed\"}";
			
//			System.out.println(session);
//			Session.retrieve(session)
			
			/*PaymentIntent pi = PaymentIntent.retrieve("pi_1EcoGCG86ArdtJik3TcdaDGv");
			System.out.println(pi.getStatus());
			System.out.println(pi.getPaymentMethod()+"\t"+pi.getLastResponse().body());
			
			Session session = Session.retrieve("cs_test_BafMS3ytB1a1wJpSdKJR0Tk6jGym3ZyekGQmlrXsOOWngE0cCtQyHKtq");
			System.out.println(session.getLastResponse());*/
			
			String str = "/NDE/class/details/students/3";
			
//			System.out.println(url);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
