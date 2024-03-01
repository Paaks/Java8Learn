package tech.pdall.async;

import java.util.concurrent.ExecutionException;

public class AsyncProgrammingMain {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            System.out.println("starting");
            service.saveJson();
            Thread.sleep(5000);
            System.out.println("ending");
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
