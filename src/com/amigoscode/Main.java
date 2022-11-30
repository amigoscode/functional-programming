package com.amigoscode;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new Gmail();
        emailSender.send();
    }
}