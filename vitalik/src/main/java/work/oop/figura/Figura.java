package work.oop.figura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Виталий on 30.04.15.
 */
public abstract class Figura {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    public void writeToFile() throws IOException {
        if(getPerimeter() > 10 ) {
            File f = new File("test.txt");
            FileWriter writer = new FileWriter(f, true);
            writer.write(String.valueOf(getPerimeter()));
            writer.flush();
            writer.close();
        }
    }
}
