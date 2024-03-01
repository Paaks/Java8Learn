package tech.pdall;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        List<Person> personList = List.of(
                new Person("Name1", Gender.MALE),
                new Person("Name2", Gender.FEMALE),
                new Person("Name3", Gender.MALE),
                new Person("Name4", Gender.FEMALE)
        );
        personList.stream().filter(person -> Gender.FEMALE.equals(person.gender)).forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;
        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,FEMALE
    }
}