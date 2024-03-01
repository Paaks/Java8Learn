package tech.pdall.funcInterface;

import java.util.function.Supplier;

public class SupplierFnInt {
    public static void main(String[] args) {
        System.out.println(getMyStatus());
        System.out.println(getMyStatusSupplier.get() );
    }
    static String getMyStatus(){
        return "I am passed";
    }

    static Supplier<String> getMyStatusSupplier = () -> {return "I am passed Supplier";};

}
