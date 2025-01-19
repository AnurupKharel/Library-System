/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.librarysystem.model;

/**
 *
 * @author 23048644 Anurup Kharel
 */
/**
 * Represents a library with its details and properties. This class models the
 * data structure for storing information about a library.
 */
public class LibraryModel {

    // Unique identifier for the library
    private int libID;

    // Name of the library
    private String libName;

    // Location of the library
    private String location;

    // Type of library (e.g., public, private, academic)
    private String libType;

    // The year the library was established
    private int establishedYear;

    // Contact number of the library
    private String contactNumber;

    // Number of staff members working at the library
    private int staffCount;

    // Total number of books available in the library
    private int totalBooks;

    // Library's operating hours (e.g., "9:00 AM - 5:00 PM")
    private String operatingHours;

    /**
     * Constructor to initialize all properties of the library.
     *
     * @param libID Unique identifier for the library
     * @param libName Name of the library
     * @param location Location of the library
     * @param libType Type of library (e.g., public, private, academic)
     * @param establishedYear The year the library was established
     * @param contactNumber Contact number of the library
     * @param staffCount Number of staff members working at the library
     * @param totalBooks Total number of books available in the library
     * @param operatingHours Library's operating hours
     */
    public LibraryModel(int libID, String libName, String location, String libType, int establishedYear,
            String contactNumber, int staffCount, int totalBooks, String operatingHours) {
        this.libID = libID;
        this.libName = libName;
        this.location = location;
        this.libType = libType;
        this.establishedYear = establishedYear;
        this.contactNumber = contactNumber;
        this.staffCount = staffCount;
        this.totalBooks = totalBooks;
        this.operatingHours = operatingHours;
    }

    // Getter and Setter methods for each property
    /**
     * Gets the unique identifier for the library.
     *
     * @return Library ID
     */
    public int getLibID() {
        return libID;
    }

    /**
     * Sets the unique identifier for the library.
     *
     * @param libID Library ID
     */
    public void setLibID(int libID) {
        this.libID = libID;
    }

    /**
     * Gets the name of the library.
     *
     * @return Library name
     */
    public String getLibName() {
        return libName;
    }

    /**
     * Sets the name of the library.
     *
     * @param libName Library name
     */
    public void setLibName(String libName) {
        this.libName = libName;
    }

    /**
     * Gets the location of the library.
     *
     * @return Library location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the library.
     *
     * @param location Library location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the type of the library (e.g., public, private).
     *
     * @return Library type
     */
    public String getLibType() {
        return libType;
    }

    /**
     * Sets the type of the library.
     *
     * @param libType Library type
     */
    public void setLibType(String libType) {
        this.libType = libType;
    }

    /**
     * Gets the year the library was established.
     *
     * @return Year of establishment
     */
    public int getEstablishedYear() {
        return establishedYear;
    }

    /**
     * Sets the year the library was established.
     *
     * @param establishedYear Year of establishment
     */
    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    /**
     * Gets the contact number of the library.
     *
     * @return Contact number
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * Sets the contact number of the library.
     *
     * @param contactNumber Contact number
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * Gets the number of staff members working at the library.
     *
     * @return Number of staff
     */
    public int getStaffCount() {
        return staffCount;
    }

    /**
     * Sets the number of staff members working at the library.
     *
     * @param staffCount Number of staff
     */
    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    /**
     * Gets the total number of books available in the library.
     *
     * @return Total number of books
     */
    public int getTotalBooks() {
        return totalBooks;
    }

    /**
     * Sets the total number of books available in the library.
     *
     * @param totalBooks Total number of books
     */
    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    /**
     * Gets the operating hours of the library.
     *
     * @return Operating hours
     */
    public String getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the operating hours of the library.
     *
     * @param operatingHours Operating hours
     */
    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }
    /*
public class LibraryModel {
    private int libID;        
    private String libName;   
    private String location;
    private String libType;
    private int establishedYear;
    private String contactNumber;  
    private int staffCount;         
    private int totalBooks;        
    private String operatingHours;
    
    public LibraryModel(int libID, String libName, String location, String libType, int establishedYear, String contactNumber, int staffCount, int totalBooks, String operatingHours) {
        this.libID = libID;
        this.libName = libName;
        this.location = location;
        this.libType = libType;
        this.establishedYear = establishedYear;
        this.contactNumber = contactNumber;
        this.staffCount = staffCount;
        this.totalBooks = totalBooks;
        this.operatingHours = operatingHours;
    }
 
    public int getLibID() {
        return libID;
    }

    public void setLibID(int libID) {
        this.libID = libID;
    }

    public String getLibName() {
        return libName;
    }

    public void setLibName(String libName) {
        this.libName = libName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLibType() {
        return libType;
    }

    public void setLibType(String libType) {
        this.libType = libType;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public void setTotalBooks(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }
     
     
    
    
    /**
     * @param args the command line arguments
     */
    
    
}
