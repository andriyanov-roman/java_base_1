package figures;

/**
 * Created by Дима on 30.04.2015.
 */
public class Treangle extends Figure {
    private int side;
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getSquare(){
        return side*height/2;
    }
    public double getPerimeter(){
        return side*3;
    }
}
