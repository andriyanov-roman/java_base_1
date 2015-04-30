package work.oop.company;

import java.util.ArrayList;
/**
 * Класс для админа
 */
public class Admin {
    private String name;
    private String secondName;
    private int age;
    private int salary;
    private String osName;

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

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
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

    public static ArrayList getAdmin() {
        ArrayList<Admin> admin = new ArrayList<Admin>();

        Admin a1 = new Admin();
        a1.setName("Stepan");
        a1.setSecondName("Sidorov");
        a1.setAge(68);
        a1.setSalary(2860);
        a1.setOsName("linux");
        admin.add(a1);

        Admin a2 = new Admin();
        a2.setName("Arem");
        a2.setSecondName("Mihailov");
        a2.setAge(26);
        a2.setSalary(6500);
        a2.setOsName("unux");
        admin.add(a2);

        Admin a3 = new Admin();
        a3.setName("Irina");
        a3.setSecondName("Dudnik");
        a3.setAge(19);
        a3.setSalary(1900);
        a3.setOsName("Windows Server");
        admin.add(a3);

        return new ArrayList(admin);
    }
}
