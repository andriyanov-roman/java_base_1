package dynamic;

import java.io.IOException;
import java.util.ArrayList;

public class ClassOne implements ReadToConsole {  //kvadrat

    @Override
    public void read(ArrayList<String> x) throws IOException {

        for (int i=0; i<x.size()/4; i++){
            System.out.print(x.get(i)+"  ");
        }
        System.out.println();
        int z=0;
        int count=1;

        System.out.print(x.get(x.size()/4+z));
        int t=0;
        while (t<(x.size()/4-2)){
            System.out.print("     ");
            t++;
        }
        t=0; z++;
        System.out.print(x.get(x.size()/4+z)+" ");
        System.out.println();
        count++;

        int c=0;
        while(count<= x.size()-x.size()/4-6){
            z++;
            if (c==0){
                System.out.print(x.get(x.size()/4+z)+" ");
                while (t<(x.size()/4-2)){
                    System.out.print("     ");
                    t++;
                } c++;
            }
            else {System.out.print(x.get(x.size()/4+z)+" "); System.out.println(); c=0;}
            count++;
            t=0;
        }
        for (int j=x.size()/4+z+1; j<x.size(); j++){
            System.out.print(x.get(j)+"  ");
        }
        System.out.println();
        System.out.println("---------------------------------------");

    }
}

