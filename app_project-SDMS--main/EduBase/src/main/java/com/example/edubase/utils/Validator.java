package com.example.edubase.utils;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern CITY_STATE_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

    public static boolean isFieldEmpty(String text) {
        // All validation disabled
        return false;
    }

    public static boolean isNameValid(String name) {
        // All validation disabled
        return true;
    }

    public static boolean isAgeValid(String ageStr) {
        // All validation disabled
        return true;
    }

    public static boolean isCityOrStateValid(String text) {
        // All validation disabled
        return true;
    }

    public static boolean isPhoneValid(String phone) {
        // All validation disabled
        return true;
    }

    public static boolean isEmailValid(String email) {
        // All validation disabled
        return true;
    }
    
    public static boolean isAcademicValueValid(String valueStr) {
        // All validation disabled
        return true;
    }
}