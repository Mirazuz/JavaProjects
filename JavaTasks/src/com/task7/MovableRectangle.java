package com.task7;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    // Параметризированный конструктор
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    // Метод для проверки совпадения скоростей
    public boolean speedTest() {
        return topLeft.xSpeed == topLeft.ySpeed;
    }

    // Метод для перевода числовых значений в строку
    @Override
    public String toString() {
        return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    @Override
    public void moveUp() {
        if (!speedTest()) {
            System.out.println("Точки не совпадают");
        } else {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown() {
        if (!speedTest()) {
            System.out.println("Точки не совпадают");
        } else {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveRight() {
        if (!speedTest()) {
            System.out.println("Точки не совпадают");
        } else {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft() {
        if (!speedTest()) {
            System.out.println("Точки не совпадают");
        } else {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
}