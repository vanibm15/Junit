package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean passwordValidation(String email) {
        String pattern = "([a-zA-Z0-9.-]{3,})[a-zA-Z0-9.-][@][a-zA-Z0-9.-_][a-zA-Z0-9.-_]{3,}[a-zA-Z0-9.-_]*";
        Pattern pass = Pattern.compile(pattern);
        Matcher match = pass.matcher(email);
        if (match.matches()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(passwordValidation("amolnagose12@gmail.com"));
    }
}
