package com.task12;

public class Exception5 {
    
    public void printMessage(String key)
    {
        String message = getDetails(key);
        System.out.println(message);
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
        Exception5 exception5 = new Exception5();
        exception5.printMessage(null); //нулевое значение
        exception5.printMessage("null"); //правильное значение

    }
}
