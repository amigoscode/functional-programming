package com.amigoscode;

public class Main {
    public static void main(String[] args) {
        /*
        EmailSender emailSender = new Gmail();
        emailSender.send();
         */

        /*
        EmailSender amigosCodeSender = new EmailSender() {
            @Override
            public void send() {
                System.out.println("Sending email using Amigoscode server");
            }
        };*/

        EmailSender gmail = () -> System.out.println("Sending email using Gmail");

        EmailSender hotmail = () -> {
            System.out.println("Sending email using Hotmail");
        };

        gmail.send();
        hotmail.send();
    }
}