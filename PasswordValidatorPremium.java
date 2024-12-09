package com.sinanotc.passwordvalidator;

import com.cthiebaud.passwordvalidator.*;

/**
 * Implements custom password validation based on multiple security criteria.
 * Validation includes checks for length, character types, numeric digits,
 * special characters, and a predefined unique identifier.
 */
public class PasswordValidatorPremium implements PasswordValidator {

    private static final int MIN_LENGTH = 8; // Minimum password length
    private static final String SPECIAL_CHARACTER_REGEX = ".*[!@#$%^&*(),.?\":{}|<>].*"; // Special character regex
    private static final String TEACHER_INSTAGRAM = "cthiebaud"; // Special character regex

    /**
     * Checks the given password against specified security criteria.
     *
     * @param passwordToCheck the password string to be validated
     * @return a ValidationResult object indicating whether the password meets
     * the required conditions.
     */
    public ValidationResult validate(String password) {
        if (password == null || password.isEmpty()) {
            return new ValidationResult(false, "Password cannot be null or empty.");
        }

        // Check if password meets the minimum length of 8 charakters
        if (password.length() < MIN_LENGTH) {
            System.out.println("Password failed length check.");
            return new ValidationResult(false, "Password must be at least " + MIN_LENGTH + " characters long.");
        }

        // Check if password contains at least one uppercase letter
        if (password.equals(password.toLowerCase())) {
            return new ValidationResult(false, "Password must contain at least one uppercase letter.");
        }

        // Check if password contains at least one lowercase letter
        if (password.equals(password.toUpperCase())) {
            return new ValidationResult(false, "Password must contain at least one lowercase letter.");
        }

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) {
            return new ValidationResult(false, "Password must contain at least one digit.");
        }

        // Check if password contains at least one special character
        if (!password.matches(SPECIAL_CHARACTER_REGEX)) {
            return new ValidationResult(false, "Password must contain at least one special character.");
        }

        // Check if password contains the teacher's Instagram name
        if (!password.contains(TEACHER_INSTAGRAM)) {
            return new ValidationResult(false,
                    "Password must contain the Instagram name of the best French programming teacher at the DHBW ;): '"
                    + TEACHER_INSTAGRAM + "'.");
        }

        // If all checks pass
        return new ValidationResult(true, "Password is valid.");
    }

}
