package exampl.figures;

public class Circle extends Figure {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        double perimeter = 0;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getSquare() {
        double square = 0;
        square = 2 * Math.PI * radius * radius;
        return square;
    }
}
