package com.amigoscode;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<Integer, Integer> combinedFunction =
                incrementByOneFunc.andThen(doubleFunc);

        System.out.println(combinedFunction.apply(1));
        System.out.println(combinedFunction.apply(3));
    }

    static Function<Integer, Integer> incrementByOneFunc =
            n -> n + 1;

    static Function<Integer, Integer> doubleFunc =
            n -> n * 2;

    static int incrementByOne (int n) {
        return n + 1;
    }
}