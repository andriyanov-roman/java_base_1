package oop.reader;

import java.io.*;

/**
 * Created by user on 4/28/2015.
 */
public class ReaderWriter {
    public static void main(String[] args) throws IOException, InterruptedException {
        File f = new File("examples\\test.txt");
        FileWriter writer = new FileWriter(f, true);
        writer.write("Privet");
        writer.write("Jena" + '\n');
        writer.flush();
        writer.close();

        //PrintWriter prWriter = new PrintWriter(f);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
        FileReader reader = new FileReader(f);
        int r;
        while ((r = reader.read()) != -1) {
            char c = (char)r;
            System.out.print(c);
        }
    }
}
