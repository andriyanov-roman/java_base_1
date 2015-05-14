package figures;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by ���� on 30.04.2015.
 */
public class Container {
    private ArrayList<Figure> figures;

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void getMaxPerimeter() {
        Figure max = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getPerimeter() > max.getPerimeter()) {
                max = figures.get(i);
            }
        }
        System.out.println("Max Perimeter has " + max.getName() + " " + max.getPerimeter());
    }

    public void getMaxSquare() {
        Figure max = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getSquare() > max.getSquare()) {
                max = figures.get(i);
            }
        }
        System.out.println("Max Square has " + max.getName() + " " + max.getSquare());
    }

    public void WriteToFile() throws IOException {
        File f = new File("dmitriy\\test.txt");
        FileWriter writer = new FileWriter(f);
        for (int i = 0; i < figures.size(); i++) {
            writer.write(figures.get(i).toString() + '\n');
        }
        writer.flush();
        writer.close();
    }

    public ArrayList<Figure> getFiguresFromFile() throws IOException {
        File f = new File("dmitriy\\test.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Figure> example = new ArrayList<Figure>();
        String line;
        while ((line=buffer.readLine()) != null){
            String[] pool = line.split(":");
            if ("Treangle".equals(pool[0])){
                Treangle tr = new Treangle();
                tr.setName(pool[1]);
                tr.setSide(Integer.parseInt(pool[2]));
                tr.setHeight(Integer.parseInt(pool[3]));
                example.add(tr);
            }
            else if ("Circle".equals(pool[0])){
                Circle c = new Circle();
                c.setName(pool[1]);
                c.setRadius(Integer.parseInt(pool[2]));
                example.add(c);
            }
            else if ("Square".equals(pool[0])){
                Square sq = new Square();
                sq.setName(pool[1]);
                sq.setSide(Integer.parseInt(pool[2]));
                example.add(sq);
            }
        }
        return example;
    }
}
