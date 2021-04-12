package com.epam.webdev.task2.service;

import java.util.Comparator;

public class ArrayComparatorBySum implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        if(o1 == null || o2 == null) {
            // throw Exception
        }

        return findSum(o1) - findSum(o2);
    }

    private static int findSum(int[] array){
        if(array == null){
            //throw Exception
        }

        int sum = 0;

        for (int value : array) {
            sum = sum + value;
        }

        return sum;
    }
}
