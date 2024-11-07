package com.task14;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayZd {

    public static void main(String[] args) {
        
        ArrayList<String> subjects = new ArrayList<String>();
        //Добавим предметы в список
        subjects.add("Математический Анализ");
        subjects.add("Программирование");
        subjects.add("Линейная Алгебра");
        subjects.add("Анализ Данных");
        subjects.add("Менеджмент");

        System.out.println("Вывод первого и последнего элемента\n");
        //Выведем первый и последний предмет
        System.out.println(subjects.get(0));
        System.out.println(subjects.get(subjects.size() - 1));



        //Установим вместо Менеджмента - Русский язык
        System.out.println("\nУстановим вместо Менеджмента - Русский язык\n");
        subjects.set(subjects.size() - 1, "Русский язык");
        System.out.println(subjects.get(subjects.size()-1));

        System.out.println("\nВывод списка\n");

        //Вывод списка
        System.out.printf("В списке %d элементов \n", subjects.size());
        for (String subject : subjects)
        {
            System.out.println(subject);
        }

        if (subjects.contains("Математический Анализ"))
        {
            System.out.println("Список содержит предмет под названием: Математический Анализ\n");
        }

        //Удалим предмет Анализ Данных
        subjects.remove("Анализ Данных");
        //subjects.remove(3); по индексу

        System.out.println("Object subs:\n");
        Object[] subs = subjects.toArray();
        for (Object sub: subs)
        {
            System.out.println(sub);
        }

        System.out.println("\nВторой список:\n");

        //Второй список

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(15);

        for (Integer number : numbers)
        {
            System.out.println(number);
        }
        // возвращает индекс первого вхождения объекта 1 в список.
        int firstindex = numbers.indexOf(1);
        System.out.println("\nПервое вхождение в список числа 1: " + firstindex);

        //возвращает индекс последнего вхождения объекта 2 в список.
        int lastindex = numbers.lastIndexOf(2);
        System.out.println("Последнее вхождение в список числа 2: " + lastindex);

        //Список между:
        System.out.println("\nСписок между 0 и 3 по индексу:");
        System.out.println(numbers.subList(0, 3));


        //сортировка списка numbers
        System.out.println("\nСортировка списка numbers\n");
        Collections.sort(numbers);

        for (Integer number : numbers)
        {
            System.out.println(number);
        }

    }


}
