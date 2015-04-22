package Cakes;

/**
 * Created by Евгений on 21.04.2015.
 */
public class Earth {
    public static void main(String[] args) {

        Humans h1 = new Humans();
        h1.name = "David";
        h1.secondName = "De Gea";
        h1.age = 22;
        h1.height = 184.0;
        h1.weight = 79;

        Humans h2 = new Humans();
        h2.name = "Luke";
        h2.secondName = "Show";
        h1.age = 24;
        h1.height = 186.0;
        h1.weight = 90;

        Humans h3 = new Humans();
        h3.name = "Marcus";
        h3.secondName = "Roho";
        h3.age = 22;
        h3.height = 188.0;
        h3.weight = 85;

        Humans h4 = new Humans();
        h4.name = "Cris";
        h4.secondName = "Smolling";
        h4.age = 26;
        h4.height = 192.0;
        h4.weight = 90;

        Humans h5 = new Humans();
        h5.name = "Ashlie";
        h5.secondName = "Young";
        h5.age = 25;
        h5.height = 184.0;
        h5.weight = 77;

        Humans h6 = new Humans();
        h6.name = "Anhel";
        h6.secondName = "Di Maria";
        h6.age = 25;
        h6.height = 182.0;
        h6.weight = 75;

        Humans h7 = new Humans();
        h7.name = "Huan";
        h7.secondName = "Mata";
        h7.age = 28;
        h7.height = 185.0;
        h7.weight = 74;

        Humans h8 = new Humans();
        h8.name = "Antonio";
        h8.secondName = "Valencia";
        h8.age = 29;
        h8.height = 185.0;
        h8.weight = 81;

        Humans h9 = new Humans();
        h9.name = "Wayne";
        h9.secondName = "Rooney";
        h9.age = 29;
        h9.height = 186.0;
        h9.weight = 85;

        Humans h10 = new Humans();
        h10.name = "Robin";
        h10.secondName = "Van Persie";
        h10.age = 30;
        h10.height = 186.0;
        h10.weight = 87;

        System.out.println(h1.walk());
    }
}
