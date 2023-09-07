package strategy;

import lombok.Data;

@Data
public class Order {

    private PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(long amount) {
        paymentStrategy.pay(amount);
    }


}
