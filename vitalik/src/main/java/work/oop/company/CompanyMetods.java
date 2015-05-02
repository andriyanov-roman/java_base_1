package work.oop.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Реализация класса компания
 */
public class CompanyMetods extends Empleey {
    public static void main(String[] args) throws IOException {

        Company company = new Company();
        company.setName("Google");
        company.setAdmin(new ArrayList<Admin>());
        company.setManager(new ArrayList<Manager>());
        company.setProgrammer(new ArrayList<Programmer>());
        company.setEmpleeys(new ArrayList<Empleey>());

        ArrayList<Empleey> empleeys = new ArrayList<Empleey>();

        Admin a1 = new Admin();
        a1.setName("Stepan");
        a1.setSecondName("Sidorov");
        a1.setAge(68);
        a1.setSalary(2860);
        a1.setOsName("linux");
        empleeys.add(a1);

        Admin a2 = new Admin();
        a2.setName("Arem");
        a2.setSecondName("Mihailov");
        a2.setAge(26);
        a2.setSalary(6500);
        a2.setOsName("unux");
        empleeys.add(a2);

        Admin a3 = new Admin();
        a3.setName("Irina");
        a3.setSecondName("Dudnik");
        a3.setAge(19);
        a3.setSalary(1900);
        a3.setOsName("Windows Server");
        empleeys.add(a3);

        Manager m1 = new Manager();
        m1.setName("Vitalij");
        m1.setSecondName("Gorbunov");
        m1.setAge(28);
        m1.setSalary(12500);
        m1.setProjectName("opera");
        empleeys.add(m1);

        Manager m2 = new Manager();
        m2.setName("Ivan");
        m2.setSecondName("Ivanichenko");
        m2.setAge(18);
        m2.setSalary(12210);
        m2.setProjectName("C1");
        empleeys.add(m2);

        Manager m3 = new Manager();
        m3.setName("Petya");
        m3.setSecondName("Petrov");
        m3.setAge(22);
        m3.setSalary(14100);
        m3.setProjectName("Tank");
        empleeys.add(m3);

        Programmer p1 = new Programmer();
        p1.setName("Viktoria");
        p1.setSecondName("Anch");
        p1.setAge(38);
        p1.setSalary(14200);
        p1.setLangMachine("java");
        empleeys.add(p1);

        Programmer p2 = new Programmer();
        p2.setName("Rima");
        p2.setSecondName("Adardasova");
        p2.setAge(44);
        p2.setSalary(12860);
        p2.setLangMachine("C++");
        empleeys.add(p2);

        Programmer p3 = new Programmer();
        p3.setName("Faina");
        p3.setSecondName("Fedorova");
        p3.setAge(42);
        p3.setSalary(9300);
        p3.setLangMachine("HTML");
        empleeys.add(p3);

        Programmer p4 = new Programmer();
        p4.setName("Evgenija");
        p4.setSecondName("Avdeeva");
        p4.setAge(38);
        p4.setSalary(14730);
        p4.setLangMachine("PHP");
        empleeys.add(p4);

        company.getAdmin().addAll(Arrays.asList(a1, a2, a3));
        company.getManager().addAll(Arrays.asList(m1, m2, m3));
        company.getProgrammer().addAll(Arrays.asList(p1, p2, p3, p4));

        System.out.println("\nВ компании " + company.getName() + " работают сотрудники: ");
        printCompany(company);
        company.getMaxSalaryA();
        company.getMaxSalaryM();
        company.getMaxSalaryP();


        int maxA = 0, maxM = 0, maxP = 0;
        int a = 0, b = 0, c = 0, max = 0;
        for (int i = 0; i < empleeys.size(); i++) {
            if (empleeys.get(i) instanceof Admin) {
                maxA = empleeys.get(i).getSalary();
                a = i;
            }
            if (empleeys.get(i) instanceof Manager) {
                maxM = empleeys.get(i).getSalary();
                b = i;
            }
            if (empleeys.get(i) instanceof Programmer) {
                maxP = empleeys.get(i).getSalary();
                c = i;
            }
        }
        if (maxA > maxM && maxA > maxP) {
            max = a;
        }
        if (maxA < maxM && maxM > maxP) {
            max = b;
        }
        if (maxP > maxM && maxA < maxP) {
            max = c;
        }
        System.out.println("\nСотрудник компании " + company.getName() + " с наивысшей зарплатой: " + empleeys.get(max).getName() + " " + empleeys.get(max).getSecondName()
                + " зарплата: " + empleeys.get(max).getSalary());

//++++++++++++++++++++++++++++++++ File ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        File file = new File("D:\\InformationCompany.txt");
        FileWriter writer = new FileWriter(file, true);
        writer.write("\nВ компании " + company.getName() + " работают сотрудники: " + '\n');
        writer.write("\nОтдел администраторов:" + '\n');
        for (int i = 0; i < company.getAdmin().size(); i++) {
            writer.write(company.getAdmin().get(i).getName() + " " + company.getAdmin().get(i).getSecondName() + " " + company.getAdmin().get(i).getAge()
                    + " " + company.getAdmin().get(i).getSalary() + " " + company.getAdmin().get(i).getOsName() + '\n');
        }
        writer.write("\nОтдел менеджеров:" + '\n');
        for (int i = 0; i < company.getManager().size(); i++) {
            writer.write(company.getManager().get(i).getName() + " " + company.getManager().get(i).getSecondName() + " " + company.getManager().get(i).getAge()
                    + " " + company.getManager().get(i).getSalary() + " " + company.getManager().get(i).getProjectName() + '\n');
        }
        writer.write("\nОтдел программистов:" + '\n');
        for (int i = 0; i < company.getProgrammer().size(); i++) {
            writer.write(company.getProgrammer().get(i).getName() + " " + company.getProgrammer().get(i).getSecondName() + " " + company.getProgrammer().get(i).getAge()
                    + " " + company.getProgrammer().get(i).getSalary() + " " + company.getProgrammer().get(i).getLangMachine() + '\n');
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите текст: \nдля записи текста в файл введите - save");
        for (; ; ) {
            str = br.readLine();
            if (str.equals("save"))
                break;
            writer.write(str + '\n');
        }
        writer.flush();
        writer.close();

        System.out.println("\n++++++++ Вывод содержания файла ++++++++");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String fileLine;
        while ((fileLine = bufferedReader.readLine()) != null) {
            System.out.println(fileLine);
        }


    }


    public static void printCompany(Company company) {
        System.out.println("\nОтдел администраторов:");
        for (int i = 0; i < company.getAdmin().size(); i++) {
            System.out.println(company.getAdmin().get(i).getName() + " " + company.getAdmin().get(i).getSecondName() + " " + company.getAdmin().get(i).getAge()
                    + " " + company.getAdmin().get(i).getSalary() + " " + company.getAdmin().get(i).getOsName());
        }
        System.out.println("\nОтдел менеджеров:");
        for (int i = 0; i < company.getManager().size(); i++) {
            System.out.println(company.getManager().get(i).getName() + " " + company.getManager().get(i).getSecondName() + " " + company.getManager().get(i).getAge()
                    + " " + company.getManager().get(i).getSalary() + " " + company.getManager().get(i).getProjectName());
        }
        System.out.println("\nОтдел программистов:");
        for (int i = 0; i < company.getProgrammer().size(); i++) {
            System.out.println(company.getProgrammer().get(i).getName() + " " + company.getProgrammer().get(i).getSecondName() + " " + company.getProgrammer().get(i).getAge()
                    + " " + company.getProgrammer().get(i).getSalary() + " " + company.getProgrammer().get(i).getLangMachine());
        }
    }

}

