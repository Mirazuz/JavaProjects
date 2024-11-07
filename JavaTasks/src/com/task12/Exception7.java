package com.task12;
import java.util.Scanner;

public class Exception7 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Введите значение: ");
        String key = myScanner.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("key set to empty");
        }
        return "\ndata for " + key;
    }

    public static void main(String[] args) {
        Exception7 exception7 = new Exception7();
        exception7.getKey();
    }
}