package com.task6;

public class Fahrenheit implements Convertable{

    private double fahrenheit_score;

    public Fahrenheit(double fahrenheit_score)
    {
        this.fahrenheit_score = fahrenheit_score;
    }

    @Override
    public void convert()
    {
        double result = 5*(fahrenheit_score - 32)/9 + 273.5;
        System.out.printf("Из Фаренгейт в Кельвин: %.2f K\n", result);
    }

}
