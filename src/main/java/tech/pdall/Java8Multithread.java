package tech.pdall;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Java8Multithread {
    public static void main(String[] args) {
        Executor executor = Executors.newSingleThreadExecutor();
        CompletableFuture.runAsync(() -> {

        },executor);
    }
}
