package com.task5;

import javax.swing.*;
import java.awt.*;

public class ShapePanel extends JPanel{
    private Second_Shape[] shapes;

    public ShapePanel(Second_Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Second_Shape shape : shapes) {
            shape.draw(g);
        }
    }
}
