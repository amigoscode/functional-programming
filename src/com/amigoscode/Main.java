package com.amigoscode;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        hello("Alex", "Jones", input -> {
            System.out.println(input + " you must have last name");
        });
    }

    /*
     const cb = (firstName) => {
        console.log(firstName + " you must have last name")
    }*/

    static Consumer<String> cb = input ->
            System.out.println(input + " you must have last name");

    static void hello(String firstName,
                      String lastName,
                      Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    /*
    const hello = (firstName, lastName, callback) => {
        console.log(firstName);
        if (lastName) {
            console.log(lastName);
        } else {
            callback(firstName);
        }
    }

    const cb = (firstName) => {
        console.log(firstName + " you must have last name")
    }*/
}