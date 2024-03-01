package tech.pdall.funcInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerFnInt {
    public static void main(String[] args) {
        printCustomer.accept(new Customer("Prabhul", "38"));
        printCustmerBi.accept(new Customer("Prabhul","38"),"Y");
        printCustmerBi.accept(new Customer("Prabhul","38"),"N");
    }
   static Consumer<Customer> printCustomer = customer -> System.out.println(customer);
    static BiConsumer<Customer,String> printCustmerBi = (customer, flag) -> {
        System.out.println("Customer name " + customer.name + " Customer age "+ ("Y".equals(flag)?customer.age:"NO"));
    };
    static class Customer{
        private String name;
        private String age;
        Customer(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    ", age='" + age + '\'' +
                    '}';
        }
    }

}
