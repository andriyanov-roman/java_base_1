/**
 * Created by Pipin on 21.04.2015.
 */
public class Forma {
    public String name;
    public String secondName;
    public int age;
    public double weight;
    public double height;

    public String walk(double height, double weight) {               //povedenie
        if (this.weight < weight && this.height > height) {
            System.out.println("fast");
            return "fast";
        }
        else if (this.weight > weight && this.height < height) {
            System.out.println("slow");
            return "slow";
        }
        System.out.println("unkcnown");
        return "unkcnown";
    }

    public String howwalk(int age){
        if (age > 0 && age < 2) {
            System.out.println("polzaet");
            return "polzaet";
        }
        if (age > 1 && age < 11) {
            System.out.println("begaet");
            return "begaet";
        }
        if (age > 10 && age < 86) {
            System.out.println("xodit norm!");
            return "xodit norm!";
        }
        if (age > 85 && age < 96) {
            System.out.println("presmikaetsa");
            return "presmikaetsa";
        }
        if (age > 95 && age < 101) {
            System.out.println("lezhit");
            return "lezhit";
        }
        System.out.println("unkcnown");
        return "unkcnown";
    }
}