package com.epam.webdev.task1;

import com.epam.webdev.task1.entity.Array;
import com.epam.webdev.task1.service.ArraySearcher;
import com.epam.webdev.task1.util.FillArray;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        int[] inputValues = {12, 123, 453, 233, 0, 1, 7, -1, -125, 6, 8};
        Array array = new Array(inputValues);

        System.out.println("Index of value 1: " + array.binarySearch(1));
        System.out.println("Max value: " + array.findMaxValue());
        System.out.println("Min value: " + array.findMinValue());
        System.out.println("Fibonacci values: " + ArraySearcher.findFibonacciNumbers(array));
        System.out.println("Unique three digit numbers: " + ArraySearcher.findNumbersConsistsOfThreeUniqueDigits(array));
        System.out.println("Prime numbers: " + ArraySearcher.findPrimeNumbers(array));

        array.bubbleSort();
        System.out.println("Bubble sorted array: " + array);

        FillArray.fillArrayRandomly(array);
        array.mergeSort();
        System.out.println("New merge sorted array: " + array);

        FillArray.fillArrayRandomly(array);
        array.quickSort();
        System.out.println("New quick sorted array: " + array);

        System.out.println("Array from file: " + FillArray.createArrayFromFile("data.txt"));
        System.out.println("Fill array from console: ");
        FillArray.fillArrayFromConsole(array);
        System.out.println("Your array from console: " + array);

    }
}
