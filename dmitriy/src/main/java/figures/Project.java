package figures;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Дима on 04.05.2015.
 */
public class Project {
    public static void main(String[] args) throws IOException {
        Container project = new Container();
        project.setFigures(new ArrayList<Figure>());
        project.setSize(6);

        Circle Big = new Circle();
        Big.setName("Krug");
        Big.setRadius(6);

        Circle Small = new Circle();
        Small.setName("Ring");
        Small.setRadius(4);

        Treangle True = new Treangle();
        True.setName("Truly");
        True.setSide(6);
        True.setHeight(4);

        Treangle Straight = new Treangle();
        Straight.setName("Wall");
        Straight.setSide(5);
        Straight.setHeight(3);

        Square Huge = new Square();
        Huge.setName("Box");
        Huge.setSide(6);

        Square Tiny = new Square();
        Tiny.setName("Pocket");
        Tiny.setSide(5);

        project.getFigures().addAll(Arrays.asList(Big, Small, True, Straight, Huge, Tiny));
        project.getMaxPerimeter();
        project.getMaxSquare();
        project.WriteToFile();
        project.getFiguresFromFile();
    }
}
