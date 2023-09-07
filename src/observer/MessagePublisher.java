package observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MessagePublisher implements Subject {

    private List<Observer> observers;

    public MessagePublisher() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String s) {
        for (Observer o : observers) {
            o.update(s);
        }
    }
}
