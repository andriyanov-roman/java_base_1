package work.oop.printconsol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Виталий on 12.05.15.
 */
public class ReadFile  {
    public static ArrayList<ReadFile> getReadFile() throws IOException {
        File f = new File("vitalik\\resources\\PrintConsol.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<ReadFile> list = new ArrayList<ReadFile>();
        String line;
        while ((line = buffer.readLine()) != null) {
            ReadFile text = new ReadFile();
            String arr [] = line.split("[\\s,.!?]+");
            list.add(text);

                System.out.println(text);

        }
        return list;

    }

}
