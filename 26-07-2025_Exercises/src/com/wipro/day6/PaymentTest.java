package com.wipro.day6;

public class PaymentTest {
	private final PaymentGateway paymentGateway;

    public PaymentTest(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processPayment(double amount) {
        paymentGateway.pay(amount);
    }

}
