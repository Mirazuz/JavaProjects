package com.task5;

import java.awt.*;

public abstract class Second_Shape {
    
    protected Color color;
    protected int x, y;

    public Second_Shape(Color color, int x, int y)
    {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(Graphics g);
    
}
