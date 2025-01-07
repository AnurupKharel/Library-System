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
public class BinarySearch {
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
