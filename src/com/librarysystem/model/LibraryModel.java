/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.librarysystem.model;

/**
 *
 * @author anuru
 */
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
