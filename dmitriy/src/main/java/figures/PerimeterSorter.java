package figures;

import java.util.Comparator;

/**
 * Created by user on 5/12/2015.
 */
public class PerimeterSorter implements Comparator<Figure>{
    public int compare(Figure o1, Figure o2) {
        if(o1.getPerimeter() > o2.getPerimeter()) return -1;
        if (o1.getPerimeter() < o2.getPerimeter()) return 1;
        return 0;
    }
}
