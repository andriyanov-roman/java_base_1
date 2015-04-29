package oop.comp;

import java.util.ArrayList;

/**
 * Created by user on 4/28/2015.
 */
public class Company {
    private ArrayList<Manager> managers;
    private String name;
    private ArrayList<Admin> admins;

    public ArrayList<Manager> getManagers() {

        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public void getMaxSalary() {
        Manager managerMax = managers.get(0);
        for (int i = 0; i < managers.size(); i++) {
            if (managers.get(i).getSalary() > managerMax.getSalary()) {
                managerMax = managers.get(i);
            }
        }
    }
}
