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
 * Provides a static method to perform insertion sort on a list of `LibraryModel` objects.
 * The sorting criterion (field and order) is specified by the input parameter.
 */
public class InsertionSort {
    /**
     * Sorts the provided list of `LibraryModel` objects using the insertion sort algorithm
     * based on the specified sorting criterion.
     *
     * @param list the list of `LibraryModel` objects to sort
     * @param item the sorting criterion (e.g., "Library ID (Ascending)")
     */
    public static void insertionSort(List<LibraryModel> list, String item){
       
        int size = list.size();

        // Start from the second element (index 1) and move towards the right
        for (int step = 1; step < size; step++) {
            LibraryModel key = list.get(step);
            int j = step - 1;

            // Compare key with each element on the left of it until
            // an element smaller than it is found.
            // Determine sorting logic based on criteria and update index
            if(item.equals("Library ID (Ascending)")){
                while (j >= 0 && key.getLibID() < list.get(j).getLibID()) {
                    list.set(j+1, list.get(j));
                    -- j;
                }
            }else if(item.equals("Library ID (Descending)")){
                while (j >= 0 && key.getLibID() > list.get(j).getLibID()) {
                    list.set(j+1, list.get(j));
                    -- j;    
                }
            }else if(item.equals("Estd.Year (Ascending)")){
                while (j >= 0 && key.getEstablishedYear() < list.get(j).getEstablishedYear()) {
                    list.set(j+1, list.get(j));
                    -- j;    
                }
            }else if(item.equals("Estd.Year (Descending)")){
                while (j >= 0 && key.getEstablishedYear() > list.get(j).getEstablishedYear()) {
                    list.set(j+1, list.get(j));
                    -- j;    
                }
            }

        // Place key element in the correct position
        list.set(j+1,key);
   
        }

    }
}
