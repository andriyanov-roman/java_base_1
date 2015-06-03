package oop.readers;

import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;

/**
 * Created by sigen on 5/12/2015.
 */
public class SqarePrinter extends ParentReader implements Readers {
    SqarePrinter(File f) {
        super(f);
    }

    public void readToConsole() throws IOException {
        ArrayList<String> strings = readFromFile(f);
        ArrayList<String> newStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            if (i == 0 || i == strings.size() - 1) {
                newStrings.add(appendEdges(strings.get(i)));
            } else {
                String[] temp = strings.get(i).split(" ");
                temp[temp.length / 2] = appendMiddle(temp[temp.length / 2]);
                newStrings.add(backToStr(temp));
            }
        }
        showAll(newStrings);
    }

    public void showAll(ArrayList<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    public String appendEdges(String string) {
        string = "\t"+"\t" + string;
        return string;
    }

    public String appendMiddle(String string) {
        string = "\t"+"\t"+ "\t"+"\t"+ string;
        return string;
    }


}
