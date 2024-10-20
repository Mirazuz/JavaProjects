package com.task6;

public class Car implements Nameable, Priceable, Printable{
    private String name;
    private int price;

    public Car(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public void getName()
    {
        System.out.println(name);
    }

    @Override
    public void getPrice()
    {
        System.out.println(price);
    }

    public void print()
    {
        System.out.println("Name: " + name + " Price: " + price);
    }

}

