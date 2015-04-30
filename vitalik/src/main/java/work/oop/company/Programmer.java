package work.oop.company;

import java.util.ArrayList;

/**
 * Класс для программиста
 */
public class Programmer {
    private String name;
    private String secondName;
    private int age;
    private int salary;
    private String langMachine;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLangMachine() {
        return langMachine;
    }

    public void setLangMachine(String langMachine) {
        this.langMachine = langMachine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
