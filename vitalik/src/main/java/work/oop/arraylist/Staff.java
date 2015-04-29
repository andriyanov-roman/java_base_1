package work.oop.arraylist;

//import java.util.ArrayList;
//
///**
// * Домашняя ArrayList
// */
//public class Staff {
//    public static void main(String[] args) {
//
//        System.out.println("\nМассив сотрудников: ");
//        System.out.println();
//        printEmployee(getEmployee());
//
////сортировка Компания 1 - по зп
//        companuOne(getEmployee());
//        System.out.println();
//
////сортировка Компания 2 - по возрасту
//        companuTwo(getEmployee());
//        System.out.println();
//
////сортировка Компания 3 - по длинне фамилии
//        companuThree(getEmployee());
//        System.out.println();
//
////Найти сотрудника у которого самая высокая зарплата
//        maxSalary(getEmployee());
//        System.out.println();
//
////Найти из каждого типа сотрудников самого высокооплачиваемого
//        maxSalaryGroup(getEmployee());
//        System.out.println();
//
////Уволить всех мужчин и женщинам поднять з.п
//        dismissal(getEmployee());
//        System.out.println();
//
//    }
///*++++++++++++++++++++++++++++++ Методы ++++++++++++++++++++++++++++++++++++++++++++++++++*/
//
//    //сортировка Компания 1 - по зп
//    public static void companuOne(ArrayList<Employee> employee) {
//        System.out.println("\nСортировка компания 1 - по зп: ");
//        System.out.println();
//        for (int i = 0; i < employee.size(); i++) {
//            for (int j = 0; j < employee.size(); j++) {
//                if (employee.get(i).getSalary() < employee.get(j).getSalary()) {
//                    Employee buf = employee.get(j);
//                    employee.set(j, employee.get(i));
//                    employee.set(i, buf);
//                }
//            }
//        }
//        printEmployee(employee);
//    }
//
//    //сортировка Компания 2 - возраст
//    public static void companuTwo(ArrayList<Employee> employee) {
//        System.out.println("\nСортировка компания 2 - возраст: ");
//        System.out.println();
//        for (int i = 0; i < employee.size(); i++) {
//            for (int j = 0; j < employee.size(); j++) {
//                if (employee.get(i).getAge() < employee.get(j).getAge()) {
//                    Employee buf = employee.get(j);
//                    employee.set(j, employee.get(i));
//                    employee.set(i, buf);
//                }
//            }
//        }
//        printEmployee(employee);
//    }
//
//    //сортировка Компания 3 длинна фамилии
//    public static void companuThree(ArrayList<Employee> employee) {
//        System.out.println("\nСортировка компания 3 - фамилии: ");
//        System.out.println();
//        for (int i = 0; i < employee.size(); i++) {
//            for (int j = 0; j < employee.size(); j++) {
//                if (employee.get(i).getSecondName().length() < employee.get(j).getSecondName().length()) {
//                    Employee buf = employee.get(j);
//                    employee.set(j, employee.get(i));
//                    employee.set(i, buf);
//                }
//            }
//        }
//        printEmployee(employee);
//    }
//
//    //Уволить всех мужчин и женщинам поднять з.п
//    public static void dismissal(ArrayList<Employee> employee) {
//        System.out.println("\nМужчины уволенны, женщины с новой зарплатой: ");
//        System.out.println();
//        int z = 300;
//        for (int i = 0; i < employee.size(); i++) {
//            for (int j = 0; j < employee.size(); j++) {
//                if (employee.get(i).getMg().equals("m")) {
//                    employee.remove(i);
//                }
//                if (employee.get(i).getMg().equals("g")) {
//                    employee.get(i).setSalary(employee.get(i).getSalary() + z);
//                }
//            }
//        }
//        printEmployee(employee);
//    }
//
//    //Найти сотрудника у которого самая высокая зарплата
//    public static void maxSalary(ArrayList<Employee> employee) {
//        System.out.print("\nСамая высокая зарплата: ");
//        int max = 0;
//        int rich = 0;
//        for (int i = 0; i < employee.size(); i++) {
//            for (int j = 0; j < employee.size(); j++) {
//                if (employee.get(i).getSalary() > max) {
//                    max = employee.get(i).getSalary();
//                    rich = i;
//                }
//            }
//        }
//        System.out.println(employee.get(rich).getName() + " " + employee.get(rich).getSecondName()
//                + " зарплата: " + employee.get(rich).getSalary());
//    }
//
//    //Найти из каждого типа сотрудников самого высокооплачиваемого
//    public static void maxSalaryGroup(ArrayList<Employee> employee) {
//        System.out.print("\nСамая высокая зарплата: ");
//        int max = 0;
//        int rich = 0;
//        for (int i = 0; i < employee.size(); i++) {
//            for (int j = 0; j < employee.size(); j++) {
//                if (employee.get(i).getGroup().equals("Manager")){
//                if (employee.get(i).getSalary() > max) {
//                    max = employee.get(i).getSalary();
//                    rich = i;
//                }}
//            }
//        }
//        System.out.println(employee.get(rich).getName() + " " + employee.get(rich).getSecondName()
//                + " зарплата: " + employee.get(rich).getSalary());
//    }
//
//    //Вывод списка
//    public static void printEmployee(ArrayList<Employee> employee) {
//        for (int i = 0; i < employee.size(); i++) {
//            System.out.println(employee.get(i).getName() + "    " + employee.get(i).getSecondName()
//                    + "    " + employee.get(i).getAge() + "    "
//                    + employee.get(i).getSalary() + "    " + employee.get(i).getMg() + "    " + employee.get(i).getGroup());
//        }
//    }
//
//    public static ArrayList getEmployee() {
//        ArrayList<Employee> employeesCompany = new ArrayList<Employee>();
//
//        Employee e1 = new Employee();
//        e1.setName("Vitalij");
//        e1.setSecondName("Gorbunov");
//        e1.setAge(28);
//        e1.setSalary(2500);
//        e1.setMg("m");
//        e1.setGroup("Manager");
//        employeesCompany.add(e1);
//
//        Employee e2 = new Employee();
//        e2.setName("Ivan");
//        e2.setSecondName("Ivanichenko");
//        e2.setAge(18);
//        e2.setSalary(2210);
//        e2.setMg("m");
//        e2.setGroup("Manager");
//        employeesCompany.add(e2);
//
//        Employee e3 = new Employee();
//        e3.setName("Petya");
//        e3.setSecondName("Petrov");
//        e3.setAge(22);
//        e3.setSalary(4100);
//        e3.setMg("m");
//        e3.setGroup("Manager");
//        employeesCompany.add(e3);
//
//        Employee e4 = new Employee();
//        e4.setName("Stepan");
//        e4.setSecondName("Sidorov");
//        e4.setAge(68);
//        e4.setSalary(2860);
//        e4.setMg("m");
//        e4.setGroup("Admin");
//        employeesCompany.add(e4);
//
//        Employee e5 = new Employee();
//        e5.setName("Arem");
//        e5.setSecondName("Mihailov");
//        e5.setAge(26);
//        e5.setSalary(6500);
//        e5.setMg("m");
//        e5.setGroup("Admin");
//        employeesCompany.add(e5);
//
//        Employee e6 = new Employee();
//        e6.setName("Irina");
//        e6.setSecondName("Dudnik");
//        e6.setAge(19);
//        e6.setSalary(1900);
//        e6.setMg("g");
//        e6.setGroup("Admin");
//        employeesCompany.add(e6);
//
//        Employee e7 = new Employee();
//        e7.setName("Viktoria");
//        e7.setSecondName("Anch");
//        e7.setAge(38);
//        e7.setSalary(4200);
//        e7.setMg("g");
//        e7.setGroup("Programmer");
//        employeesCompany.add(e7);
//
//        Employee e8 = new Employee();
//        e8.setName("Rima");
//        e8.setSecondName("Adardasova");
//        e8.setAge(44);
//        e8.setSalary(2860);
//        e8.setMg("g");
//        e8.setGroup("Programmer");
//        employeesCompany.add(e8);
//
//        Employee e9 = new Employee();
//        e9.setName("Faina");
//        e9.setSecondName("Fedorova");
//        e9.setAge(42);
//        e9.setSalary(6300);
//        e9.setMg("g");
//        e9.setGroup("Programmer");
//        employeesCompany.add(e9);
//
//        Employee e10 = new Employee();
//        e10.setName("Evgenija");
//        e10.setSecondName("Avdeeva");
//        e10.setAge(38);
//        e10.setSalary(4730);
//        e10.setMg("g");
//        e10.setGroup("Programmer");
//        employeesCompany.add(e10);
//
//        return new ArrayList(employeesCompany);
//    }
//}
