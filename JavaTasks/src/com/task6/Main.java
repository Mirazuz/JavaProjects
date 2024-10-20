package com.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // 1 Пункт
        // MovableCircle circle = new MovableCircle(2, 5, 3, 4, 1);
        // circle.moveUp();
        // System.out.println(circle);

        //2 пункт
        // MovableRectangle rectangle = new MovableRectangle(4,3, 2, 1, 5, 5);
        // rectangle.moveUp();
        // System.out.println(rectangle);

        // 3 пункт
        // Animal an = new Animal("fish");
        // an.getName();
        // Car auto = new Car("Mercedes");
        // auto.getName();

        // 4 пункт
        // Smartphone t1 = new Smartphone("Iphone 5s", 45000);
        // t1.getName();
        // t1.getPrice();
        // System.out.println(" ");
        // Car auto2 = new Car("Forze 5", 1525000);
        // auto2.getName();
        // auto2.getPrice();

        //5 пункт
        //Опишу словами

        //6 пункт
        // Smartphone t2 = new Smartphone("Samsung A2", 36300);
        // t2.print();

        // System.out.println(" ");
        // Car auto3 = new Car("Ford Focus A7", 2725000);
        
        // auto3.print();

        //7-8 пункт
        // Book book1 = new Book("Garry Potter");
        // book1.print();
        // Shop f = new Shop("Пятёрочка");
        // f.print();

        //9 пункт
    //     Scanner scanner = new Scanner(System.in);

    //     // Запрашиваем у пользователя количество элементов в массиве
    //     System.out.print("Введите количество элементов в массиве: ");
    //     int count = scanner.nextInt();
    //     scanner.nextLine(); // Считываем оставшийся перевод строки

    //     // Создаем массив типа Printable
    //     Printable[] list = new Printable[count];

    //     // Заполняем массив объектами Book и Shop
    //     for (int i = 0; i < count; i++) {
    //         System.out.print("Введите тип элемента (book или shop): ");
    //         String type = scanner.nextLine();

    //         if (type.equals("book")) {
    //             System.out.print("Введите название книги: ");
    //             String title = scanner.nextLine();
    //             list[i] = new Book(title);
    //         } else if (type.equals("shop")) {
    //             System.out.print("Введите название магазина: ");
    //             String name = scanner.nextLine();
    //             list[i] = new Shop(name);
    //         } else {
    //             System.out.println("Неизвестный тип элемента. Попробуйте снова.");
    //             i--; // Уменьшаем счетчик, чтобы повторить ввод для текущего индекса
    //         }
            
    //     }

    //     for (Printable printable : list)
    //     {
    //         printable.print();
    //     }
    // }

    //Альтернатива

    // Printable[] printables = new Printable[4];

    //     // Добавляем книги и магазины в массив
    //     printables[0] = new Book("Война и мир");
    //     printables[1] = new Shop("Книжный мир");
    //     printables[2] = new Book("Преступление и наказание");
    //     printables[3] = new Shop("Книжный рай");

    //     // В цикле проходим по массиву и вызываем метод print() для каждого объекта
    //     for (Printable printable : printables) {
    //         printable.print();
    //     }

    //10 пункт

    // Processor processor = new Processor("Intel Core i5", 2.5, 32);
    // Memory memory = new Memory(16);
    // Monitor monitor = new Monitor("QLED", 32);

    // Computer Computer = new Computer(Brand.DNS, processor, memory, monitor);

    // System.out.println(Computer);

    //11 пункт
    // Kelvin s1 = new Kelvin(1);
    // s1.convert();
    // Fahrenheit s2 = new Fahrenheit(1);
    // s2.convert();

    }
}
