
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librarysystem.util;

import java.util.regex.Pattern;

/**
 *
 * @author 23048644 Anurup Kharel
 */
/**
 * Utility class for validating various fields related the library model.
 * Contains methods to validate library details.
 */
public class Validation {
    private static final Pattern LIB_NAME_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern LIB_ID_PATTERN = Pattern.compile("^\\d{3}$");
    private static final Pattern LOCATION_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern CONTACT_NUMBER_PATTERN = Pattern.compile("^98\\d{8}$");

     /**
     * Checks if a given string is null or empty.
     * 
     * @param value The string to check.
     * @return True if the string is null or empty, false otherwise.
     */
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
    /**
     * Validates the library ID to ensure it is a 3-digit number.
     * 
     * @param libId The library ID to validate.
     * @return True if the library ID is valid, false otherwise.
     */
    public static boolean isValidLibId(int libId) {
        return LIB_ID_PATTERN.matcher(String.valueOf(libId)).matches();
    }
    /**
     * Validates the library name to ensure it contains only letters and spaces.
     * 
     * @param name The library name to validate.
     * @return True if the library name is valid, false otherwise.
     */
    public static boolean isValidName(String name) {
        return LIB_NAME_PATTERN.matcher(name).matches();
    }
    /**
     * Validates the library location to ensure it contains only letters and spaces.
     * 
     * @param location The location to validate.
     * @return True if the location is valid, false otherwise.
     */
    public static boolean isValidLocation(String location) {
        return LOCATION_PATTERN.matcher(location).matches();
    }
    /**
     * Validates the contact number to ensure it starts with '98' and is 10 digits long.
     * 
     * @param contact The contact number to validate.
     * @return True if the contact number is valid, false otherwise.
     */
    public static boolean isValidContact(String contact) {
        return CONTACT_NUMBER_PATTERN.matcher(contact).matches();
    }
    /**
     * Validates the total number of books to ensure it is greater than zero.
     * 
     * @param books The total number of books to validate.
     * @return True if the total number of books is valid, false otherwise.
     */
    public static boolean isValidTotalBooks(int books) {
        return books > 0;
    }
    /**
     * Validates the staff count to ensure it is greater than zero and less than 1000.
     * 
     * @param staff The staff count to validate.
     * @return True if the staff count is valid, false otherwise.
     */
    public static boolean isValidStaffCount(int staff) {
        return staff > 0 && staff < 1000;
    }
    /**
     * Validates the year the library was established to ensure it is
     * between 1500 and 2024 (inclusive).
     * 
     * @param year The year to validate.
     * @return True if the year is valid, false otherwise.
     */
    public static boolean isValidEstdYear(int year){
        return year > 1500 && year < 2025;
    }
    
}

