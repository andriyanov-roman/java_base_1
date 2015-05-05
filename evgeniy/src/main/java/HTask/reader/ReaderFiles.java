package HTask.reader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by ≈вгений on 28.04.15.
 */
public class ReaderFiles {
    public static void main(String[] args) throws IOException {
        File f = new File("examples\\test.txt");
        FileWriter write = new FileWriter(f, true);
        write.write("Privet");
        write.write("Dima");
        write.flush(); // возвращ€ет значение буфера
        write.close();
    }
}
