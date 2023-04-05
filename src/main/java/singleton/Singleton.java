package singleton;

public class Singleton {
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) return result;

        // Double-Checked locking
        // https://en.wikipedia.org/wiki/Double-checked_locking
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
        }

        return instance;
    }
}
