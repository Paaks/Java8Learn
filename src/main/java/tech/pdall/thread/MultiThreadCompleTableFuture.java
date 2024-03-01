package tech.pdall.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MultiThreadCompleTableFuture {

    private Object lock;

    public MultiThreadCompleTableFuture(Object obj) {
        this.lock = obj;
    }

    private static IntPredicate oddCond = e -> e%2 !=0;
    private static IntPredicate evenCond = e -> e%2 ==0;

    public static void main(String[] args) throws InterruptedException {
        MultiThreadCompleTableFuture evenOddPrinter = new MultiThreadCompleTableFuture(new Object());
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(()->evenOddPrinter.callCondition(oddCond,evenOddPrinter));
        executor.submit(()->evenOddPrinter.callCondition(evenCond,evenOddPrinter));
        //CompletableFuture.runAsync(()->evenOddPrinter.callCondition(oddCond,evenOddPrinter), executor);
        //CompletableFuture.runAsync(()->evenOddPrinter.callCondition(evenCond,evenOddPrinter),executor);
        Thread.sleep(1000);
        executor.shutdown();
    }

    private void callCondition(IntPredicate cond, MultiThreadCompleTableFuture evenOddPrinter) {
        IntStream.rangeClosed(1,15).filter(cond).forEach(evenOddPrinter::execute);
    }

    public void execute(int value){
        synchronized (lock) {
            try {
                System.out.println("Thread name : " + Thread.currentThread().getName() + " : " + value);
                lock.notify();
                lock.wait();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
