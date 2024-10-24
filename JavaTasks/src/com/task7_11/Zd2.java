package com.task7_11;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class Zd2 {
    public static void main(String[] args) {
        Date currentDate = new Date(); //системное
        
        //

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Текущая дата и время: " + sdf.format(currentDate));

        Scanner scanner = new Scanner(System.in);

        // Пользователь вводит свою дату:
        System.out.println("Введите дату и время в формате 'yyyy-MM-dd HH:mm:ss':");
        String userInput = scanner.nextLine();

        try {
            // Преобразуем введенную строку в объект Date
            Date userDate = sdf.parse(userInput);

            // Сравниваем даты
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата и время раньше текущей.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата и время позже текущей.");
            } else {
                System.out.println("Введенная дата и время совпадают с текущей.");
            }
        } catch (ParseException e) {
            System.out.println("Ошибка: неверный формат даты и времени.");
        } finally {
            scanner.close();
        }
        
    }
}
