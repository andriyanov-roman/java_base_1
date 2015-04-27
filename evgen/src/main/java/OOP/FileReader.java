package OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public void readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner (new File("newFile"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println (line);
        }
        scanner.close();
    }
}
