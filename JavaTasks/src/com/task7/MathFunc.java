package com.task7;

public class MathFunc implements MathCalculable {

    private double real, image;
    private double exponent;
    private double num;
    private boolean complex_is;

    public MathFunc(double num, double exponent)
    {
        this.num = num;
        this.exponent = exponent;
    }

    public MathFunc(double real, double image, boolean complex_is)
    {
        this.real = real;
        this.image = image;
        this.complex_is = complex_is;

    }

    public String getValue()
    {
        return real + "+" + image + "i";
    }

    public double calculateCircleArea(double radius) {
        return PI * Math.pow(radius, 2);
    }


    @Override
    public void getPower()
    {
        double result = Math.pow(num, exponent);
        System.out.println(result);
    }

    @Override
    public void getAbs()
    {
        if (complex_is == true)
        {
            double result = Math.sqrt(real * real + image * image);

            System.out.print(result);
        }
        
    }

}