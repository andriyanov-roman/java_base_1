package figures;

/**
 * Created by Дима on 30.04.2015.
 */
public class Square extends Figure {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getSquare() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public String toString(){
        return "Square" + ":" + getName() + ":" + side + ":" + getPerimeter() + ":" + getSquare();
    }
}
