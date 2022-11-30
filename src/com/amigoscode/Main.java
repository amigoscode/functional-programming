package com.amigoscode;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jamila", "Alex", "Mariam");

        Consumer<String> stringConsumer = System.out::println;

        // names.forEach(stringConsumer);
         names.forEach(System.out::println);
    }
}