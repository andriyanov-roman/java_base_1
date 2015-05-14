package dynamic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Father {
   private ReadToConsole reader;

    public ReadToConsole getReader() {
        return reader;
    }

    public void setReader(ReadToConsole reader) {
        this.reader = reader;
    }

    public void Show() throws IOException{
        reader.read(words());
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
