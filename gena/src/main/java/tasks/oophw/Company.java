package tasks.oophw;

import java.util.ArrayList;

/**
 * Created by sigen on 4/30/2015.
 */
public class Company {
    private ArrayList<Manager> managers;
    private ArrayList<Programmer> programmers;
    private ArrayList<Admin> admins;
    private String companyName;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayList<Programmer> getProgrammers() {
        return programmers;
    }

    public void setProgrammers(ArrayList<Programmer> programmers) {
        this.programmers = programmers;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public int findMaxSalaryAdm(Company comp){
        ArrayList<Admin> workers = new ArrayList();
        workers.addAll(comp.getAdmins());
        int max = workers.get(0).getSalary();
        for(Admin elem : workers){
            if(elem.getSalary()>max){
                max = elem.getSalary();
            }
        }
        return max;
    }

    public int findMaxSalaryMan(Company comp){
        ArrayList<Manager> workers = new ArrayList();
        workers.addAll(getManagers());
        int max = workers.get(0).getSalary();
        for(Manager elem : workers){
            if(elem.getSalary()>max){
                max = elem.getSalary();
            }
        }
        return max;
    }

    public int findMaxSalaryProg(Company comp){
        ArrayList<Programmer> workers = new ArrayList();
        workers.addAll(getProgrammers());
        int max = workers.get(0).getSalary();
        for(Programmer elem : workers){
            if(elem.getSalary()>max){
                max = elem.getSalary();
            }
        }
        return max;
    }
    public int findBiggestSalary(Company comp){
        int salAdmin, salManager, salProgrammer;
        int max = 0;
        salAdmin = findMaxSalaryAdm(comp);
        salManager = findMaxSalaryMan(comp);
        salProgrammer = findMaxSalaryProg(comp);
        if(salAdmin>salManager && salAdmin>salProgrammer){ max = salAdmin;}
        if(salManager>salAdmin && salManager>salProgrammer){ max = salManager;}
        if (salProgrammer > salAdmin && salProgrammer > salManager) { max  = salProgrammer;}

        return max;
    }

    public void showMaxAdminSalary(Company comp){
        ArrayList<Admin> admins = new ArrayList<>();
        admins = comp.getAdmins();
        for(Admin admin : admins ){
            if (admin.getSalary()== findMaxSalaryAdm(comp)){
                System.out.println("Maximum salary has admin with name " + admin.getName() + " " + admin.getSecondName() + " : " + admin.getSalary());
            }
        }
    }

    public void showMaxManagerSalary(Company comp){
        ArrayList<Manager> managers = new ArrayList<>(comp.getManagers());
        for(Manager manager : managers ){
            if (manager.getSalary()== findMaxSalaryMan(comp)){
                System.out.println("Maximum salary has manager with name " + manager.getName() + " " + manager.getSecondName() + " : " + manager.getSalary());
            }
        }
    }
    public void showMaxProgrammerSalary(Company comp){
        ArrayList<Programmer> programmers = new ArrayList<>(comp.getProgrammers());
        for(Programmer programmer : programmers ){
            if (programmer.getSalary()== findMaxSalaryProg(comp)){
                System.out.println("Maximum salary has programmer with name " + programmer.getName() + " " + programmer.getSecondName() + " : " + programmer.getSalary());
            }
        }
    }

    public void showMaxEmployeeSalary(Company comp){
        ArrayList<Admin> admins = new ArrayList<>(comp.getAdmins());
        ArrayList<Manager> managers = new ArrayList<>(comp.getManagers());
        ArrayList<Programmer> programmers = new ArrayList<>(getProgrammers());
        for(Manager manager : managers){
            if (manager.getSalary() == findBiggestSalary(comp)){
                System.out.println("Maximum salary between all the employees has manager with name "+ manager.getName()+ " " + manager.getSecondName() + " : " + manager.getSalary());
            }
        }
        for(Programmer programmer : programmers){
            if (programmer.getSalary() == findBiggestSalary(comp)){
                System.out.println("Maximum salary between all the employees has programmer with name " + programmer.getName() +  " " + programmer.getSecondName() + " : " + programmer.getSalary());
            }
        }
        for(Admin admin : admins){
            if (admin.getSalary() == findBiggestSalary(comp)){
                System.out.println("Maximum salary between all the employees has admin with name " + admin.getName() + " " + admin.getSecondName() + " : " + admin.getSalary());
            }
        }
    }

}
