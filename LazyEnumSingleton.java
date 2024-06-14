public enum LazyEnumSingleton {
    INSTANCE;

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}