package exampl.figures;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.setSide(7);
        t1.setHeight(2);
        t1.setName("Triangle");

        Square s1 = new Square();
        s1.setSide(2);
        s1.setName("Square");

        Circle c1 = new Circle();
        c1.setRadius(3);
        c1.setName("Circle");

        Container cont = new Container();

        cont.setFigures(Arrays.asList(t1, s1, c1));
        cont.getMaxPerimeter();
        cont.getMaxSquare();



    }
}
