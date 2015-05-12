package figure;

public class Triangle extends Figure {
    private double side;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double d) {
        this.height = d;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSquare(){
        return side*height/2;
    }
    public double getPerimeter(){
        return side*3;
    }
}