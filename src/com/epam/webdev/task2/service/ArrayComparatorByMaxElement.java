package com.epam.webdev.task2.service;

import java.util.Comparator;

public class ArrayComparatorByMaxElement implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return findMaxValue(o1) - findMaxValue(o2);
    }

    private static int findMaxValue(int[] array) {
        if (array == null) {
            //throw Exception
        }

        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        return maxValue;
    }
}
