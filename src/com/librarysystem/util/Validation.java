/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librarysystem.util;

import java.util.regex.Pattern;

/**
 *
 * @author anuru
 */
public class Validation {
    private static final Pattern LIB_NAME_PATTERN = Pattern.compile("^[a-zA-Z]+$");
    private static final Pattern LIB_ID_PATTERN = Pattern.compile("^\\d{4}$");
    private static final Pattern LOCATION_PATTERN = Pattern.compile("^[a-zA-Z\\s]+$");
    private static final Pattern CONTACT_NUMBER_PATTERN = Pattern.compile("^98\\d{8}$");

    
    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }
    
    public static boolean isValidLibId(int libId) {
        return LIB_ID_PATTERN.matcher(String.valueOf(libId)).matches();
    }
    
    public static boolean isValidName(String name) {
        return LIB_NAME_PATTERN.matcher(name).matches();
    }
    
    public static boolean isValidLocation(String location) {
        return LOCATION_PATTERN.matcher(location).matches();
    }
    
    public static boolean isValidContact(String contact) {
        return CONTACT_NUMBER_PATTERN.matcher(contact).matches();
    }
    
    public static boolean isValidTotalBooks(int books) {
        return books > 0;
    }
    
    public static boolean isValidStaffCount(int staff) {
        return staff > 0 && staff < 1000;
    }
    
    public static boolean isValidEstdYear(int year){
        return year > 1500 && year < 2025;
    }
    
}

