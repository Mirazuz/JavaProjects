package com.task6;

public class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean isEqu()
    {
        return (topleft.xSpeed == topleft.ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle [topleft=" + topleft + ", bottomRight=" + bottomRight + "]";
    }

    @Override
    public void moveUp()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else
        {
            topleft.moveUp();
            bottomRight.moveUp();
        }
    }

    @Override
    public void moveDown()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else
        {
            topleft.moveDown();
            bottomRight.moveDown();
        }
    }

    @Override
    public void moveRight()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else
        {
            topleft.moveRight();
            bottomRight.moveRight();
        }
    }

    @Override
    public void moveLeft()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else
        {
            topleft.moveLeft();
            bottomRight.moveLeft();
        }
    }

}
