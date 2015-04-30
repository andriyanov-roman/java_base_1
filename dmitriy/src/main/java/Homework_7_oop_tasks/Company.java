package Homework_7_oop_tasks;

import java.util.ArrayList;

/**
 * Created by Дима on 30.04.2015.
 */
public class Company {
    private String name;
    private ArrayList<Manager> managers;
    private ArrayList<Admin> admins;
    private ArrayList<Programmer> programmers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }
}
