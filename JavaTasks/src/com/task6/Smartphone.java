package com.task6;

public class Smartphone implements Nameable, Priceable, Printable{

    private String name;
    private int price;

    public Smartphone(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public void getName()
    {
        System.out.println(name);
    }

    public void getPrice()
    {
        System.out.println(price);
    }

    public void print()
    {
        System.out.println("Name: " + name + "Price: " + price);
    }
}
