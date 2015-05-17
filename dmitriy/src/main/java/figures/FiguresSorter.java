package figures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 5/12/2015.
 */
public class FiguresSorter {
    public static void main(String[] args) throws IOException {
        Container c = new Container();
        ArrayList<Figure> figures = c.getFiguresFromFile();
        Collections.sort(figures, (Figure e1, Figure e2) -> (int) (e1.getPerimeter() - e2.getPerimeter()));
        figures.forEach(f -> System.out.println(f.getName() + " " + f.getPerimeter()));

        Collections.sort(figures, (Figure e1, Figure e2) -> (int)(e1.getSquare() - e2.getSquare()));
        for (int i = 0; i < figures.size(); i++) {
            System.out.println(figures.get(i).getName() + " " + figures.get(i).getSquare());
        }

    }
}
