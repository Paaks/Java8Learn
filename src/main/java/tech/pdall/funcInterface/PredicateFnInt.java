package tech.pdall.funcInterface;

import java.util.function.Predicate;

public class PredicateFnInt {
    public static void main(String[] args) {
        System.out.println("The number is ODD : "+isNumberOdd(4));
        System.out.println("The number is ODD : "+isNumberOddPredicate.test(5 ));

    }
    static boolean isNumberOdd(int number){
        return number > 0 && number%2 !=0;
    }

   static Predicate<Integer> isNumberOddPredicate = number -> number>0 && number%2 !=0;
}
