package com.task7_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Zd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = getValidYear(scanner);
        int month = getValidMonth(scanner);
        int day = getValidDay(scanner, year, month);
        int hours = getValidHours(scanner);
        int minutes = getValidMinutes(scanner);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hours, minutes); // Месяцы в Calendar начинаются с 0 (январь)

        Date date = calendar.getTime();

        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());

        scanner.close();
    }

    private static int getValidYear(Scanner scanner) {
        int year;
        while (true) {
            System.out.println("Введите год:");
            year = scanner.nextInt();
            if (year > 0) {
                break;
            } else {
                System.out.println("Неверно введены значения. Попробуйте снова.");
            }
        }
        return year;
    }

    private static int getValidMonth(Scanner scanner) {
        int month;
        while (true) {
            System.out.println("Введите месяц (1-12):");
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            } else {
                System.out.println("Неверно введены значения. Попробуйте снова.");
            }
        }
        return month;
    }

    private static int getValidDay(Scanner scanner, int year, int month) {
        int day;
        while (true) {
            System.out.println("Введите день:");
            day = scanner.nextInt();
            if (day >= 1 && day <= getDaysInMonth(year, month)) {
                break;
            } else {
                System.out.println("Неверно введены значения. Попробуйте снова.");
            }
        }
        return day;
    }

    private static int getValidHours(Scanner scanner) {
        int hours;
        while (true) {
            System.out.println("Введите часы (0-23):");
            hours = scanner.nextInt();
            if (hours >= 0 && hours <= 23) {
                break;
            } else {
                System.out.println("Неверно введены значения. Попробуйте снова.");
            }
        }
        return hours;
    }

    private static int getValidMinutes(Scanner scanner) {
        int minutes;
        while (true) {
            System.out.println("Введите минуты (0-59):");
            minutes = scanner.nextInt();
            if (minutes >= 0 && minutes <= 59) {
                break;
            } else {
                System.out.println("Неверно введены значения. Попробуйте снова.");
            }
        }
        return minutes;
    }

    private static int getDaysInMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // Месяцы в Calendar начинаются с 0 (январь)
        return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }
}