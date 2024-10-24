package com.task11;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести число: ");

        int n = scanner.nextInt();

        printAll(n);
    }

    public static void printAll(int n) {
        if (n > 0) {
            printAll(n-1);
            System.out.println(n);
        }
    }
}

