package hw.hw7GS;

/**
 * Created by ������� on 21.04.2015.
 */
public class Humans {
    private String name;
    private String secondName;
    private int age;
    private double weight;
    private double height;




    public String walk() {
        if (this.age > 0 && this.age < 6 && this.weight > 0 && this.weight < 21 && this.height > 0 && this.height < 1.01) {
            return "very slow";
        } else if (this.age > 5 && this.age < 10 && this.weight > 20 && this.weight < 40 && this.height > 1.00 && this.height < 1.20) {
            return "not so fast";
        } else if (this.age > 9 && this.age < 30 && this.weight > 39 && this.weight < 80 && this.height > 1.19 && this.height < 1.85) {
            return "very fast";
        } else if (this.age > 29 && this.age < 50 && this.weight > 79 && this.weight < 100 && this.height > 1.84 && this.height < 2.00) {
            return "not so fast as he can";
        } else if (this.age > 49 && this.age < 80 && this.weight > 99 && this.weight < 120 && this.height > 1.84 && this.height < 2.10) {
            return "slow";
        } else if (this.age > 79 && this.age < 100 && this.weight > 119 && this.weight < 200 && this.height > 1.84 && this.height < 2.10) {
            return "very slow if he still alive";
        }
        return "unknown";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}