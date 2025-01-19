/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librarysystem.controller.algorithm;

import com.librarysystem.model.LibraryModel;
import java.util.List;

/**
 *
 * @author 23048644 Anurup Kharel
 */
/**
 * This class implements the Binary Search algorithm to search for a library
 * by its name within a sorted list of `LibraryModel` objects.
 */
public class BinarySearch {
    
    /**
     * Performs a binary search for a library by its name in a sorted list.
     * The search is case-insensitive and returns the `LibraryModel` if found,
     * or `null` if not found.
     *
     * @param searchValue the name of the library to search for
     * @param list        the sorted list of `LibraryModel` objects to search within
     * @param left        the starting index of the list segment to search
     * @param right       the ending index of the list segment to search
     * @return the `LibraryModel` object if found, or `null` if not found
     */
    public LibraryModel searchByName(String searchValue, List<LibraryModel> list,
            int left, int right) {

        // Base Case
        if (right < left) {
            return null;
        }

        // mid value
        int mid = (left + right) / 2;

        // checks whether searchKey lies on mid point
        if (searchValue.compareToIgnoreCase(list.get(mid).getLibName()) == 0) {
            return list.get(mid);
        } else if (searchValue.compareToIgnoreCase(list.get(mid).getLibName()) < 0) {
            return searchByName(searchValue, list, left, mid - 1);
        } else {
            return searchByName(searchValue, list, mid + 1, right);
        }
    }
}
