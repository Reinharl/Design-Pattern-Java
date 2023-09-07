package observer;

public class EmailListener implements Observer {
    @Override
    public void update(String s) {
        System.out.println("Email verificata");
    }
}
