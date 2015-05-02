package hwOOP.hw5p2;

import java.io.*;
/**
 * Created by Евгений on 02.05.2015.
 */
public class ReaderWritter {
    public static void main(String[] args) throws IOException, InterruptedException {
        File f = new File("./evgen/src/main/java/hwOOP/hw5p2/test2.txt");
        FileWriter writer = new FileWriter(f, true);
        writer.write("Privet");
        writer.write("Jena!" + '\n');
        writer.flush();
        writer.close();

        //PrintWriter prWriter = new PrintWriter(f);
        BufferedReader br = new BufferedReader(new FileReader(f));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
        /*FileReader reader = new FileReader(f);
        int r;
        while ((r = reader.read()) != -1) {
            char c = (char)r;
            System.out.print(c);
        }*/
    }
}
