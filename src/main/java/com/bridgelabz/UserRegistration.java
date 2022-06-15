package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Pattern pattern;
    Matcher matcher;
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }


    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public static final String EMAIL_PATTERN = "^([a-z]{3}[.][a-z]{3}@[a-z]{2}[.][a-z]{2}[.][a-z]{2})$";

    public boolean validateEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }

    public static final String MOBILE_PATTERN = "^[0-9]{2}\\s[0-9]{10}$";

    public boolean validateMobileNumber(String MobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_PATTERN);
        Matcher matcher = pattern.matcher(MobileNumber);
        return matcher.matches();
    }

    public static final String RULE1_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&]).{8,}$";

    public boolean validateRule1(String Rule1Pattern) {
        Pattern pattern = Pattern.compile(RULE1_PATTERN);
        Matcher matcher = pattern.matcher(Rule1Pattern);
        return matcher.matches();


    }

    public static final String RULE2_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]).{8,}$";

    public boolean validateRule2(String Rule2Pattern) {
        Pattern pattern = Pattern.compile(RULE1_PATTERN);
        Matcher matcher = pattern.matcher(Rule2Pattern);
        return matcher.matches();
    }

    public static final String RULE3_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]).{8,}$";

    public boolean validateRule3(String Rule3Pattern) {
        Pattern pattern = Pattern.compile(RULE3_PATTERN);
        Matcher matcher = pattern.matcher(Rule3Pattern);
        return matcher.matches();
    }

    public static final String RULE4_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]){1,}(?=.*[*.!@$%^&]).{8,}$";


    public boolean validateRule4(String Rule4Pattern) {
        Pattern pattern = Pattern.compile(RULE4_PATTERN);
        Matcher matcher = pattern.matcher(Rule4Pattern);
        return matcher.matches();
    }
}
