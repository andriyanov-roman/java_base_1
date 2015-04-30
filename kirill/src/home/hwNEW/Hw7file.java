import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Hw7file {
    public static void main(String[] args) throws IOException, InterruptedException {

        Start();

    }

    public static void Start() throws IOException{

        Scanner input = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<String>();
        String t;

        do{
            System.out.print("VVedite slovo: ");
            t= input.nextLine();

            if (t.equals("SAVE") || t.equals("LOAD")){
                if (t.equals("SAVE")){
                    write(List);
                }
                else   {print();}
                System.out.println();
            }

            else List.add(t);
        } while(t.equals("SAVE") || !t.equals("LOAD"));
    }

    public static void write(ArrayList<String> v) throws IOException {

        File f = new File("F:\\a.txt");

        FileWriter writer = new FileWriter(f);
        for (int i = 0; i < v.size(); i++) {
            writer.write(v.get(i) + ", ");}
        writer.flush();
        writer.close();                            }

    public static void print() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
    }
}

