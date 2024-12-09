package com.sinanotc.passwordvalidator;

import com.cthiebaud.passwordvalidator.PasswordValidator;
import com.cthiebaud.passwordvalidator.ValidationResult;

/**
 * Implements custom password validation based on multiple security criteria.
 * Validation includes checks for length, character types, numeric digits, and
 * special characters.
 */
public class PasswordValidatorPremium implements PasswordValidator {

    private static final int MIN_LENGTH = 8; // Minimum password length
    private static final String SPECIAL_CHARACTER_REGEX = ".*[!@#$%^&*(),.?\":{}|<>].*"; // Regex for special characters

    /**
     * Validates the given password against security criteria.
     *
     * @param password the password string to be validated
     * @return a ValidationResult object indicating whether the password meets
     * the required conditions.
     */
    @Override
    public ValidationResult validate(String password) {
        // Check for null or empty password
        if (password == null || password.isEmpty()) {
            return new ValidationResult(false, "Password cannot be null or empty.");
        }

        // Check for minimum length
        if (password.length() < MIN_LENGTH) {
            return new ValidationResult(false, "Password must be at least " + MIN_LENGTH + " characters long.");
        }

        // Check for at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return new ValidationResult(false, "Password must contain at least one uppercase letter.");
        }

        // Check for at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return new ValidationResult(false, "Password must contain at least one lowercase letter.");
        }

        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            return new ValidationResult(false, "Password must contain at least one digit.");
        }

        // Check for at least one special character
        if (!password.matches(SPECIAL_CHARACTER_REGEX)) {
            return new ValidationResult(false, "Password must contain at least one special character.");
        }

        // If all checks pass
        return new ValidationResult(true, "Password is valid.");
    }
}
