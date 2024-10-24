package com.task5;

import java.awt.*;

public class Second_Circle extends Second_Shape{
    private int radius;

    public Second_Circle(Color color, int x, int y, int radius)
    {
        super(color, x, y);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillOval(x, y, radius, radius);
    }

}
