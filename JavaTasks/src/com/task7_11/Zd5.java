package com.task7_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Zd5 {
    private static final int SIZE = 100000;
    private static final int OPERATIONS = 10000;

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            int value = random.nextInt(SIZE);
            arrayList.add(value);
            linkedList.add(value);
        }

        
        System.out.println("Сравнение производительности ArrayList и LinkedList:");

        
        System.out.println("Добавление элементов:");
        measureAddPerformance(arrayList, "ArrayList");
        measureAddPerformance(linkedList, "LinkedList");

        
        System.out.println("Вставка элементов:");
        measureInsertPerformance(arrayList, "ArrayList");
        measureInsertPerformance(linkedList, "LinkedList");

        
        System.out.println("Удаление элементов:");
        measureRemovePerformance(arrayList, "ArrayList");
        measureRemovePerformance(linkedList, "LinkedList");

        
        System.out.println("Поиск элементов:");
        measureSearchPerformance(arrayList, "ArrayList");
        measureSearchPerformance(linkedList, "LinkedList");
    }

    private static void measureAddPerformance(List<Integer> list, String listType) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.add(random.nextInt(SIZE));
        }
        long endTime = System.nanoTime();
        System.out.println(listType + ": " + (endTime - startTime) + " наносекунд");
    }

    private static void measureInsertPerformance(List<Integer> list, String listType) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.add(random.nextInt(SIZE / 2), random.nextInt(SIZE));
        }
        long endTime = System.nanoTime();
        System.out.println(listType + ": " + (endTime - startTime) + " наносекунд");
    }

    private static void measureRemovePerformance(List<Integer> list, String listType) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.remove(random.nextInt(SIZE / 2));
        }
        long endTime = System.nanoTime();
        System.out.println(listType + ": " + (endTime - startTime) + " наносекунд");
    }

    private static void measureSearchPerformance(List<Integer> list, String listType) {
        Random random = new Random();
        long startTime = System.nanoTime();
        for (int i = 0; i < OPERATIONS; i++) {
            list.contains(random.nextInt(SIZE));
        }
        long endTime = System.nanoTime();
        System.out.println(listType + ": " + (endTime - startTime) + " наносекунд");
    }
}