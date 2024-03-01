package tech.pdall.design.creational.builder;

public class MainClass {
    public static void main(String[] args) {
        LazyInitHolderSingleton singleton1 = LazyInitHolderSingleton.getInstance();
        LazyInitHolderSingleton singleton2 = LazyInitHolderSingleton.getInstance();
        System.out.println(singleton1 + "--" + singleton2);
    }
}
