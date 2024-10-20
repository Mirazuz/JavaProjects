package com.task7;

public class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }

    public String getTitle() {
        return title;
    }

    // Статический метод для вывода названий только журналов
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println("Журнал: " + ((Magazine) item).getTitle());
            }
        }
    }
}