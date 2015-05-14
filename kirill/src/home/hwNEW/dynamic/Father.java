package dynamic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Father {
    public static void main(String[] args) throws IOException {
        Show(words());
    }
    public static void Show(ArrayList<String> x) throws IOException{
        ReadToConsole s = new ClassOne();
        s.read(x);
        s = new ClassTwo();
        s.read(x);
        s = new ClassThree();
        s.read(x);
    }
    public static ArrayList<String> words() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\dynamic\\Data"));
        ArrayList<String> words = new ArrayList<>();
        String line;
        while ((line=br.readLine()) != null) {
            String[] pool = line.split("\\,?\\.?\\s");
            for (int i=0; i<pool.length; i++){
                words.add(pool[i]);
            }
        }
        return words;
    }
}
