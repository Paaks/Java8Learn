package tech.pdall.thread;

public class MultiThreadExBeforeJava8 implements Runnable {

    private Object lock;
    private static int count = 1;

    public MultiThreadExBeforeJava8(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
            while(count<=10){
                if(count%2!=0 && Thread.currentThread().getName().equals("ODD")){
                    synchronized(this.lock) {
                        System.out.println("From Thread : " + Thread.currentThread().getName() + " : " + count);
                        try {
                            count++;
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                else if (count%2==0 && Thread.currentThread().getName().equals("EVEN")){
                    synchronized(this.lock) {
                        System.out.println("From Thread : " + Thread.currentThread().getName() + " : " + count);
                        count++;
                        lock.notify();
                    }
                }
            }
    }
}
