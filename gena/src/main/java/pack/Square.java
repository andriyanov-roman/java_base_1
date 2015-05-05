package pack;

/**
 * Created by sigen on 4/30/2015.
 */
public class Square extends Figure{

    Square(String name, double side){
        super(name);
        this.side = side;
    }
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter(){
        return side*4;
    }

    public double getSquare(){
        return side*side;
    }
}
