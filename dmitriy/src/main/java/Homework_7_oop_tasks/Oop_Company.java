package Homework_7_oop_tasks;

import java.util.ArrayList;

/**
 * Created by Дима on 30.04.2015.
 */
public class Oop_Company {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Valve");
        company.setManagers(new ArrayList<Manager>());
        company.setAdmins(new ArrayList<Admin>());
        company.setProgrammers(new ArrayList<Programmer>());

        Manager Fmanager = new Manager();
        Fmanager.setName("Vlad");
        Fmanager.setSurname("Bachinskiy");
        Fmanager.setAge(20);
        Fmanager.setProject("X");
        Fmanager.setScale(200);

        Manager Smanager = new Manager();
        Smanager.setName("Gena");
        Smanager.setSurname("Faromin");
        Smanager.setAge(21);
        Smanager.setProject("X_patch");
        Smanager.setScale(100);

        Admin Fadmin = new Admin();
        Fadmin.setName("Vova");
        Fadmin.setSurname("Agekrimov");
        Fadmin.setAge(19);
        Fadmin.setPlatform("Windows");
        Fadmin.setScale(100);

        Admin Sadmin = new Admin();
        Sadmin.setName("Ken");
        Sadmin.setSurname("Hurikan");
        Sadmin.setAge(18);
        Sadmin.setPlatform("Windows_beta");
        Sadmin.setScale(50);

        Programmer Fprogrammer = new Programmer();
        Fprogrammer.setName("Dima");
        Fprogrammer.setSurname("Kuba");
        Fprogrammer.setAge(30);
        Fprogrammer.setLanguage("Java");
        Fprogrammer.setScale(400);

        Programmer Sprogrammer = new Programmer();
        Sprogrammer.setName("Den");
        Sprogrammer.setSurname("Nicki");
        Sprogrammer.setAge(25);
        Sprogrammer.setLanguage("Java 1.8");
        Sprogrammer.setScale(300);

    }


}
