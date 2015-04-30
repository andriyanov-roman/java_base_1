package tasks.oophw;

/**
 * Created by sigen on 4/30/2015.
 */
public class Employee {

    private String name;
    private String secondName;
    private int salary;
    private int age;

    Employee(){};

    Employee(String name, String secondName, int salary, int age) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
