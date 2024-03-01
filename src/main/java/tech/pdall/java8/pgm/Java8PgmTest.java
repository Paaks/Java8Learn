package tech.pdall.java8.pgm;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8PgmTest {
    public static void main(String[] args) {
        String msg = "Prabhuldas";
        System.out.println(
        Arrays.stream(msg.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .findFirst()
                .get().getKey());


        //System.out.println(collect);
    }
}
