package strategy;

public class PayPal implements PaymentStrategy {
    @Override
    public void pay(long amount) {
        System.out.println("Payed with Paypal");
    }
}
