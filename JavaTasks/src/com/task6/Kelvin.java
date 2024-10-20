package com.task6;

public class Kelvin implements Convertable{

    private double kelvin_score;

    public Kelvin(double kelvin_score)
    {
        this.kelvin_score = kelvin_score;
    }

    @Override
    public void convert()
    {
        double result = 9*(kelvin_score - 273.15)/5 + 32;
        System.out.printf("Из Кельвин в Фаренгейт %.2f F\n", result);
    }

}
