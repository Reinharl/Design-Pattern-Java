import builder.User;
import decorator.Circle;
import decorator.RedBackgroundColorDecorator;
import decorator.Shape;
import decorator.WhiteBorderColorDecorator;
import observer.EmailListener;
import observer.MessagePublisher;
import singleton.EagerSingleton;
import strategy.CreditCard;
import strategy.Order;
import strategy.PayPal;

public class Client {

    public static void main(String[] args) {

        // Singleton Test
        singletonTest();

        // Builder Test
        builderTest();

        // Decorator Test
        decoratorTest();

        // Observer Test
        observerTest();

        // Strategy Test
        strategyTest();
    }

    public static void singletonTest() {
        EagerSingleton s1 = EagerSingleton.getInstance("1");
        EagerSingleton s2 = EagerSingleton.getInstance("2");

        System.out.println(s1.equals(s2));
    }

    public static void builderTest() {
        User user = new User.Builder()
                .firstName("John")
                .lastName("Doe")
                .build();

        System.out.println("user = " + user);
    }

    public static void decoratorTest() {
        Shape shape = new RedBackgroundColorDecorator(new WhiteBorderColorDecorator(new Circle()));

        shape.draw();
    }

    public static void observerTest() {
        MessagePublisher mp = new MessagePublisher();
        EmailListener el = new EmailListener();

        mp.addObserver(el);

        mp.notifyObservers("verifica email completata");
    }

    public static void strategyTest() {
        Order o1 = new Order(new PayPal());
        o1.processOrder(10);

        Order o2 = new Order(new CreditCard());
        o2.processOrder(20);
    }
}
