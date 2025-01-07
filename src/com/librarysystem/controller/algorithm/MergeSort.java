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

public class MergeSort {
    public static List<LibraryModel> sort(List<LibraryModel> list, String item) {
        if (list.size() <= 1) {
            return list;
        }

        List<LibraryModel> first = new ArrayList<>(list.subList(0, list.size() / 2));
        List<LibraryModel> second = new ArrayList<>(list.subList(list.size() / 2, list.size()));

        sort(first, item);
        sort(second, item);
        merge(first, second, list, item);
        return list;
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
