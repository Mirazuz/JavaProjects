package com.task5;

import javax.swing.*;
import java.util.Scanner;

public class Main extends JFrame {

    private static Fourth fourthInstance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Введите номер задания: (First, Second, Third, Fourth) или 'exit' для выхода:");
            name = scanner.nextLine();

            switch (name) {
                case "First":
                    new First();
                    break;
                case "Second":
                    new Second();
                    break;
                case "Third":
                    if (args.length == 0) {
                        System.out.println("Image not found");
                    } else {
                        new Third("C:\\1.jpg");
                    }
                    break;
                case "Fourth":
                if (fourthInstance == null || !fourthInstance.isDisplayable()) {
                    fourthInstance = new Fourth();
                    fourthInstance.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    fourthInstance.setVisible(true);
                }
                break;
                case "exit":
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Выбрана неверная команда");
                    break;
            }
        }
        if (fourthInstance != null) fourthInstance.close();

        System.out.println("Программа завершена.");
    }
}