package com.task11;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int A = scanner.nextInt();
        System.out.println("Введите второе число");
        int B = scanner.nextInt();

        compare(A, B);

    }

    public static void compare(int A, int B)
    {
        if (A < B)
        {
            if ((A != B) & (A > 0))
            {
                compare(A, B-1);
                System.out.println(B);
            }
        } 
        if (A > B)
        {
            if ((A != B) & (B > 0))
            {
                compare(A-1, B);
                System.out.println(A);
            }
        }
    }
}
