package com.task5;

import javax.swing.*;
import java.util.Random;
import java.awt.*;

public class Second extends JFrame{
    public Second() {
        // Устанавливаем заголовок окна
        setTitle("Random Shapes");

        // Устанавливаем операцию закрытия окна по умолчанию
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создаем массив фигур
        Second_Shape[] shapes = new Second_Shape[20];
        Random random = new Random();

        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(500);
            int y = random.nextInt(500);

            if (random.nextBoolean()) {
                int radius = random.nextInt(50) + 10;
                shapes[i] = new Second_Circle(color, x, y, radius);
            } else {
                int width = random.nextInt(100) + 10;
                int height = random.nextInt(100) + 10;
                shapes[i] = new Second_Rectangle(color, x, y, width, height);
            }
        }

        // Создаем панель для отображения фигур
        ShapePanel panel = new ShapePanel(shapes);
        add(panel);

        // Устанавливаем размер окна
        setSize(500, 500);

        // Делаем окно видимым
        setVisible(true);
    }

}
