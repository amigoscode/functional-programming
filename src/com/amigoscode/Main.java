package com.amigoscode;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Person jamila = personMapperBiFunc.apply("Jamila", 18);
        System.out.println(jamila);
    }

    record Person(String name, int age){}

    static BiFunction<String, Integer, Person> personMapperBiFunc =
            Person::new;
    /*
    static BiFunction<String, Integer, Person> personMapper =
            (name, age) -> new Person(name, age);

    */

    static Person personMapper(String name, int age) {
        return new Person(name, age);
    }

}