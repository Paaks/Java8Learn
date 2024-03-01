package tech.pdall.coding;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8CodingAll {
    public static void main(String[] args) {
        //separateOddandEven();
        //removeDuplicate();
        //freqOfCharacters();
        //sortDecimalReverse();
        //joinTheString();
        //multiplesOfNumber(5);
        //findMaxandMin();
        //mergeTwoIntArrays();
        //checkAnagram();
        //SumOfAllIntegers();
        //findSecondLargerstNum();
        //sortStrOnLength();
        //reverseEachWord();
       // reverseIntArray();
        //mostRepeatedElemInAnArray();
        //palindrom();
        //duplicateChar();
        //firstRepeatedChar();

    }

    private static void firstRepeatedChar() {
        String inputString = "Prabhuldas is fine".replaceAll("\\s+", "").toLowerCase();
// first repeating
        System.out.println(
        Stream.of(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(),HashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry->entry.getValue()>1)
                .findFirst()
                .map(entry->entry.getKey()).get()
        );
        // first non repeating
        System.out.println(
                Stream.of(inputString.split(""))
                        .collect(Collectors.groupingBy(Function.identity(),HashMap::new, Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(entry->entry.getValue() == 1)
                        .findFirst()
                        .map(entry->entry.getKey()).get()
        );
    }

    private static void duplicateChar() {
        String inputString = "Prabhuldas is fine".replaceAll("\\s+", "").toLowerCase();

        System.out.println(inputString);
        Set<String> noDupli = new HashSet<>();
       /* System.out.println(
        Stream.of(inputString.split(""))
                .filter(s -> !noDupli.add(s))
                .collect(Collectors.toList())
        );*/

        System.out.println(
                Stream.of(inputString.split(""))
                        .filter(s -> !noDupli.add(s))
                        .findFirst()
                        .get()
        );
    }

    private static void palindrom() {
        String str = "ROTATOR";
        String strArr [] = str.split("");
        boolean b = IntStream.rangeClosed(1, str.length() / 2)
                .noneMatch(i -> strArr[i] == strArr[str.length() - i]);
        System.out.println(b);
    }

    private static void mostRepeatedElemInAnArray() {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil", "Led");
        Map.Entry<String, Long> stringLongEntry = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .get();
        System.out.println(stringLongEntry);
    }

    private static void reverseIntArray() {
        int numArr [] = new int[] {5, 1, 7, 3, 9, 6};

        System.out.println(Arrays.toString(IntStream.rangeClosed(0,numArr.length-1).map(n->numArr[numArr.length-1-n]).toArray()));
        System.out.println(Arrays.toString(
                IntStream.rangeClosed(0,numArr.length-1)
                        .map(i->numArr[numArr.length-1-i])
                        .toArray())
        );
    }

    private static void reverseEachWord() {
        String str = "Java Concept Of The Day";
        System.out.println(Stream.of(str.split(" ")).map(s -> new StringBuffer(s).reverse()).collect(Collectors.toList()));
    }

    private static void sortStrOnLength() {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        System.out.println(listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
    }

    private static void findSecondLargerstNum() {
        List<Integer> numbers = List.of(3, 5, 7, 2, 8);
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }

    private static void SumOfAllIntegers() {
        int number = 12345;
       // int sum = Stream.of((number + "").split("")).mapToInt(Integer::getInteger).sum();
        System.out.println(Stream.of((number + "").split("")).mapToInt(value -> Integer.parseInt(value)).sum());
    }

    private static void checkAnagram() {
        String msg1 = "abcd";
        String msg2 = "dcab";

        String collect = Stream.of(msg1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String collect1 = Stream.of(msg2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

        System.out.println(collect +"-"+collect1);
    }

    private static Consumer printConsumer = (t) -> {System.out.print(t +",");};
    private static void mergeTwoIntArrays() {
        int a [] = new int[] {3,4,5};
        int b [] = new int[] {1,2,6};
        IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().forEach(System.out::print);
    }

    private static void findMaxandMin() {
        List<Integer> num = List.of(12, 3, 45, 5, 6, 38, -1, 4);
        Stream<Integer> sorted = num.stream().sorted();
        System.out.println(num.stream().max(Comparator.naturalOrder()));
        System.out.println(sorted.findFirst().get());

    }

    private static void multiplesOfNumber(int i) {
        List<Integer> number = Arrays.asList(5, 3, 10, 12, 19, 25);

        System.out.println(number.stream().filter(n->n%i==0).collect(Collectors.toList()));
    }

    private static void joinTheString() {
        List<String> strs = List.of("I", "am", "a", "developer");
        System.out.println(strs.stream().collect(Collectors.joining(",")));
        System.out.println(strs.stream().collect(Collectors.joining(",","[","]")));
    }

    private static void sortDecimalReverse() {
        List<Double> numbers = Arrays.asList(74.23, 48.66, 48.667, 48.3, 26.3, 9.01);
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }

    private static void freqOfCharacters() {
        String msg = "Find the char count";
        Map<String, Long> freqChar = Arrays.stream(msg.replaceAll("\\s+", "")
                        .split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqChar);
        Arrays.stream(msg.replaceAll(" ", "")
                        .split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue().intValue() < 2)
                .map(entr-> entr.getKey())
                .forEach(s-> System.out.print(s +","));

    }

    private static void separateOddandEven(){
        List<Integer> integers = List.of(3, 67, 6, 87, 36, 37);
        List<Integer> integers1 = Arrays.asList(3, 5, 7, 85, 6);
        System.out.println(integers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)));
               //.forEach((aBoolean, integers2) ->integers2.forEach(System.out::print));

       /* Map<Integer, Long> collect = integers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);*/
    }

    private static void removeDuplicate(){
        String msg = "Check the Duplicate word";
        List<Character> s = List.of('s', 's', 'a', 's');
        s.stream().distinct().forEach(System.out::println);
    }

}
