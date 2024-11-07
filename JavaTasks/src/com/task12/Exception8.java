package com.task12;
import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            try {
                System.out.println("Enter a key:");
                String key = myScanner.next();
                printDetails(key);
                flag = true;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте еще раз.");
            }
        }
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("null")) {
            throw new Exception("key set to empty");
        }
        return "\ndata for " + key;
    }

    public static void main(String[] args) {
        Exception8 exception8 = new Exception8();
        exception8.getKey();
    }
}