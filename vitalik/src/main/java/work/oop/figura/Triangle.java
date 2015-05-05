package work.oop.figura;

/**
 * Created by Виталий on 30.04.15.
 */
public class Triangle extends Figura {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    public double getSquare() {
        return (Math.sqrt(3) * (side * side)) / 4;
    }

    public double getPerimeter() {

        return side + side +side;
    }

    @Override
    public String toString() {
        return "triangle" + ":" + getName() + ":" + side + ":" + getPerimeter() + ":" + getSquare();
    }
}
