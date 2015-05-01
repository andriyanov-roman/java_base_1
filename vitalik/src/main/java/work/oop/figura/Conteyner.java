package work.oop.figura;

import java.util.ArrayList;

/**
 * Created by Виталий on 30.04.15.
 */
public class Conteyner extends Figura {
    public static void main(String[] args) {
        ArrayList<Figura> maxSquare = new ArrayList<Figura>();

        Figura circle = new Figura();
        circle.setName("Круг");
        Circle circle1 = new Circle();
        circle1.setRadius(1.2);
        maxSquare.add(circle1);

        Figura square = new Figura();
        square.setName("Квадрат");
        Square square1 = new Square();
        square1.setSide(3.1);
        maxSquare.add(square1);

        Figura triangle = new Figura();
        triangle.setName("Триугольник");
        Triangle triangle1 = new Triangle();
        triangle1.setSide(2.6);
        maxSquare.add(triangle1);

        System.out.print("Фигура: " + circle.getName());
        System.out.print("   S = " + circle1.getSquare());
        System.out.print("   P = " + circle1.getPerimeter());
        System.out.print("\nФигура: " + square.getName());
        System.out.print("   S = " + square1.getSquare());
        System.out.print("   P = " + square1.getPerimeter());
        System.out.print("\nФигура: " + triangle.getName());
        System.out.print("   S = " + triangle1.getSquare());
        System.out.print("   P = " + triangle1.getPerimeter());
        System.out.print("\nФигура с максимальной площадью: ");


        double bufT = 0, bufC = 0, bufS = 0;

        for (int i = 0; i < maxSquare.size(); i++) {
            if (maxSquare.get(i) instanceof Triangle) {
                bufT = ((Triangle) maxSquare.get(i)).getSquare();
            }
            if (maxSquare.get(i) instanceof Circle) {
                bufC = ((Circle) maxSquare.get(i)).getSquare();
            }
            if (maxSquare.get(i) instanceof Square) {
                bufS = ((Square) maxSquare.get(i)).getSquare();
            }
        }
        if (bufC > bufS && bufC > bufT) {
            System.out.print(circle.getName());
        }
        if (bufT > bufS && bufC < bufT) {
            System.out.print(triangle.getName());
        }
        if (bufC < bufS && bufS > bufT) {
            System.out.print(square.getName());
        }
    }
}
