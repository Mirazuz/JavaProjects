public class MovableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        this.topleft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);

    }
    @Override
    public String toString()
    {
        return "MovableRectangle{" +
                "topLeft=MovablePoint{x=" + topleft.x + ", y="+ topleft.y+
                    "}, bottomRight=MovablePoint{x=" + bottomRight.x + ", y=" + bottomRight.y +
                    "}, xSpeed = " + topleft.xSpeed +
                ", ySpeed=" + topleft.ySpeed +
                "}";
    }

    public boolean isEqu()
    {
        return (topleft.xSpeed == topleft.ySpeed);
    }

    @Override
    public void moveUp()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else{
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
        else{
        topleft.moveDown();
        bottomRight.moveDown();
        }
    }
    @Override
    public void moveLeft()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else{
        topleft.moveLeft();
        bottomRight.moveLeft();
        }
    } 
    @Override
    public void moveRight()
    {
        if (isEqu() == false)
        {
            System.out.println("Точки не совпадают");
        }
        else{
        topleft.moveRight();
        bottomRight.moveRight();
        }
    }




}
