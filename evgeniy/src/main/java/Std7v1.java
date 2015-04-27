import budy.Budy;

import java.util.Scanner;


/**
 * Created by Евгений on 21.04.15.
 */
public class Std7v1 {
    public static void main(String[] args) {
       Budy[] h=getBudys();
        //showBudys(h);
        Scanner scanner = new Scanner(System.in);
        System.out.println(h[0].run(2.00, 60));

    }

    public static void showHumans(Budy[] Budys) {
        for (int i = 0; i < Budys.length; i++) {
            System.out.println(Budys[i].name + " " + Budys[i].secondName
                    + " " + Budys[i].ads + " " + Budys[i].weight);
        }
    }



    public static Budy[] getBudys() {
        Budy h1 = new Budy();
        Budy h2 = new Budy();
        Budy h3 = new Budy();
        Budy h4 = new Budy();
       // Budy.budy h5 = new Budy.budy();
       // Budy.budy h6 = new Budy.budy();
      //  Budy.budy h7 = new Budy.budy();
      //  Budy.budy h8 = new Budy.budy();
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

        h4.name = "Lasky";
        h4.secondName = "Hikolas";
        h4.ads = 44;
        h4.height = 170;
        h4.weight = 155;
        return new Budy[] {h1,h2,h3,h4};
    }
}
