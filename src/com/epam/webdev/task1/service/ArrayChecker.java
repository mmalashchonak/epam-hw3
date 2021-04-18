package com.epam.webdev.task1.service;

import com.epam.webdev.task1.entity.Array;

public class ArrayChecker {

    public static void checkArrayOnNull(Array array){
        if (array == null || array.getValues() == null) {
            // throw Exception
        }
    }
}
