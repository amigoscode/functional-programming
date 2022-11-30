package com.amigoscode;

import com.amigoscode.PersonRegistrationValidator.ValidationResult;
import static com.amigoscode.PersonRegistrationValidator.ValidationResult.*;

import java.util.function.Function;

public interface PersonRegistrationValidator
        extends Function<Person, ValidationResult> {

    static PersonRegistrationValidator isEmailValid() {
        return person -> person.email().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID_ERROR;
    }

    static PersonRegistrationValidator isEmailTaken() {
        return person -> SUCCESS;
    }

    static PersonRegistrationValidator isPhoneNumberValid() {
        return person -> person.phoneNumber().contains("+") ?
                SUCCESS : PHONE_NOT_VALID_ERROR;
    }

    default PersonRegistrationValidator and(
            PersonRegistrationValidator other) {
        return person -> {
            ValidationResult result = this.apply(person);
            return result.equals(SUCCESS) ? other.apply(person) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        EMAIL_NOT_VALID_ERROR,
        EMAIL_TAKEN_ERROR,
        PHONE_NOT_VALID_ERROR,
        NOT_ADULT_ERROR
    }

}
