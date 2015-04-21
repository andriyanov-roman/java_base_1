import budy.Budy;

import java.util.Scanner;


/**
 * Created by Евгений on 21.04.15.
 */
public class Std7v1 {
    public static void main(String[] args) {
       Budy[] h=getBudys();
        showBudys(h);
        Scanner scanner = new Scanner(System.in);

    }

    public static void showBudys(Budy[] Budys) {
        for (int i = 0; i< Budy().length)
    }


    public static Budy[] getBudys() {
        Budy h1 = new Budy();
        Budy h2 = new Budy();
        Budy h3 = new Budy();
        Budy h4 = new Budy();
        Budy h5 = new Budy();
        Budy h6 = new Budy();
        Budy h7 = new Budy();
        Budy h8 = new Budy();
        h1.name = "Gaga";
        h1.secondName = "Gagagav";
        h1.ads = 22;
        h1.height = 180;
        h1.weight = 100;
        h2.name = "Gitler";
        h2.secondName = "Gitlerivich";
        h2.ads = 23;
        h2.height = 130;
        h2.weight = 55;
        h3.name = "Rotor";
        h3.secondName = "Rihtar";
        h3.ads = 18;
        h3.height = 130;
        h3.weight = 155;
        h3.name = "Lasky";
        h3.secondName = "Hikolas";
        h3.ads = 44;
        h3.height = 170;
        h3.weight = 155;
        return new Budy[] {h1,h2,h3,h4};
    }
}
