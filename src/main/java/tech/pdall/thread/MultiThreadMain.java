package tech.pdall.thread;

public class MultiThreadMain {
    public static void main(String[] args) {
        Object obj = new Object();
        Runnable odd = new MultiThreadExBeforeJava8(obj);
        Runnable even = new MultiThreadExBeforeJava8(obj);
        Thread t1 = new Thread(odd,"ODD");
        Thread t2 = new Thread(even, "EVEN");
        t1.start();
        t2.start();
    }
}
