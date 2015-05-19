package dynamic;


import java.io.IOException;
import java.util.ArrayList;

public class ClassTwo implements ReadToConsole {         //stroka

    @Override
    public void read(ArrayList<String> x) throws IOException {
        for (int i=0; i<x.size(); i++){
            System.out.print(x.get(i)+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }
}

