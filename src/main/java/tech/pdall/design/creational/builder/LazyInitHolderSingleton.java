package tech.pdall.design.creational.builder;

public class LazyInitHolderSingleton {
    private LazyInitHolderSingleton(){
        System.out.println("Finally created");
    }

    private static class LazyInitHolderInstance {
        private static LazyInitHolderSingleton INSTANCE = new LazyInitHolderSingleton();
    }
    public static LazyInitHolderSingleton getInstance () {
        return LazyInitHolderInstance.INSTANCE;
    }
}
