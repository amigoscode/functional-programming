package com.amigoscode;

public class Main {
    public static void main(String[] args) {
        EmailSender gmail = (from, to) -> {
            System.out.println("Sending email using Gmail");
            return false;
        };

        EmailSender hotmail = (from, to) -> {
            // logic
            var isValid = to.contains("@");
            // more logic
            System.out.println("Sending email using Hotmail");
            return true;
        };

        boolean wasEmailSent = gmail.send("hello@amigocode.com", "alex@gmail.com");
        hotmail.send("hello@amigocode.com", "jamila@gmail.com");
    }
}