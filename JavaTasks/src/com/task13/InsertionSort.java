package com.task13;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = new int[] {64, 42, 73, 12, 54, 33};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int current = array[i];
            int j = i;
            while(j > 0 && array[j-1] > current)
            {
                array[j] = array[j-1];
                j--;
            }
            array[j] = current;
        }
    }
}
