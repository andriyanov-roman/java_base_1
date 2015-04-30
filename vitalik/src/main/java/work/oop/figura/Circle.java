package work.oop.figura;

/**
 * Created by Виталий on 30.04.15.
 */
public class Circle extends Figura {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.pow(Math.PI, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
