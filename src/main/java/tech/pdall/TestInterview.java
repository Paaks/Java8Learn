package tech.pdall;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class TestInterview {



    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(10);

        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

    }
}
