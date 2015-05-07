package company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Office {

    public static void main(String[] args) throws IOException {

     /*   zp(getPlankton()); //Найти сотрудника у которого самая высокая зарплата.
        zp(getProgrammers());zp(getAdmins());zp(getManagers()); //Найти из каждого типа сотрудников самого высокооплачиваемого.
        Sort(getPlankton());	//Написать методы по сортировке
        write(getPlankton());   //Все данные по компания и сотрудникам перенести в файлы
        Uvolit(getPlankton()); //Уволить всех мужчин и женщинам поднять з.п
        AddEmployeeAndShow();	//Введенные данные с консоли записываются в файл+Пользователь может получить все данные из файла
        print();                //Пользователь может получить все данные из файла
  */}

    public static void print() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("F:\\a.txt"));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
    }

    public static void write(ArrayList<Plankton> v) throws IOException {

        File f = new File("F:\\a.txt");

        FileWriter writer = new FileWriter(f);
        for (int i = 0; i < v.size(); i++) {
            writer.write(v.get(i).getName() + ", ");
            writer.write(v.get(i).getSecondname() + ", ");
            writer.write(v.get(i).getAge() + ", ");
            writer.write(v.get(i).getGender() + ", "+'\n');
        }
        writer.flush();
        writer.close();
    }
    public static void AddEmployeeAndShow(){
        Scanner input= new Scanner(System.in);

        ArrayList <Plankton> NewEmployee = new ArrayList<Plankton>();
        Plankton New = new Plankton();

        System.out.print("VVedite name: ");
        New.setName(input.nextLine());
        System.out.print("VVedite secondname: ");
        New.setSecondname(input.nextLine());
        System.out.print("VVedite gender: ");
        New.setGender(input.nextLine());
        System.out.print("VVedite age: ");
        New.setAge(input.nextInt());
        System.out.print("VVedite salary: ");
        New.setSalary(input.nextDouble());
        NewEmployee.add(New);
        NewEmployee.addAll(getPlankton());

        for (int i = 0; i < NewEmployee.size(); i++) {
            System.out.print(NewEmployee.get(i).getName() + " ");
        }
        System.out.println();
    }

    public static void Uvolit(ArrayList<Plankton> t){  //Уволить всех мужчин и женщинам поднять з.п
        for (int i = 0; i < t.size(); i++) {
            if	(t.get(i).getGender().equals("male")){
                System.out.println(t.get(i).getName()+" - Uvolen");
                t.remove(i);
                i--;
            }
            else {
                t.get(i).setSalary( t.get(i).getSalary()*0.2+ t.get(i).getSalary());
                System.out.println(t.get(i).getName()+" - Poluchila nadbavku 20% -"+t.get(i).getSalary()*0.2 );
            }
        }
    }

    public static void Sort(ArrayList<Plankton> z){
        for (int i = 0; i < z.size(); i++) {                          //Sort po ZP
            for (int j = 0; j < z.size() - 1 - i ; j++) {
                if (z.get(j).getSalary() > z.get(j+1).getSalary()) {
                    double t = z.get(j+1).getSalary();
                    z.get(j+1).setSalary(z.get(j).getSalary());
                    z.get(j).setSalary(t);

                }
            }
        }
        for (int i = 0; i < z.size(); i++) {
            System.out.print(z.get(i).getSalary() + " ");
        }
        System.out.println();

        for (int i = 0; i < z.size(); i++) {                          //Sort po Age
            for (int j = 0; j < z.size() - 1 - i ; j++) {
                if (z.get(j).getAge() > z.get(j+1).getAge()) {
                    int t = z.get(j+1).getAge();
                    z.get(j+1).setAge(z.get(j).getAge());
                    z.get(j).setAge(t);

                }
            }
        }
        for (int i = 0; i < z.size(); i++) {
            System.out.print(z.get(i).getAge() + " ");
        }
        System.out.println();

        for (int i = 0; i < z.size(); i++) {                          //Sort po SecondNameLength
            for (int j = 0; j < z.size() - 1 - i ; j++) {
                if (z.get(j).getSecondname().length() > z.get(j+1).getSecondname().length()) {
                    String t = z.get(j+1).getSecondname();
                    z.get(j+1).setSecondname(z.get(j).getSecondname());
                    z.get(j).setSecondname(t);

                }
            }
        }
        for (int i = 0; i < z.size(); i++) {
            System.out.print(z.get(i).getSecondname() + " ");
        }
        System.out.println();

    }

    public static void zp(ArrayList<Plankton> zp){ //Найти сотрудника у которого самая высокая зарплата.
        double max=zp.get(0).getSalary();
        String WinnerName=zp.get(0).getName();
        for (int i = 0; i < zp.size(); i++) {
            if( zp.get(i).getSalary() > max) {
                max = zp.get(i).getSalary();
                WinnerName=zp.get(i).getName();
            }
        }
        System.out.println(WinnerName+" "+max);
    }

    public static ArrayList<Plankton> getProgrammers(){          //Создать три класса сотрудников Manager, Admin, Programmer.
        ArrayList <Plankton> Programmers = new ArrayList<Plankton>();
        Plankton programmer = new Plankton();
        programmer.setName("Petya");
        programmer.setSecondname("Nabiray");
        programmer.setGender("male");
        programmer.setAge(30);
        programmer.setSalary(12350);
        Programmers.add(programmer);

        Plankton programmer1 = new Plankton();
        programmer1.setName("Vera");
        programmer1.setSecondname("Solod");
        programmer1.setGender("female");
        programmer1.setAge(25);
        programmer1.setSalary(10000);
        Programmers.add(programmer1);

        Plankton programmer2 = new Plankton();
        programmer2.setName("Denys");
        programmer2.setSecondname("Nihachu");
        programmer2.setGender("male");
        programmer2.setAge(38);
        programmer2.setSalary(12000);
        Programmers.add(programmer2);

        return Programmers;
    }

    public static ArrayList<Plankton> getAdmins(){
        ArrayList <Plankton> Admins = new ArrayList<Plankton>();
        Plankton admin = new Plankton();
        admin.setName("Luda");
        admin.setSecondname("Shved");
        admin.setGender("female");
        admin.setAge(28);
        admin.setSalary(6000);
        Admins.add(admin);

        Plankton admin1 = new Plankton();
        admin1.setName("Lola");
        admin1.setSecondname("Lolkina");
        admin1.setGender("female");
        admin1.setAge(20);
        admin1.setSalary(2015);
        Admins.add(admin1);

        Plankton admin2 = new Plankton();
        admin2.setName("Evgeniy");
        admin2.setSecondname("Shokolad");
        admin2.setGender("male");
        admin2.setAge(29);
        admin2.setSalary(9700);
        Admins.add(admin2);

        return Admins;
    }

    public static ArrayList<Plankton> getManagers(){
        ArrayList <Plankton> Managers = new ArrayList<Plankton>();
        Plankton manager = new  Plankton();
        manager.setName("Jora");
        manager.setSecondname("Pahan");
        manager.setGender("male");
        manager.setAge(50);
        manager.setSalary(20000);
        Managers.add(manager);

        Plankton manager1 = new  Plankton();
        manager1.setName("Dima");
        manager1.setSecondname("Knyaz");
        manager1.setGender("male");
        manager1.setAge(45);
        manager1.setSalary(19200);
        Managers.add(manager1);

        Plankton manager2 = new  Plankton();
        manager2.setName("Vera");
        manager2.setSecondname("Soroka");
        manager2.setGender("female");
        manager2.setAge(38);
        manager2.setSalary(25600);
        Managers.add(manager2);
        return Managers;
    }

    public static ArrayList<Plankton> getPlankton(){
        ArrayList <Plankton> PlanktonList = new ArrayList<Plankton>();
        PlanktonList.addAll(getManagers());
        PlanktonList.addAll(getAdmins());
        PlanktonList.addAll(getProgrammers());

        return PlanktonList;
    }
}
