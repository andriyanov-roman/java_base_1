package figures;

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

    public Figure getFigureMax(){
        for (int i = 0; i < figures.size(); i++) {
            return figures.get(i);
        }
        return null;
    }
}
