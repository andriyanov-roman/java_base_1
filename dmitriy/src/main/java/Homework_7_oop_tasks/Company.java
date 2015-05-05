package Homework_7_oop_tasks;

import java.util.ArrayList;

/**
 * Created by Дима on 30.04.2015.
 */
public class Company {
    private String name;
    private ArrayList<Employee> employees;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void getMaxSalary(){
        Employee max = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getScale() > max.getScale()) {
                max = employees.get(i);
            }
        }
        System.out.println(max.getName() +  " " + max.getSurname());
    }

    public void getMaxASalary(){
        Employee max = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getScale() > max.getScale() && employees.get(i) instanceof Admin) {
                max = employees.get(i);
            }
        }
        System.out.println(max.getName() +  " " + max.getSurname());
    }

    public void getMaxMSalary(){
        Employee max = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getScale() > max.getScale() && employees.get(i) instanceof Manager) {
                max = employees.get(i);
            }
        }
        System.out.println(max.getName() +  " " + max.getSurname());
    }

    public void getMaxPSalary(){
        Employee max = employees.get(0);
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getScale() > max.getScale() && employees.get(i) instanceof Programmer) {
                max = employees.get(i);
            }
        }
        System.out.println(max.getName() +  " " + max.getSurname());
    }
}
