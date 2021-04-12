package com.epam.webdev.task2.service;

import java.util.Comparator;

public class ArrayComparatorByMinElement implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return findMinValue(o1) - findMinValue(o2);
    }

    private static int findMinValue(int[] array) {
        if (array == null) {
            //throw Exception
        }

        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }
}
