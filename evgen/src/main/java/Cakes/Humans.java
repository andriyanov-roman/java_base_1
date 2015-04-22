package Cakes;

/**
 * Created by Евгений on 21.04.2015.
 */
public class Humans {
    public String name;
    public String secondName;
    public int age;
    public double weight;
    public double height;


    public String walk() {
        if (this.age < 5 && this.weight < 20 && this.height > 1.00) {
            return "very slow";
        } else if (this.age > 0 && this.age < 10 && this.weight < 40 && this.height < 1.20) {
            return "not so fast";
        } else if (this.age > 10 && this.age < 30 && this.weight < 80 && this.height < 1.85) {
            return "very fast";
        } else if (this.age > 30 && this.age < 50 && this.weight < 120 && this.height < 2.00) {
            return "not so fast as you can";
        } else if (this.age > 50 && this.age < 80 && this.weight < 120 && this.height < 2.00) {
            return "slow";
        } else if (this.age > 80 && this.age < 100 && this.weight < 120 && this.height < 2.00) {
            return "very slow";
        }
        return "unknown";
    }
}
