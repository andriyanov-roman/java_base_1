package work.oop.company;
import java.util.ArrayList;
/**
 * Класс мэнеджер
 */
public class Manager {
    private String name;
    private String secondName;
    private int age;
    private int salary;
    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
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

    public static ArrayList getManager() {
        ArrayList<Manager> manager = new ArrayList<Manager>();

        Manager m1 = new Manager();
        m1.setName("Vitalij");
        m1.setSecondName("Gorbunov");
        m1.setAge(28);
        m1.setSalary(12500);
        m1.setProjectName("opera");
        manager.add(m1);

        Manager m2 = new Manager();
        m2.setName("Ivan");
        m2.setSecondName("Ivanichenko");
        m2.setAge(18);
        m2.setSalary(12210);
        m2.setProjectName("C1");
        manager.add(m2);

        Manager m3 = new Manager();
        m3.setName("Petya");
        m3.setSecondName("Petrov");
        m3.setAge(22);
        m3.setSalary(14100);
        m3.setProjectName("Tank");
        manager.add(m3);

        return new ArrayList(manager);

    }

    }

