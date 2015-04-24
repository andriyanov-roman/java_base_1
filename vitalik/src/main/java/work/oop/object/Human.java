package work.oop.object;

/**
 * работа с обьектами
 */
public class Human {
    private String name;
    private String secondName;
    private int age;
    private double weight;
    private double height;
    private int salary;
    private char mg;


    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    public int getSalary() {
        return salary;
    }
    public char getMg() {
        return mg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setMg(char mg) {

            this.mg = mg;

    }
}
