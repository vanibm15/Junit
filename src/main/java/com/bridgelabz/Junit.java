package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Junit {
    static Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");
    Matcher matcher;

    public boolean firstName(String firstName) {
        String firstNamepattern = ("^[A-Z][a-z]{2,}$");
        pattern = Pattern.compile(firstName);

        matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean lastName(String lastName) {
        String lastNamepattern = ("^[A-Z][a-z]{2,}$");
        pattern = Pattern.compile(lastName);

        matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean emailId(String emailId) {
        String emailIdpattern = ("abc.[a-z]{3,}@bl.co.[a-z]{2}$");
        pattern = Pattern.compile(emailId);

        matcher = pattern.matcher(emailId);
        return matcher.matches();
    }

    public boolean phoneNumber(String phoneNumber) {
        String phoneNumberpattern = ("[0-9]{10,}$");
        pattern = Pattern.compile(phoneNumber);

        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean password(String password) {
        String phoneNumberpattern = ("^\\w(?=.[0-9])(?=.[A-Z])(?=.[@#$%&!^+-?.,_]).{8,}$");
        pattern = Pattern.compile(password);

        matcher = pattern.matcher(password);
        return matcher.matches();
    }


    public static void main(String[] args) {
        Junit obj1 = new Junit();
        System.out.println(obj1.firstName("Vani"));
        System.out.println(obj1.lastName("Shree"));
        System.out.println(obj1.phoneNumber("9123456789"));
        System.out.println(obj1.emailId("abc.vvv.@bl.co.bm"));
        System.out.println(obj1.password("Manavachari@123"));
    }


}
