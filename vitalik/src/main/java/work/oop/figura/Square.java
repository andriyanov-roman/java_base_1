package work.oop.figura;

/**
 * Created by Виталий on 30.04.15.
 */
public class Square extends Figura {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSquare() {
        return  side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }
}
