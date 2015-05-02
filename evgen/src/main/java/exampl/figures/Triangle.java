package exampl.figures;


public class Triangle extends Figure {
    private int side;
    private int height;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPerimeter() {
        double perimeter = 0;
        perimeter = side + side + side;
        return perimeter;
    }

    public double getSquare() {
        double square = 0;
        square = 0.5 * side * height;
        return square;
    }
}
