package com.task12;

import java.util.Scanner;

public class Exception4 {
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
        finally
        {
            System.out.println("Работа блока finally");
        }
    }

    public static void main(String[] args) {
        Exception4 exception4 = new Exception4();
        exception4.exceptionDemo();
    }

}
