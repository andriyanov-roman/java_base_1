package oop;

/**
 * Created by user on 4/21/2015.
 */
public class Human {
    public String name;
    public String secondName;
    public int age;
    public double weight;
    public double height;

    public String walk(double height, double weight) {
        if (this.weight < weight && this.height > height) {
            return "fast";
        } else if (this.weight > weight && this.height < height) {
            return "slow";
        }
        return "unknown";
    }
}
