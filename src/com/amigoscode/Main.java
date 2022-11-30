package com.amigoscode;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        var email = "hello@amigoscode.com";
        // System.out.println(isValidEmail(email));
        System.out.println(isValidEmailPredicate.test(email));

        boolean test = isValidEmailPredicate
                .and(containsDotPredicate).test(email);

        System.out.println(test);

    }

    static Predicate<String> isValidEmailPredicate =
            email -> email.contains("@");

    static Predicate<String> containsDotPredicate =
            email -> email.contains(".");

    static boolean isValidEmail(String email) {
        return email.contains("@");
    }

}