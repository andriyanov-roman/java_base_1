package Homework_7_oop_tasks;

import figures.Container;
import figures.Figure;
import figures.Treangle;

import javax.xml.parsers.SAXParser;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Дима on 30.04.2015.
 */
public class Oop_Company {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Valve");
        company.setEmployees(new ArrayList<Employee>());

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
        Sprogrammer.setLanguage("C++");
        Sprogrammer.setScale(300);

        company.getEmployees().addAll(Arrays.asList(Fadmin, Sadmin, Fmanager, Smanager, Fprogrammer, Sprogrammer));
        company.getMaxSalary();
        //самая высокая зарплата каждого из типа сотрудников
        company.getMaxASalary();
        company.getMaxMSalary();
        company.getMaxPSalary();
    }


}
