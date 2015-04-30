package tasks.oophw;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Adler32;

/**
 * Created by sigen on 4/30/2015.
 */
public class Main {
    public static void main(String[] args) {
        Company comp = new Company();
        comp.setCompanyName("Kloaka");

        Manager manager0 = new Manager("Vasiliy", "Pupkin", 3000, 28, "WebChat");
        Manager manager1 = new Manager("Arkadiy", "Ukupnik", 3500, 50, "Useless");
        ArrayList<Manager> managers = new ArrayList(Arrays.asList(manager0, manager1));
        comp.setManagers(managers);

        Programmer programmer0 = new Programmer("Gennadiy", "Sipakov", 2000, 20, "Java SE");
        Programmer programmer1 = new Programmer("Koval", "Dmitriy", 2100, 20, "C#");
        Programmer programmer2 = new Programmer("Shevchuk", "Dmitriy", 3000, 20, "Ruby");
        Programmer programmer3 = new Programmer("Kuzmenko", "Artem", 1500, 21, "Javascript");
        ArrayList<Programmer> programmers = new ArrayList<Programmer>(Arrays.asList(programmer0, programmer1, programmer2, programmer3));
        comp.setProgrammers(programmers);

        Admin admin0 = new Admin("Grigoriy","Petrov", 700, 32, "Unix");
        Admin admin1 = new Admin("Evgeniy", "Malovitsa", 600, 28, "Windows");
        ArrayList<Admin> admins = new ArrayList<Admin>(Arrays.asList(admin0, admin1));
        comp.setAdmins(admins);



        comp.showMaxAdminSalary(comp);
        comp.showMaxProgrammerSalary(comp);
        comp.showMaxManagerSalary(comp);
        comp.showMaxEmployeeSalary(comp);


    }

}
