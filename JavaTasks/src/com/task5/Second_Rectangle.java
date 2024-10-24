package com.task5;

import java.awt.*;

public class Second_Rectangle extends Second_Shape {
    private int width, height;

    public Second_Rectangle(Color color, int x, int y, int width, int height)
    {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g)
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
