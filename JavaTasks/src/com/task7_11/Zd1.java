package com.task7_11;

import java.util.Date;
import java.util.Scanner;

public class Zd1 {
    public static void main(String[] args) {
        Date date = new Date(); //получил задание

        long finaltime = date.getTime() + (7 * 60 * 60 * 60 * 1000); //сдал задание

        Date finaldate = new Date(finaltime);

        Scanner scanner = new Scanner(System.in);
        String surname;

        System.out.println("Введите фамилию: ");
        surname = scanner.nextLine();

        System.out.println("Фамилия разработчика: " + surname);        
        System.out.println("Время получения задания: " + date);
        System.out.println("Время сдачи экзамена: " + finaldate);
        
    }
}
