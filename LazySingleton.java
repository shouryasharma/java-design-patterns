public class LazySingleton {
    private static LazySingleton instance; // we need to access this member in main class
    private int value; // optional

    private LazySingleton(int value) { // it's private so that it can't be accessed to create instances
        this.value = value;
    }

    public static LazySingleton getInstance(int value) {
        if (instance == null)
            instance = new LazySingleton(value);
        return instance;
    }

    public int getValue() {
        return this.value;
    }
}
