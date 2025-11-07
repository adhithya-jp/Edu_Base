package com.example.edubase.utils;

import java.util.regex.Pattern;

public class Validator {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern CITY_STATE_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\d{10}$");
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");

    public static boolean isFieldEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    public static boolean isNameValid(String name) {
        // Only check if the field is not empty - other validation disabled
        return !isFieldEmpty(name);
    }

    public static boolean isAgeValid(String ageStr) {
        // Check for empty field and numbers only
        if (isFieldEmpty(ageStr)) return false;
        try {
            int age = Integer.parseInt(ageStr);
            return age > 0;  // Just ensure it's a positive number
        } catch (NumberFormatException e) {
            return false;  // Not a valid number
        }
    }

    public static boolean isCityOrStateValid(String text) {
        // Only check if the field is not empty - other validation disabled
        return !isFieldEmpty(text);
    }

    public static boolean isPhoneValid(String phone) {
        // Only check if it's a valid number - other validation disabled
        if (isFieldEmpty(phone)) return false;
        try {
            Long.parseLong(phone);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isEmailValid(String email) {
        // Basic check for @ symbol
        if (isFieldEmpty(email)) return false;
        int atCount = email.length() - email.replace("@", "").length();
        return atCount == 1;  // Exactly one @ symbol
    }
    
    public static boolean isAcademicValueValid(String valueStr) {
        // Check for empty field and numbers only
        if (isFieldEmpty(valueStr)) return false;
        try {
            int value = Integer.parseInt(valueStr);
            return value >= 0 && value <= 100;  // Keep the range check for grades
        } catch (NumberFormatException e) {
            return false;  // Not a valid number
        }
    }
}