package oop.readers;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
/**
 * Created by sigen on 5/13/2015.
 */
public class StaresPrinter extends  ParentReader implements Readers{
    StaresPrinter(File f){
        super(f);
    }
    @Override
    public void readToConsole() throws Exception {
        ArrayList<String> strings = readFromFile(f);
        String[] all = toSuperString(strings).split(" ");
        int counter = 2;
        while(counter != all.length-1) {
            for (int i = 0; i < counter; i++) {
                System.out.print(all[i]);
            }
            System.out.println();
            counter +=2;
        }
    }

    public static String toSuperString(ArrayList<String> strings){
        String superString = "";
        for (int i = 0; i < strings.size(); i++) {
            String [] string = strings.get(i).split(" ");
            superString += Arrays.toString(string);
        }
        return superString;

    }
}
