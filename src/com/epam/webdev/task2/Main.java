package com.epam.webdev.task2;

import com.epam.webdev.task2.service.*;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{31, 44, 1, 6}, {3, 0, -99}, {-4, 9, 8}};

        Sorter.sort(array, true, new ArrayComparatorByMaxElement());
        System.out.println("Sorted my sum ascending:\n" + arrayToString(array));

        Sorter.sort(array, false, new ArrayComparatorByMaxElement());
        System.out.println("Sorted my sum descending:\n" + arrayToString(array));

        Sorter.sort(array, true, new ArrayComparatorByMaxElement());
        System.out.println("Sorted my max value ascending:\n" + arrayToString(array));

        Sorter.sort(array, false, new ArrayComparatorByMaxElement());
        System.out.println("Sorted my max value descending:\n" + arrayToString(array));

        Sorter.sort(array, true, new ArrayComparatorByMinElement());
        System.out.println("Sorted my min value ascending:\n" + arrayToString(array));

        Sorter.sort(array, false, new ArrayComparatorByMinElement());
        System.out.println("Sorted my min value descending:\n" + arrayToString(array));
    }

    public static String arrayToString(int[][] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                stringBuilder.append(array[i][j]);
                stringBuilder.append("  ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
