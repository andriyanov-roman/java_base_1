package Training.RdWr;

import java.io.*;

/**
 * Created by Евгений on 28.04.2015.
 */
public class Reader {
    public static void main(String[] args) throws IOException {
        File f = new File("evgen\\test.txt");
        FileWriter writter = new FileWriter(f, true );
        writter.write("privetqq");
        writter.flush();
        writter.close();
    }
}
