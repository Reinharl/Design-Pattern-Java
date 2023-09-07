package singleton;

import lombok.Data;

@Data
public class LazySingleton {

    private static LazySingleton instance;
    private String data;

    private LazySingleton(String data) {
        this.data = data;
    }

    public static LazySingleton getInstance(String data) {

        if (instance == null) {
            instance = new LazySingleton(data);
        }

        return instance;
    }
}
