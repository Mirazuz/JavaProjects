package com.task12;

public class Exception6 {
    
    public void printMessage(String key)
    {
        try
        {
            String message = getDetails(key);
            System.out.println(message);
        }
        catch (NullPointerException e)
        {
            //System.out.println("null key in getDetails");
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getDetails(String key)
    {
        if (key == null)
        {
            throw new NullPointerException("null key in getDetails");
        }
        return "\ndata for " + key;
    }

    public static void main(String[] args) {
        Exception6 exception6 = new Exception6();
        exception6.printMessage(null); //нулевое значение
        exception6.printMessage("null"); //правильное значение

    }
}

