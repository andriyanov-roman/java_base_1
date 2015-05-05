package work.oop.company;

/**
 * Created by ������� on 30.04.15.
 */
public class Empleey {
    private String name;
    private String secondName;
    private int age;
    private int salary;
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return  name + ":" + secondName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
