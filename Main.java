public class Main {
    public static void main(String[] args) {
        // LazySingleton lazySingleton1 = LazySingleton.getInstance(1);
        // LazySingleton lazySingleton2 = LazySingleton.getInstance(2);

        // System.out.println(lazySingleton1.getValue());
        // System.out.println(lazySingleton2.getValue());

        LazyEnumSingleton lazyEnumSingleton1 = LazyEnumSingleton.INSTANCE;
        LazyEnumSingleton lazyEnumSingleton2 = LazyEnumSingleton.INSTANCE;

        lazyEnumSingleton1.setValue(1);

        System.out.println(lazyEnumSingleton1.getValue());
        System.out.println(lazyEnumSingleton2.getValue());
    }
}
