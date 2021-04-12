package com.epam.webdev.task1.service;

import com.epam.webdev.task1.entity.Array;

import java.util.ArrayList;
import java.util.List;

public class ArraySearcher {

    public static Array findPrimeNumbers(Array array) {

        if (array == null) {
            // throw Exception
        }

        List<Integer> primaryNumbers = new ArrayList<>();

        for (int i = 1; i < array.getValues().length; i++) {
            if (checkIfPrimary(array.getValues()[i])) {
                primaryNumbers.add(array.getValues()[i]);
            }
        }

        return new Array(primaryNumbers);
    }

    private static boolean checkIfPrimary(int input) {
        boolean isPrimary = true;

        for (int i = 2; i <= input / 2; ++i) {
            if (input % i == 0) {
                isPrimary = false;
                break;
            }
        }

        return isPrimary;
    }

    public static Array findFibonacciNumbers(Array array) {

        if (array == null) {
            // throw Exception
        }

        List<Integer> fibonacciList = new ArrayList<>();

        for (int i = 0; i < array.getValues().length; i++) {
            if (isPerfectSquare(5 * array.getValues()[i] * array.getValues()[i] + 4)
                    || isPerfectSquare(5 * array.getValues()[i] * array.getValues()[i] - 4)) {
                fibonacciList.add(array.getValues()[i]);
            }
        }

        return new Array(fibonacciList);
    }

    private static boolean isPerfectSquare(int num) {
        int n = (int) (Math.sqrt(num));
        return (n * n == num);
    }

    private static boolean checkIfNumberConsistsOfThreeUniqueDigits(int number) {
        return Math.abs(number / 100) > 0
                && Math.abs(number / 1000) < 10
                && number % 10 != number / 100
                && number % 10 != (number / 10) % 10
                && number / 100 != (number / 10) % 10;
    }

    public static Array findNumbersConsistsOfThreeUniqueDigits(Array array) {

        if (array == null) {
            // throw Exception
        }

        List<Integer> uniqueNumbersList = new ArrayList<>();

        for (int i = 0; i < array.getValues().length; i++) {
            if (checkIfNumberConsistsOfThreeUniqueDigits(array.getValues()[i])) {
                uniqueNumbersList.add(array.getValues()[i]);
            }
        }

        return new Array(uniqueNumbersList);
    }
}
