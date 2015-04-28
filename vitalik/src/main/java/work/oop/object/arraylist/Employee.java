package work.oop.object.arraylist;

/**
 * Класс сотрудники
 */
public class Employee {
    private String name;
    private String secondName;
    private int age;
    private int salary;
    private String mg;
    private String group;


    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }
    public String getMg() {
        return mg;
    }
    public String getGroup(){
        return group;
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

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setMg(String mg) {
        this.mg = mg;
    }
    public void setGroup (String group){
        this.group = group;
    }
}
