package com.task6;

public class Animal implements Nameable{
    
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    @Override
    public void getName()
    {
        System.out.println(name);
    }

}
