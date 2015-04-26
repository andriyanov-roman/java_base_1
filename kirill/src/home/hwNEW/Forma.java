/**
 * Created by Pipin on 21.04.2015.
 */
public class Forma {
    private String name;
    private String secondName;
    private int age;
    private double weight;
    private double height;

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }

    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setSecondName(String secondName){
        this.secondName=secondName;
    }
    public String getSecondName(){
        return secondName;
    }

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