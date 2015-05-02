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

    public ArrayList<Empleey> getEmpleeys() {
        return empleeys;
    }

    public void setEmpleeys(ArrayList<Empleey> empleeys) {
        this.empleeys = empleeys;
    }

    private ArrayList<Empleey> empleeys;

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


    public void getMaxSalaryM() {
        int max = 0;
        Manager managerMax = manager.get(0);
        for (int i = 0; i < manager.size(); i++) {
            if (manager.get(i).getSalary() > managerMax.getSalary()) {
                managerMax = manager.get(i);
                max = i;
            }
        }
        System.out.println("Менеджер с наивысшей зарплатой: " + manager.get(max).getName() + " " + manager.get(max).getSecondName()
                + " зарплата: " + manager.get(max).getSalary());

    }

    public void getMaxSalaryA() {
        int max = 0;
        Admin adminMax = admin.get(0);
        for (int i = 0; i < admin.size(); i++) {
            if (admin.get(i).getSalary() > adminMax.getSalary()) {
                adminMax = admin.get(i);
                max = i;
            }
        }
        System.out.println("\nАдминистратор с наивысшей зарплатой: " + admin.get(max).getName() + " " + admin.get(max).getSecondName()
                + " зарплата: " + admin.get(max).getSalary());
    }

    public void getMaxSalaryP() {
        int max = 0;
        Programmer programmerMax = programmer.get(0);
        for (int i = 0; i < programmer.size(); i++) {
            if (programmer.get(i).getSalary() > programmerMax.getSalary()) {
                programmerMax = programmer.get(i);
                max = i;
            }
        }
        System.out.println("Программист с наивысшей зарплатой: " + programmer.get(max).getName() + " " + programmer.get(max).getSecondName()
                + " зарплата: " + programmer.get(max).getSalary());

    }
}
