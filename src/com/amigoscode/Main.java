package com.amigoscode;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        sendEmailBiConsumer.accept(
                "hello@amigoscode.com",
                "alexu@gmail.com");
    }

    static BiConsumer<String, String> sendEmailBiConsumer =
            (from, to) ->
                    System.out.printf("sending email from %s to %s%n", from, to);

    static void sendEmail(String from, String to) {
        System.out.printf("sending email from %s to %s%n", from, to);
    }

}