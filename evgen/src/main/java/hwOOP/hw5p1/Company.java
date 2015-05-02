/*
package hwOOP.hw5p1;

import java.util.ArrayList;

*/
/**
 * Created by Евгений on 29.04.2015.
 *//*

public class Company {

    private String name;
    private ArrayList<Worker> workers;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   */
/* public ArrayList<Manager> getManagers() {
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

        Есть три фигуры: квадрат, треугольник и круг. У всех фигур есть названия. У ввс фигур есть состояния названия. У треугольника в
        качестве состояния есть сторона и высота, как и у квадрата. а у круга есть радиус. Нам нужно найти площадь и перимет кажой фигуры.
    }*//*


    public void getMaxManagerSalary() {
        Manager managerMax = managers.get(0);
        int maxSalaryInd = 0;
        for (int i = 0; i < managers.size(); i++) {
            if(managers.get(i).getSalary() > managerMax.getSalary()) {
                managerMax = managers.get(i);
                maxSalaryInd = i;
            }
        }
        System.out.println(managers.get(maxSalaryInd).getName() + " " + managers.get(maxSalaryInd).getSurname());
        System.out.println("Зароботная плата составляет: " + managers.get(maxSalaryInd).getSalary() + "$");
        System.out.println();
    }

    public void getMaxProgerSalary() {
        Programmer managerMax = programmers.get(0);
        int maxSalaryInd = 0;
        for (int i = 0; i < programmers.size(); i++) {
            if(programmers.get(i).getSalary() > managerMax.getSalary()) {
                managerMax = programmers.get(i);
                maxSalaryInd = i;
            }
        }
        System.out.println(programmers.get(maxSalaryInd).getName() + " " + programmers.get(maxSalaryInd).getSurname());
        System.out.println("Зароботная плата составляет: " + programmers.get(maxSalaryInd).getSalary() + "$");
        System.out.println();
    }

    public void getMaxAdminSalary() {
        Admin managerMax = admins.get(0);
        int maxSalaryInd = 0;
        for (int i = 0; i < admins.size(); i++) {
            if(admins.get(i).getSalary() > managerMax.getSalary()) {
                managerMax = admins.get(i);
                maxSalaryInd = i;
            }
        }
        System.out.println(admins.get(maxSalaryInd).getName() + " " + admins.get(maxSalaryInd).getSurname());
        System.out.println("Зароботная плата составляет: " + admins.get(maxSalaryInd).getSalary() + "$");
        System.out.println();
    }
}
*/
