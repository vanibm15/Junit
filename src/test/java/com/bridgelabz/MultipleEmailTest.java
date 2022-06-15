package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.*;

class MultipleEmailTest {

    @Test
    void validateEmail() {
            MultipleEmail multipleEmail = new MultipleEmail();
            boolean result = multipleEmail.validateEmailId("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        }
    @Test
    void validateEmail1() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("van.bm15@bl.95.gmail");
        Assert.assertTrue(result);

    }
    @Test
    void validateEmail2() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("abc.mnb621@bl.95.com");
        Assert.assertTrue(result);
    }
    @Test
    void validateEmail3() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("abc.xyz100@bl.963.in");
        Assert.assertTrue(result);
    }
    @Test
    void validateEmail4() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("abc.c12@bl.456.in");
        Assert.assertTrue(result);
    }
    @Test
    void validateEmail5() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("abc.897@bk.321.in");
        Assert.assertTrue(result);
    }
    @Test
    void validateEmail6() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("def.123@bl.12.in");
        Assert.assertTrue(result);
    }
    @Test
    void validateEmail7() {
        MultipleEmail multipleEmail = new MultipleEmail();
        boolean result = multipleEmail.validateEmailId("abc.100@ab.50.com");
        Assert.assertTrue(result);
    }

        }


