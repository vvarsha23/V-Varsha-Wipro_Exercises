package com.wipro.day6;

public class PaymentMethodTest {
	public static void main(String[] args) {
		PaymentGateway googlePay = new GooglePay();
        PaymentGateway phonePe = new PhonePe();
        PaymentGateway paytm = new Paytm();

        PaymentTest processor1 = new PaymentTest(googlePay);
        processor1.processPayment(1000);

        PaymentTest processor2 = new PaymentTest(phonePe);
        processor2.processPayment(500);

        PaymentTest processor3 = new PaymentTest(paytm);
        processor3.processPayment(750);
	}

}
