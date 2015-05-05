package work.oop.figura;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Виталий on 30.04.15.
 */
public class Conteyner {
    public static void main(String[] args) throws IOException {
        ArrayList<Figura> figures = new ArrayList<Figura>();
        Circle circle1 = new Circle();

        circle1.setName("Круг");
        circle1.setRadius(1.2);
        figures.add(circle1);

        Figura square = new Square();
        square.setName("Квадрат");
        Square square1 = new Square();
        square1.setSide(3.1);
        figures.add(square1);

        Triangle triangle1 = new Triangle();
        triangle1.setSide(2.6);
        triangle1.setName("Триугольник");
        figures.add(triangle1);

        System.out.print("Фигура: " + circle1.getName());
        System.out.print("   S = " + circle1.getSquare());
        System.out.print("   P = " + circle1.getPerimeter());
        System.out.print("\nФигура: " + square.getName());
        System.out.print("   S = " + square1.getSquare());
        System.out.print("   P = " + square1.getPerimeter());
        System.out.print("\nФигура: " + triangle1.getName());
        System.out.print("   S = " + triangle1.getSquare());
        System.out.print("   P = " + triangle1.getPerimeter());
        System.out.print("\nФигура с максимальной площадью: ");


        double bufT = 0, bufC = 0, bufS = 0;
        Figura figuraMaxPer = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getPerimeter() > figuraMaxPer.getPerimeter()) {
                figuraMaxPer = figures.get(i);
            }
        }
        System.out.println(figuraMaxPer.getPerimeter());
        writeFigures(figures);
        getFiguresFromFile();
    }

    public static void writeFigures(ArrayList<Figura> figuras) throws IOException {
        File f = new File("test.txt");
        FileWriter writer = new FileWriter(f);
        for (int i = 0; i < figuras.size(); i++) {
            writer.write(figuras.get(i).toString() + '\n');
        }
        writer.flush();
        writer.close();
    }

    public static ArrayList<Figura> getFiguresFromFile() throws IOException {
        File f = new File("test.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Figura> figures = new ArrayList<Figura>();
        String line;
        while (buffer.readLine() != null) {
            String[] pool = buffer.readLine().split(":");
            if("triangle".equals(pool[0])) {
                Triangle tr = new Triangle();
                tr.setSide(Double.parseDouble(pool[1]));
                tr.setName(pool[2]);
                figures.add(tr);
            } else if("circle".equals(pool[0])) {
                Circle tr = new Circle();
                //tr.setSide(Integer.parseInt(pool[1]));
                tr.setName(pool[2]);
                figures.add(tr);
            }
        }
        System.out.println(figures.toString());
        return figures;
    }
}
