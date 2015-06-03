package oop.readers;

import java.io.*;
import java.util.ArrayList;


/**
 * Created by sigen on 5/12/2015.
 */
public class ParentReader {
    File f;

    ParentReader(File f){
        this.f = f;
    }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    ArrayList readFromFile(File f) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader buff = new BufferedReader(new FileReader(f));
        String current;

        while ((current = buff.readLine()) != null) {
            list.add(current);
        }
        return list;
    }

    public String backToStr(String [] arr){
        String tempstr ="";
        for (int i = 0; i < arr.length; i++) {
            tempstr = tempstr + "" + arr[i]+ " ";
        }
        return tempstr;
    }

}
