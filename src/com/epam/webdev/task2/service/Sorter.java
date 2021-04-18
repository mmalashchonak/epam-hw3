package com.epam.webdev.task2.service;

import java.util.Comparator;

public class Sorter {

    public static void sort(int[][] array, Comparator<int[]> criteria) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (criteria.compare(array[j], array[j + 1]) > 0) {
                    int[] temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void invert(int[][] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int[] temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
