package com.epam.webdev.task1.util;

import com.epam.webdev.task1.entity.Array;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FillArray {

    public static final String NUMBERS_SEPARATOR = " ";

    public static void fillArrayRandomly(Array array) {

        if (array == null || array.getValues() == null) {
            // throw Exception
        }

        Random random = new Random();

        for (int i = 0; i < array.getValues().length; i++) {
            array.getValues()[i] = random.nextInt(1000);
        }
    }

    public static Array createArrayFromFile(String fileName) throws FileNotFoundException {

        if (fileName == null) {
            //throw Exception
        }

        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        String input = "";
        if (scanner.hasNext()) {
            input = scanner.nextLine();
        }

        String[] arrayAsString = input.split(NUMBERS_SEPARATOR);
        List<Integer> arrayList = new ArrayList<>();

        for (String s : arrayAsString) {
            try {
                arrayList.add(Integer.parseInt(s));
            } catch (Exception e) {
                //Wrong input Exception
            }
        }

        return new Array(arrayList);
    }

    public static void fillArrayFromConsole(Array array) {

        if (array == null || array.getValues() == null) {
            // throw Exception
        }

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.getValues().length; i++) {
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.println("Your input is incorrect. Please, try again:");
            }

            array.getValues()[i] = scanner.nextInt();
        }
    }
}
