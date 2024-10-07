package com.task4;

import java.util.GregorianCalendar;

public class kalendar {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        
        System.out.println(" ");

        int year = calendar.get(GregorianCalendar.YEAR);

        int month = calendar.get(GregorianCalendar.MONTH) + 1;

        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Год: " + year + " Месяц: " + month + " День: " + day + " ");

        calendar.setTimeInMillis(1234567898765L);

        System.out.println(" ");

        int year1 = calendar.get(GregorianCalendar.YEAR);

        int month1 = calendar.get(GregorianCalendar.MONTH) + 1;

        int day1 = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Год: " + year1 + " Месяц: " + month1 + " День: " + day1 + " ");

    }
    
}
