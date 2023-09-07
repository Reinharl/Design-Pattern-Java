package strategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay(long amount) {
        System.out.println("Payed with Credit Card");
    }
}
