package oop.comp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 4/28/2015.
 */
public class CompanyMain {
    public static void main(String[] args) {
        Company c1 = new Company();
        c1.setManagers(new ArrayList<>());
        Company c2 = new Company();
        c2.setManagers(new ArrayList<>());
        Company c3 = new Company();
        c3.setManagers(new ArrayList<>());

        Manager m1 = new Manager();
        m1.setSalary(6000);
        m1.setName("Ivan");
        Manager m2 = new Manager();
        m2.setName("Petro");
        m2.setSalary(6);
        Manager m3 = new Manager();
        m3.setSalary(10000);
        Manager m4 = new Manager();
        Manager m5 = new Manager();
        Manager m6 = new Manager();
        Manager m7 = new Manager();
        Manager m8 = new Manager();

        c1.getManagers().addAll(Arrays.asList(m1, m2, m3));
        c2.getManagers().addAll(Arrays.asList(m4, m5, m6));
        c3.getManagers().addAll(Arrays.asList(m7, m8));
        LocalDate date = LocalDate.now();
        System.out.println();
    }
}
