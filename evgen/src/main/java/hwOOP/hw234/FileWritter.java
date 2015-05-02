package hwOOP.hw234;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritter {

public static void write(String text) {

    File file = new File("./a.txt");

    try {
        if(!file.exists()){
            file.createNewFile();
        }
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        try {
            out.print(text);
        } finally {
            out.close();
        }
    } catch(IOException e) {
        throw new RuntimeException(e);
    }
}

private static String text;

public static void main(String[] args) throws FileNotFoundException {

    FileWritter.write(text);

}
}
