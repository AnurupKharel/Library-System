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
 * @author anuru
 */
/*public class MergeSort {
    public static void sort(List<LibraryModel> list,String item){
        // if no data in the given list then
        // there is no need to perform mergeSort
        if (list.size() <= 1) { return; }

        // creating new lists first and second
        // dividing each array into half
        List<LibraryModel> first = new ArrayList(list.size()/2);
        List<LibraryModel> second = new ArrayList (list.size() - first.size());
        

        //Copy the first half into the first Array
        for( int i = 0 ; i < first.size(); i++){
            first.set(i, list.get(i));
        }

        //Copy the second half into the second Array
        for( int j = 0; j < second.size(); j++){
            second.set(j, list.get(j));
        }
            //using recursive method
            sort(first, item);
            sort(second, item);
            merge(first,second,list, item);
        
    }
    public static void merge(List<LibraryModel> first, List<LibraryModel> second, List<LibraryModel> list, String item){
        int fCounter = 0; //firstCounter
        int sCounter= 0; //secondCounter
        int lCounter = 0; //listCounter

        // finding the minimum value and merging
        while(fCounter<first.size() && sCounter <second.size()){
            if(item.equals("Name (Ascending)")){
                if(first.get(fCounter).getLibName() .compareToIgnoreCase(second.get(sCounter).getLibName()) < 0 ){
                        list.set(lCounter,first.get(fCounter));
                        fCounter++;
            } else{
                //a[aCounter] = second[sCounter];
                list.set(lCounter,first.get(sCounter));
                sCounter++;

                lCounter++;

            }
            }
            

        }
        // merging the rest of the value if in first array
        while(fCounter<first.size()){
            //l[lCounter] = first[fCounter];
            list.set(lCounter,first.get(fCounter));
            fCounter++;
            lCounter++;

        }

        // merging the rest of the value if in second array
        while(sCounter<second.size()){
            //a[aCounter] = second[sCounter];
            list.set(lCounter,second.get(sCounter));
            sCounter++;
            lCounter++;
        }
        }
}
*/
public class MergeSort {
    public static void sort(List<LibraryModel> list, String item) {
        if (list.size() <= 1) {
            return;
        }

        List<LibraryModel> first = new ArrayList<>(list.subList(0, list.size() / 2));
        List<LibraryModel> second = new ArrayList<>(list.subList(list.size() / 2, list.size()));

        sort(first, item);
        sort(second, item);
        merge(first, second, list, item);
    }

    public static void merge(List<LibraryModel> first, List<LibraryModel> second, List<LibraryModel> list, String item) {
        int fCounter = 0;
        int sCounter = 0;
        int lCounter = 0;

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

        while (fCounter < first.size()) {
            list.set(lCounter, first.get(fCounter));
            fCounter++;
            lCounter++;
        }

        while (sCounter < second.size()) {
            list.set(lCounter, second.get(sCounter));
            sCounter++;
            lCounter++;
        }
    }
}
