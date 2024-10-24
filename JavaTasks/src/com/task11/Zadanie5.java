package com.task11;

public class Zadanie5 {

    public static void main(String[] args) {
        int N = 12345;
        int sum = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + sum);
    }

    public static int sumOfDigits(int N) {
        return sumOfDigitsHelper(N);
    }

    private static int sumOfDigitsHelper(int N) {
        if (N == 0) {
            return 0;
        }
        int lastDigit = N % 10; 
        int remainingNumber = N / 10; 
        return lastDigit + sumOfDigitsHelper(remainingNumber);
    }
}