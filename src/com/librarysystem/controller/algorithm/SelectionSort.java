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
public class SelectionSort {
    public static void selectionSort(List<LibraryModel> list, String item){
        int size = list.size();
        
            for(int step = 0; step < size - 1; step++) {
                int minIndex = step;

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
                LibraryModel temp = list.get(step) ;
                list.set( step,list.get (minIndex) ) ;
                list.set(minIndex,temp);
            }
        
    }
}
