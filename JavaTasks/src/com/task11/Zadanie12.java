package com.task11;
import java.util.Scanner;

public class Zadanie12 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел, оканчивающее 0");

        printOddNumbers(scanner);

    }

    public static void printOddNumbers(Scanner scanner){
        int number = scanner.nextInt();

        if (number == 0){
            return;
        }
        else if (number % 2 != 0 & number != 0){
            System.out.println(number);
        }
        printOddNumbers(scanner);
    }
}
