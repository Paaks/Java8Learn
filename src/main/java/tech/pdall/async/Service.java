package tech.pdall.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Service {
    public void saveJson() throws ExecutionException, InterruptedException {
        ObjectMapper mapper = new ObjectMapper();
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("Saving Data "+Thread.currentThread().getName());
                JsonModel model = mapper.readValue("src/main/java/tech/pdall/imperative/async/jsondata.json", JsonModel.class);
                System.out.println("Data - "+model);
            }/* catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/ catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        });
       // completableFuture.get();
    }
    public void readJson(){

    }
}
