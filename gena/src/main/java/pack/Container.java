package pack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sigen on 4/30/2015.
 */
public class Container {
    Container(int size){
        this.size = size;
    }
    int size;
    ArrayList<Figure> figures;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }
    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    public Figure getMaxPerimeter(ArrayList<Figure> figures){
        Figure max = figures.get(0);

        for (int i = 0; i < figures.size(); i++) {
            if(figures.get(i).getPerimeter() > max.getPerimeter()){
                max = figures.get(i);
            }
        }
        return max;
    }

    public Figure getMaxSquare(ArrayList<Figure> figures){
        Figure max = figures.get(0);

        for (int i = 0; i < figures.size(); i++) {
            if(figures.get(i).getSquare() > max.getSquare()){
                max = figures.get(i);

            }
        }
        return max;
    }


    public static void main(String[] args) {
        Container container = new Container(10);

        Square s1 = new Square("square1", 4);
        Square s2 = new Square("square2", 6);
        Circle c1 = new Circle("Circle1", 3);
        Circle c2 = new Circle("Circle2", 2);
        Circle c3 = new Circle("Circle3", 5);
        Triangle t1 = new Triangle("Triangle1", 2, 3);
        Triangle t2 = new Triangle("Triangle2", 3, 5);
        Triangle t3 = new Triangle("Triangle3", 1, 4);
        Triangle t4 = new Triangle("Triangle4", 8, 2);

        ArrayList<Figure> figures = new ArrayList<>(Arrays.asList(s1, s2, c1, c2, c3, t1, t2, t3));

        container.setFigures(figures);

        Figure maxf = new Figure();
        maxf = container.getMaxPerimeter(figures);
        System.out.println(maxf.getName()+" "+maxf.getPerimeter());

        maxf = container.getMaxSquare(figures);
        System.out.println(maxf.getName()+" "+maxf.getSquare());




    }



}
