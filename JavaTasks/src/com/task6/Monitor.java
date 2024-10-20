package com.task6;

public class Monitor {
    
    private String model;
    private double size; // в дюймах

    public Monitor(String model, double size)
    {
        this.model = model;
        this.size = size;
    }


    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString()
    {
        return "Monitor model: " + model + 
        "\n" + "Monitor size: " + size;
    }

}
