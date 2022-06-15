package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleEmail {
    public static final String EMAIL_PATTERN = "^([a-z]{3,}[.][0-9a-z]{2,}@[a-z]{2,}[.][0-9]{2,}[.][a-z]{2,})$";
    public boolean validateEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }
    }


