package figure;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Container {
    public static void main(String[] args) throws IOException {

        writeFig(getList());
        getFiguresFromFile();
    }

    public static ArrayList<Figure> getList (){
        ArrayList<Figure> figure = new ArrayList<Figure>();

        Triangle t = new Triangle();
        t.setName("triugolnik");
        t.setHeight(5);
        t.setSide(13);
        figure.add(t);

        Circle c = new Circle();
        c.setName("kolo");
        c.setRadius(12);
        figure.add(c);

        Square s = new Square();
        s.setName("kvadrat");
        s.setSide(9);
        figure.add(s);

        //найти площадь и периметр каждой фигуры
        System.out.printf("%s Per= %.2f S=%.2f\n",figure.get(0).getName(), figure.get(0).getPerimeter(), figure.get(0).getSquare());
        System.out.printf("%s Per=%.2f S=%.2f\n",figure.get(1).getName(), figure.get(1).getPerimeter(), figure.get(1).getSquare());
        System.out.printf("%s Per=%.2f S=%.2f\n",figure.get(2).getName(), figure.get(2).getPerimeter(), figure.get(2).getSquare());

        //вытащить с наибольшей площадью
        double maxP= figure.get(0).getSquare();
        String Wname = figure.get(0).getName();
        for (int i = 0; i < figure.size(); i++) {
            if (figure.get(i).getSquare()>maxP){
                maxP= figure.get(i).getSquare();
                Wname= figure.get(i).getName();
            }
        }
        System.out.printf("Max Square: %s %.2f\n", Wname, maxP);
        return figure;
    }

    public static void writeFig(ArrayList<Figure> fig) throws IOException {
        File f = new File("F:\\test.txt");
        FileWriter writer = new FileWriter(f);
        for (int i = 0; i < fig.size(); i++) {
            writer.write(fig.get(i).getName()+";"+fig.get(i).getPerimeter()+";"+fig.get(i).getSquare()+";\n");
        }
        writer.flush();
        writer.close();
    }

    public static ArrayList<Figure> getFiguresFromFile() throws IOException {
        File f = new File("F:\\test.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Figure> figures = new ArrayList<Figure>();
        String line;
        while ((line=buffer.readLine()) != null) {
            String[] pool = line.split(";");
            System.out.println(pool[0]);
            if("triugolnik".equals(pool[0])) {
                Triangle tr = new Triangle();
                tr.setName(pool[0]);
                tr.setSide(Double.parseDouble(pool[1])/3);
                tr.setHeight((Double.parseDouble(pool[2])*2)/tr.getSide());
                figures.add(tr);
            }
         /* if("kolo".equals(pool[0])) {
                Circle c = new Circle();
                c.setName(pool[0]);
                c.setRadius(Integer.parseInt(pool[1]));
                figures.add(c);
            }
            if("kvadrat".equals(pool[0])) {
                Square s = new Square();
                s.setName(pool[0]);
                s.setSide(Integer.parseInt(pool[1]));
                figures.add(s);
            }*/
        }

        return figures;
    }
}