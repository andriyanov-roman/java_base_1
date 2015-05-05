package figures;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Дима on 30.04.2015.
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
        System.out.println("Максимальный периметр у фигуры " + max.getName() + " " + max.getPerimeter());
    }

    public void getMaxSquare() {
        Figure max = figures.get(0);
        for (int i = 0; i < figures.size(); i++) {
            if (figures.get(i).getSquare() > max.getSquare()) {
                max = figures.get(i);
            }
        }
        System.out.println("Максимальная площадь у фигуры " + max.getName() + " " + max.getSquare());
    }

    public void WriteToFile() throws IOException {
        File f = new File("dmitriy\\test.txt");
        FileWriter writer = new FileWriter(f, true);
        for (int i = 0; i < figures.size() ; i++) {
            writer.write((int) figures.get(i).getPerimeter());
        }

    }
}
