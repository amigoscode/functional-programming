package com.amigoscode;

@FunctionalInterface
public interface EmailSender {
    boolean send(String from, String to);
}
