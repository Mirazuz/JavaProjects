package com.task11;

public class Zadanie10 {

    public static void main(String[] args) {
        int n = 12345;
        int reversed = reverseNumber(n);
        System.out.println("Исходное число: " + n);
        System.out.println("Развёрнутое число: " + reversed);
    }

    public static int reverseNumber(int n) {
        return reverseNumberHelper(n, 0);
    }

    private static int reverseNumberHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        int lastDigit = n % 10;
        int remainingNumber = n / 10;
        reversed = reversed * 10 + lastDigit;
        return reverseNumberHelper(remainingNumber, reversed);
    }
}
