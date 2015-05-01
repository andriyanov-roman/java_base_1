package work.oop.figura;

/**
 * Created by Виталий on 30.04.15.
 */
public class Circle extends Figura {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI*(radius*radius);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
