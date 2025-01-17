/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.librarysystem.controller.algorithm;

import com.librarysystem.model.LibraryModel;
import java.util.List;

/**
 *
 * @author anuru
 */
public class InsertionSort {
    public static void insertionSort(List<LibraryModel> list, String item){
       
        int size = list.size();

        for (int step = 1; step < size; step++) {
            LibraryModel key = list.get(step);
            int j = step - 1;

            // Compare key with each element on the left of it until
            // an element smaller than it is found.
            // For descending order, change key<array[j] to key>array[j].
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

        // Place key at after the element just smaller than it.
        list.set(j+1,key);
   
        }

    }
}
