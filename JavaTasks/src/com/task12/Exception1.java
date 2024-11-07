package com.task12;

public class Exception1 {
    public void exceptionDemo()
    {
        try
        {
            System.out.println(2/0);
        }
        catch (ArithmeticException e) 
        {
            System.out.println("\nНельзя делить на ноль !");
        }
    }

    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
    }
}




