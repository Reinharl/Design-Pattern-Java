package singleton;

import lombok.Data;

@Data
public class EagerSingleton {

    private static volatile EagerSingleton instance;
    private String data;

    private EagerSingleton(String data) {
        this.data = data;
    }

    public static EagerSingleton getInstance(String data) {
        EagerSingleton result = instance;

        if (result != null) {
            return result;
        }

        synchronized (EagerSingleton.class) {
            if (instance == null) {
                instance = new EagerSingleton(data);
            }

            return instance;
        }
    }
}
