package pack;

/**
 * Created by sigen on 4/30/2015.
 */
public class Circle extends Figure{
    Circle(String name, double side){
        super(name);
        this.radius = side;
    }
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public double getSquare(){
        return 2*Math.PI*radius*radius;
    }
}
