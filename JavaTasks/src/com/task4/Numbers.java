package com.task4;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {

    Random generator = new Random(1000);
    System.out.println("Первые 50 случайных чисел");
    for(int i = 0; i <= 50; i++)
    {

        System.out.print(generator.nextInt(100) + " ");
    }

    }
    
}
