package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.testng.Assert;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertSame;

class UserRegistraionTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateFirstName("Vani");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateLastName("Shree");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateEmailId("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateMobileNumber("91 7894561231");
        Assert.assertTrue(result);

    }

    @Test
    public void givenRule1_Minimumcharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule1("Vani@123");
        Assert.assertTrue(result);

    }

    @Test
    public void givenRule2_Minimumcharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule2("Vani@123");
        Assert.assertTrue(result);

    }

    @Test
    public void givenRule3_Minimumcharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule3("Vani@123");
        Assert.assertTrue(result);

    }

    @Test
    public void givenRule4_Minimumcharacter_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validateRule4("Hnni@123");
        Assert.assertTrue(result);
    }
}