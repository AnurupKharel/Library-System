/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librarysystem.controller.algorithm;

import com.librarysystem.model.LibraryModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 23048644 Anurup Kharel
 */
/**
 * This class provides the merge sort algorithm to sort a list of `LibraryModel` objects
 * based on a specified field and order.
 */
public class MergeSort {
    
    /**
     * Sorts the given list of `LibraryModel` objects using the merge sort algorithm.
     * The list is divided into two sub lists recursively until they have one element,
     * and then they are merged in the correct order based on the specified sorting criterion.
     *
     * @param list the list of `LibraryModel` objects to be sorted
     * @param item the sorting criterion (e.g., "Name (Ascending)")
     * @return the sorted list of `LibraryModel` objects
     */
    public static List<LibraryModel> sort(List<LibraryModel> list, String item) {
        // Base case: if the list has one or no element, it's already sorted
        if (list.size() <= 1) {
            return list;
        }

        // Split the list into two halves
        List<LibraryModel> first = new ArrayList<>(list.subList(0, list.size() / 2));
        List<LibraryModel> second = new ArrayList<>(list.subList(list.size() / 2, list.size()));

        // Recursively sort both halves
        sort(first, item);
        sort(second, item);
        
        // Merge the two sorted halves back together
        merge(first, second, list, item);
        return list;
    }

     /**
     * Merges two sorted sub lists (first and second) into the original list, 
     * ensuring the merged list is sorted based on the specified sorting criterion.
     *
     * @param first  the first sorted sub list
     * @param second the second sorted sub list
     * @param list   the original list where the merged result will be placed
     * @param item   the sorting criterion (e.g., "Name (Ascending)")
     */
    public static void merge(List<LibraryModel> first, List<LibraryModel> second, List<LibraryModel> list, String item) {
        int fCounter = 0;
        int sCounter = 0;
        int lCounter = 0;

        // Merge the two lists by comparing their elements
        while (fCounter < first.size() && sCounter < second.size()) {
            if (item.equals("Name (Ascending)")) {
                if (first.get(fCounter).getLibName().compareToIgnoreCase(second.get(sCounter).getLibName()) < 0) {
                    list.set(lCounter, first.get(fCounter));
                    fCounter++;
                } else {
                    list.set(lCounter, second.get(sCounter));
                    sCounter++;
                }
            }else{
                if (first.get(fCounter).getLibName().compareToIgnoreCase(second.get(sCounter).getLibName()) > 0) {
                    list.set(lCounter, first.get(fCounter));
                    fCounter++;
                } else {
                    list.set(lCounter, second.get(sCounter));
                    sCounter++;
                }
            }
            lCounter++;
        }

        // If there are any remaining elements in the first list, add them to the result
        while (fCounter < first.size()) {
            list.set(lCounter, first.get(fCounter));
            fCounter++;
            lCounter++;
        }

        // If there are any remaining elements in the second list, add them to the result
        while (sCounter < second.size()) {
            list.set(lCounter, second.get(sCounter));
            sCounter++;
            lCounter++;
        }
        
    }
   
}
