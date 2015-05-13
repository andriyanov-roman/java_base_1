package uncasual;

import java.io.*;

/**
 * Created by Дима on 12.05.2015.
 */
public class UnusualMethods implements ReadToConsole {

    public void readBySquare() throws IOException {
        File f = new File("dmitriy//unusual.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        String line;
        while (buffer.readLine() != null){
            String[] pool = buffer.readLine().split(":");


        }



    }

    public void readByNKH() {

    }
}
