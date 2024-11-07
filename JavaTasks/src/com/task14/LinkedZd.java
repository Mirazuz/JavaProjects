package com.task14;
import java.util.LinkedList;

public class LinkedZd {

    public static void main(String[] args) {
        
        LinkedList<String> math_obj = new LinkedList<String>();

        //Добавим элементы в список
        math_obj.add("Теорема о зажатой последовательности");
        math_obj.add("Градиент");
        math_obj.add("Векторное поле");
        math_obj.add("Комплексные числа");
        math_obj.addFirst("Топология");
        math_obj.addLast("Критерий Коши о сходимости последовательности");

        //Вывод списка
        System.out.println("Вывод списка\n");
        
        for (String math: math_obj)
        {
            System.out.println(math);
        }

        //Получим первый элемент
        System.out.println("\nВывод первого элемента:");
        System.out.println(math_obj.get(0));

        //Получим последний элемент
        System.out.println("\nВывод последнего элемента:");
        System.out.println(math_obj.getLast());

        //Поменяем Комплексные числа на Иинтегралы
        System.out.println("\nПоменяем Комплексные числа на Иинтегралы:");
        math_obj.set(3, "Интегралы");
        System.out.println(math_obj.get(3));

        if (math_obj.contains("Топология"))
        {
            System.out.println("Получем набор абстрактной математики");
        }

        //Удалим последний элемент списка
        System.out.println("\nУдалим последний элемент списка");
        System.out.println(math_obj.remove(math_obj.size() - 1));

        System.out.println("\nВывод изменненого списка\n");
        Object[] maths = math_obj.toArray();
        for (Object math : maths)
        {
            System.out.println(math);
        }




    }

}
