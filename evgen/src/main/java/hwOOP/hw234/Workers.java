package hwOOP.hw234;

/**
 * Created by ������� on 25.04.2015.
 */
public class Workers {
    private String name;
    private String secondName;
    private String gender;
    private int age;
    private int salary;


    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }




}