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

    public static ArrayList getProgrammer() {
        ArrayList<Programmer> programmer = new ArrayList<Programmer>();

        Programmer p1 = new Programmer();
        p1.setName("Viktoria");
        p1.setSecondName("Anch");
        p1.setAge(38);
        p1.setSalary(14200);
        p1.setLangMachine("java");
        programmer.add(p1);

        Programmer p2 = new Programmer();
        p2.setName("Rima");
        p2.setSecondName("Adardasova");
        p2.setAge(44);
        p2.setSalary(12860);
        p2.setLangMachine("C++");
        programmer.add(p2);

        Programmer p3 = new Programmer();
        p3.setName("Faina");
        p3.setSecondName("Fedorova");
        p3.setAge(42);
        p3.setSalary(9300);
        p3.setLangMachine("HTML");
        programmer.add(p3);

        Programmer p4 = new Programmer();
        p4.setName("Evgenija");
        p4.setSecondName("Avdeeva");
        p4.setAge(38);
        p4.setSalary(14730);
        p4.setLangMachine("PHP");
        programmer.add(p4);

        return new ArrayList(programmer);
    }
}
