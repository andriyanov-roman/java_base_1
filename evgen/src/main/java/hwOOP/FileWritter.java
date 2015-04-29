package hwOOP;

import java.io.*;

    public class FileWritter {
    public static void write(String fileName, String text) {

        File file = new File(fileName);

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
    private static String fileName = "./a.txt";
    public static void main(String[] args) throws FileNotFoundException {

        FileWritter.write(fileName, text);

    }
}
