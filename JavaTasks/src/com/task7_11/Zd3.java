package com.task7_11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Zd3 {
    public static void main(String[] args) {
        Date birthDate = new Date();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Введите формат записи: SHORT, MEDIUM, FULL или EXIT для выхода");
            String format = scanner.nextLine();

            switch (format) {
                case "SHORT":
                    SimpleDateFormat shortFormat = new SimpleDateFormat("yyyy.MM.dd");
                    System.out.println("Format SHORT: " + shortFormat.format(birthDate));
                    break;
                case "MEDIUM":
                    SimpleDateFormat mediumFormat = new SimpleDateFormat("E, y-M-d 'at' h:m:s");
                    System.out.println("Format MEDIUM: " + mediumFormat.format(birthDate));
                    break;
                case "FULL":
                    SimpleDateFormat fullFormat = new SimpleDateFormat("E, yyyy.MM.dd 'at' hh:mm:ss a zzz");
                    System.out.println("Format FULL: " + fullFormat.format(birthDate));
                    break;
                case "EXIT":
                    exit = true;
                    break;
                default:
                    System.out.println("Неверно введено значение ! Попробуйте снова.");
                    break;
            }
        }

        scanner.close();
    }
}