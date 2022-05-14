package com.bridgelabz;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {

    @AfterEach
    void tearDown() {
    }

    @Test
    void firstName() {
        Junit obj1 = new Junit();
        boolean result = obj1.firstName("Abc");
        assertTrue(result);
    }

    @Test
    void lastName() {
        Junit obj1 = new Junit();
        boolean result = obj1.lastName("Xyz");
        assertTrue(result);
    }

    @Test
    void emailId() {
        Junit obj1 = new Junit();
        boolean result = obj1.emailId("abc.vvv@bl.co.sy");
        assertTrue(result);
    }

    @Test
    void phoneNumber() {
        Junit obj1 = new Junit();
        boolean result = obj1.phoneNumber("9123456789");
        assertTrue(result);
    }


    @Test
    void password() {
        Junit obj1 = new Junit();
        boolean result = obj1.password("Xyz");
        assertTrue(result);

    }
}