package dynamic;
import java.io.IOException;
import java.util.ArrayList;


public class ClassThree implements ReadToConsole {  //lesenka

    @Override
    public void read(ArrayList<String> x) throws IOException {
        for (int i=0; i<x.size(); i++ ){
            if (i%2>0){
                System.out.println(x.get(i) + " " );
            }
            else System.out.println("     "+x.get(i));
        }
        System.out.println("---------------------------------------");
    }
}