package work.oop.company;

import java.util.ArrayList;

/**
 * Класс компания
 */
public class Company {
    private String name;
    private ArrayList<Manager> manager;
    private ArrayList<Programmer> programmer;
    private ArrayList<Admin> admin;

    public ArrayList<Admin> getAdmin() {
        return admin;
    }

    public void setAdmin(ArrayList<Admin> admin) {
        this.admin = admin;
    }

    public ArrayList<Manager> getManager() {
        return manager;
    }

    public void setManager(ArrayList<Manager> manager) {
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Programmer> getProgrammer() {
        return programmer;
    }

    public void setProgrammer(ArrayList<Programmer> programmer) {
        this.programmer = programmer;
    }

    public static void main(String[] args) {



    }

}
