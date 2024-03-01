package tech.pdall.funcInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunclInterface {
    public static void main(String[] args) {
        int value = incrementByValue(5);
        System.out.println(value);
        System.out.println(incrByValFn.apply(6));
        System.out.println(mulBy5Fn.apply(5));
        System.out.println(incrByValFn.andThen(mulBy5Fn).apply(2));
        System.out.println(inrByAndMultiBiFn.apply(4,10));
    }

    private static int incrementByValue(int value) {
        return ++value;
    }
    static Function<Integer, Integer> incrByValFn = value -> ++value;
    static Function<Integer,Integer> mulBy5Fn = value -> value * 5;
    static BiFunction<Integer,Integer,Integer> inrByAndMultiBiFn = (numToIncr,numToMult) -> (numToIncr+1)*numToMult;
}
