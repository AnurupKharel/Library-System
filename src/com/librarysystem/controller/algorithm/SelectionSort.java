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
 * Provides a static method to perform selection sort on a list of `LibraryModel` objects.
 * The sorting criteria (field and order) is specified by the input parameter.
 */
public class SelectionSort {
    
    /**
     * Sorts the provided list of `LibraryModel` objects using the selection sort algorithm
     * based on the specified sorting criterion.
     *
     * @param list the list of `LibraryModel` objects to sort
     * @param item the sorting criterion (e.g., "Total Books (Ascending)")
     */
    public static void selectionSort(List<LibraryModel> list, String item){
        int size = list.size();
        
            // Iterate through each element except the last one
            for(int step = 0; step < size - 1; step++) {
                
                // Assume the current step index is the smallest/largest
                int minIndex = step;

                // Determine sorting logic based on criteria and update index
                if (item.equals("Total Books (Ascending)")){
                    
                    for(int next = step + 1; next < size; next++) {
                        if(list.get(next).getTotalBooks() < list.get(minIndex).getTotalBooks()){
                            minIndex = next;

                        }
                    }
         
                }else if(item.equals("Total Books (Descending)")){
                   
                    for(int next = step + 1; next < size; next++) {
                        if(list.get(next).getTotalBooks() > list.get(minIndex).getTotalBooks()){
                            minIndex = next;
                        }
                    }
                    
                }else if(item.equals("Staff Count (Ascending)")){
                   
                    for(int next = step + 1; next < size; next++) {
                        if(list.get(next).getStaffCount() < list.get(minIndex).getStaffCount()){
                            minIndex = next;
                        }
                    }
                    
                }else if(item.equals("Staff Count (Descending)")){
                   
                    for(int next = step + 1; next < size; next++) {
                        if(list.get(next).getStaffCount() > list.get(minIndex).getStaffCount()){
                            minIndex = next;
                        }
                    }
                    
                }
                
                // Swap the current elemt with smallest/largest found
                LibraryModel temp = list.get(step) ;
                list.set( step,list.get (minIndex) ) ;
                list.set(minIndex,temp);
            }
        
    }
}
