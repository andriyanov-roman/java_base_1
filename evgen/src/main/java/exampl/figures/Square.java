package exampl.figures;


public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getPerimeter() {
        double perimeter = 0;
        perimeter = side * 4;
        return perimeter;
    }

    public double getSquare() {
        double square = 0;
        square = side * side;
        return square;
    }
}
