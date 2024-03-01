package tech.pdall.generics;

public class GenericType<T> {
    private T t;

    public void set(T t){
        this.t = t;
    }
    public T get(){
        return this.t;
    }
}
