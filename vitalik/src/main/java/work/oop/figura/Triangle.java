package work.oop.figura;

/**
 * Created by Виталий on 30.04.15.
 */
public class Triangle extends Figura {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    public double getSquare() {
        return (Math.sqrt(3) * (side * side)) / 4;
    }

    public double getPerimeter() {
        return side + side +side;
    }
}
