package com.task12;
import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo()
    {
        try
        {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an integer");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
            myScanner.close();
        }
        catch (NumberFormatException e)
        {
            System.out.println("Введено неверное значение для типа данных Int");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Введено значение 0, нельзя делить на ноль !");
        }
        
    }

    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }

}
