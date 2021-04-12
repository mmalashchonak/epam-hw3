package com.epam.webdev.task1.entity;

import java.util.List;

public class Array {

    private int[] values;

    public Array(List<Integer> values) {
        this.values = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            this.values[i] = values.get(i);
        }
    }

    public Array(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public void bubbleSort() {
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public void quickSort() {
        int low = 0;
        int high = values.length - 1;
        sortByPartition(values, low, high);
    }

    private void sortByPartition(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }

            while (array[j] > opora) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sortByPartition(array, low, j);

        if (high > i)
            sortByPartition(array, i, high);
    }

    public void mergeSort() {
        int[] helper = new int[values.length];
        sortByMerge(helper, 0, values.length - 1);
    }

    private void sortByMerge(int[] helper, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            sortByMerge(helper, low, middle);
            sortByMerge(helper, middle + 1, high);
            merge(helper, low, middle, high);
        }
    }

    private void merge(int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = values[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;

        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                values[k] = helper[i];
                i++;
            } else {
                values[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            values[k] = helper[i];
            k++;
            i++;
        }
    }

    public int binarySearch(int value) {
        int lowIndex = 0;
        int highIndex = values.length - 1;
        int index = runBinarySearchRecursively(values, value, lowIndex, highIndex);
        return index;
    }

    private int runBinarySearchRecursively(int[] array, int value, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (value == array[middle]) {
            return middle;
        } else if (value < array[middle]) {
            return runBinarySearchRecursively(
                    array, value, low, middle - 1);
        } else {
            return runBinarySearchRecursively(
                    array, value, middle + 1, high);
        }
    }

    public int findMinValue() {
        int minValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
        }

        return minValue;
    }

    public int findMaxValue() {
        int maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        return maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array = (Array) o;
        if (this.values.length != array.values.length) return false;

        boolean result = true;
        for (int i = 0; i < this.values.length; i++) {
            if (this.values[i] != array.values[i]) {
                result = false;
                break;
            }
        }

        return result;
    }

    @Override
    public int hashCode() {
        int result = 1;
        for (int value : values) {
            result = result * 31 + value;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(getClass().getName() + "@" + "values = [");
        for (int i = 0; i < this.values.length; i++) {
            result.append(this.values[i]).append(" ");
        }

        result = new StringBuilder(result.toString().trim());
        result.append("]");

        return result.toString();
    }

}
