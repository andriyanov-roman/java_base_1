package exampl.figures;

import java.util.List;


public class Container {
    private List<Figure> figures;


    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    public void getMaxPerimeter(){
        double maxPt = figures.get(0).getPerimeter();
        int figInd = 0;
        for (int i = 0; i < figures.size(); i++) {
            if(maxPt < figures.get(i).getPerimeter() ) {
                maxPt = figures.get(i).getPerimeter();
                figInd = i;
            }
        }
        System.out.println("Max perimeter have a " + figures.get(figInd).getName() );
        System.out.println("Perimeter value: " + maxPt);
    }

    public void getMaxSquare(){
        double maxSq = figures.get(0).getSquare();
        int figInd = 0;
        for (int i = 0; i < figures.size(); i++) {
            if(maxSq < figures.get(i).getSquare() ) {
                maxSq = figures.get(i).getSquare();
                figInd = i;
            }
        }
        System.out.println("Max square have a " + figures.get(figInd).getName() );
        System.out.println("Square value: " + maxSq);
    }
}
