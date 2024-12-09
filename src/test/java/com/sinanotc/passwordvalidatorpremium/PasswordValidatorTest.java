package com.sinanotc;

import com.sinanotc.passwordvalidatorpremium.*;
import com.cthiebaud.passwordvalidator.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorPremiumTest {

    private static PasswordValidatorPremium validator;

    @BeforeAll
    public static void setup() {
        validator = new PasswordValidatorPremium();
    }

    @Test
    public void testNullPassword() {
        ValidationResult result = validator.validate(null);
        assertFalse(result.isValid());
        assertEquals("Password cannot be null or empty.", result.message());
    }

    @Test
    public void testEmptyPassword() {
        ValidationResult result = validator.validate("");
        assertFalse(result.isValid());
        assertEquals("Password cannot be null or empty.", result.message());
    }

    @Test
    public void testShortPassword() {
        ValidationResult result = validator.validate("sinan!");
        assertFalse(result.isValid());
        assertEquals("Password must be at least 8 characters long.", result.message());
    }

    @Test
    public void testMissingUppercase() {
        ValidationResult result = validator.validate("harischmarn!");
        assertFalse(result.isValid());
        assertEquals("Password must contain at least one uppercase letter.", result.message());
    }

    @Test
    public void testMissingLowercase() {
        ValidationResult result = validator.validate("HARISCHMARN!");
        assertFalse(result.isValid());
        assertEquals("Password must contain at least one lowercase letter.", result.message());
    }

    @Test
    public void testMissingDigit() {
        ValidationResult result = validator.validate("Harischmarnpupsi!");
        assertFalse(result.isValid());
        assertEquals("Password must contain at least one digit.", result.message());
    }

    @Test
    public void testMissingSpecialCharacter() {
        ValidationResult result = validator.validate("Harischmarn1");
        assertFalse(result.isValid());
        assertEquals("Password must contain at least one special character.", result.message());
    }

    public void testValidPassword() {
        String validPassword = "Harischamrn1!";

        ValidationResult result = validator.validate(validPassword);
        assertTrue(result.isValid(), "Password should be valid.");
        assertEquals("Password is valid.", result.message());
    }
}
