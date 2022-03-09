package stripeExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.ChargeCollection;
import com.stripe.model.PaymentIntent;
import com.stripe.model.checkout.Session;
import com.stripe.net.RequestOptions;

public class Test2 {
	private static String APPLICATION_URL="http://f7d7bd36.ngrok.io/NDE";
	
	private static String stripeUserId = "acct_1EdDeULiwoDqx806";
	static String apiKey = "sk_test_qzKWYPniItZmhB2Vmft6OTwG007NDTP6zK";
	public static void main(String[] args) throws StripeException {
		Stripe.apiKey = apiKey;
		test2();
	}
	
	public static void test2() throws StripeException {
		Map<String, Object> sessionParams = new HashMap<String, Object>();
		sessionParams.put("customer_email","ravikumar@mailinator.com");
		sessionParams.put("client_reference_id", "3");
		
		//When we are enrolling student then we get success for different url by which we can identify it is for success of enrollment
		sessionParams.put("success_url", APPLICATION_URL+"payment/enrollment/success?key=");
		
		sessionParams.put("cancel_url", APPLICATION_URL+"payment/fail?key=");

		ArrayList<String> paymentMethodTypes = new ArrayList<>();
		paymentMethodTypes.add("card");
		sessionParams.put("payment_method_types", paymentMethodTypes);

		HashMap<String, Object> lineItem = new HashMap<String, Object>();
		lineItem.put("name", "w234asdf");
		//This is description that will be appear during payment 
		lineItem.put("description", "This is descripration constant string");
		lineItem.put("amount", 23000);
		lineItem.put("currency", "usd");
		lineItem.put("quantity", 1);

		ArrayList<HashMap<String, Object>> lineItems = new ArrayList<>();
		lineItems.add(lineItem);

		sessionParams.put("line_items", lineItems);

		//These are the metadata attribute which we will get when stripe webhook hit the server and we get these attribute from payment intent
		Map<String, Object> metaData = new HashMap<>();
		metaData.put("tenantId", 1);
		metaData.put("transactionId", 3);

		Map<String, Object> paymentIntentData = new HashMap<>();
		paymentIntentData.put("metadata", metaData);

		sessionParams.put("payment_intent_data", paymentIntentData);
		
		RequestOptions requestOptions = RequestOptions.builder().setStripeAccount(stripeUserId).build();
		
		Session session = Session.create(sessionParams,requestOptions);
		
		System.out.println(session.getPaymentIntent());
	}
	public static void test1() {
		try {
			Stripe.apiKey = apiKey;
			PaymentIntent paymentInte = PaymentIntent.retrieve("");
			
			RequestOptions requestOptions = RequestOptions.builder().setStripeAccount(stripeUserId).build();
			
			Session  session = Session.retrieve("cs_test_lX0wDFC98LQYeI8i0R01VXQvRMpYR8JiOcTQqmbO6ioNkVcFF1hbGl2S",requestOptions);
			PaymentIntent paymentIntent = PaymentIntent.retrieve(session.getPaymentIntent(), requestOptions);
			ChargeCollection chargeCollection = paymentIntent.getCharges();
			List<Charge> charges = chargeCollection.getData();
			
			charges.forEach(charge -> {
				System.out.println(charge.getApplication()+"\t"+charge.getAmount()+"\t"+charge.getStatus()+"\t"+charge.getApplicationFee()+"\t"+charge);
			});
			
			
		} catch (StripeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
