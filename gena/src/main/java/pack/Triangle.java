package pack;

/**
 * Created by sigen on 4/30/2015.
 */
public class Triangle extends Figure{
    Triangle(String name, double side, double height){
        super(name);
        this.side = side;
        this.height = height;
    }

    private double side;

    private double height;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPerimeter(){
        return side+side+side;
    }

    public double getSquare(){
        return side*height/2;
    }


}
