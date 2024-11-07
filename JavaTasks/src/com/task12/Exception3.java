package com.task12;

import java.util.Scanner;

public class Exception3 {
        public void exceptionDemo()
    {
        // Scanner myScanner = new Scanner(System.in);
        // System.out.println("Enter an integer");
        // String intString = myScanner.next();
        // int i = Integer.parseInt(intString);
        // System.out.println(2 / i);

        try
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            myScanner.close();
        }
        catch (Exception e) 
        {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception3 exception3 = new Exception3();
        exception3.exceptionDemo();
    }
}
