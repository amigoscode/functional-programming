package com.amigoscode;

import com.amigoscode.PersonRegistrationValidator.ValidationResult;

public class Main {
    public static void main(String[] args) {

        Person jamila = new Person(
                "Jamila",
                "+0000000",
                "jamila@gmail.com"
        );

        Person alex = new Person(
                "Alex",
                "+0000000",
                "alex@gmail.com"
        );

        PersonRegistrationValidator validator =
                PersonRegistrationValidator
                        .isEmailTaken()
                        .and(PersonRegistrationValidator.isEmailValid())
                        .and(PersonRegistrationValidator.isPhoneNumberValid());

        ValidationResult result =
                validator.apply(jamila);

        if (result != ValidationResult.SUCCESS) {
        }

        System.out.println(result);
        System.out.println(validator.apply(alex));

    }
}