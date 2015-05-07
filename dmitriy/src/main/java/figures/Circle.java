package figures;

/**
 * Created by Дима on 30.04.2015.
 */
public class Circle extends Figure {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle" + ":" + getName() + ":" + radius + ":" + getPerimeter() + ":" + getSquare();
    }
}
