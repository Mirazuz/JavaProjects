package com.task6;

public class Processor {

    private String model;
    private double speed;
    private int digit_capacity;

    public Processor(String model, double speed, int digit_capacity)
    {
        this.model = model;
        this.speed = speed;
        this.digit_capacity = digit_capacity;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public int getDigit_capacity() {
        return digit_capacity;
    }

    @Override
    public String toString() {
        return "Model name: " + model + 
        "\n" + "Speed: " + speed +
        "\n" + "Digit capacity: " + 
        + digit_capacity; 
    }

}
