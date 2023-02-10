package Test1;

public class Test2 {
	public static void main(String args[]) {
		PaymentService service = new StripePaymentService();
		
		service.pay(23434);
	}
}


interface PaymentService {
	void pay(int amount);
}


class StripePaymentService implements PaymentService {

	@Override
	public void pay(int amount) {
	System.out.println("Stripe payment" + amount);
	}
	
}

class RazorPayService implements PaymentService {

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Razorpay payment" + amount);
	}
	
}
