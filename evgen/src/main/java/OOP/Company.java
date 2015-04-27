package OOP;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by ������� on 25.04.2015.
 */
public class Company {
    public static void main(String[] args) {

        System.out.print("Сортировка по длине фамилии сотрудников: ");
        sortSecondNames(getWorkers());

        System.out.print("Сортируем зарплаты сотрудников: ");
        sortSalaries(getWorkers());

        System.out.print("Сортируем сотрудников по возрасту: ");
        sortAges(getWorkers());

        System.out.println("Увольняем мужчин и поднимаем зарплату женщинам на 500$: ");
        dismissMaleWorkers(getWorkers());

        System.out.println("Переносим данные о сотрудникам в файл file.txt в текущую директорию: ");
        List<Workers> str = new ArrayList<Workers>();

        str.addAll(getWorkers());

        Writer writer = null;
        try {
            writer = new FileWriter("file.txt");
            for (Workers line : str) {
                writer.write(String.valueOf(line.getName() + "\t" + line.getSecondName() + "\t" + line.getAge() + "\t" +
                        line.getGender() + "\t" + line.getSalary()) + "\t");
                writer.write(System.getProperty("line.separator"));
            }
            writer.flush();
        } catch (Exception e) {
            Logger.getLogger(FileTest.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException ex) {
                }
            }
        }
    }


public static ArrayList getWorkers() {

    ArrayList<Workers> workersList = new ArrayList<Workers>();

    Workers genDirector = new Workers();
    genDirector.setName("Stev");
    genDirector.setSecondName("Jobs");
    genDirector.setAge(57);
    genDirector.setGender("Male");
    genDirector.setSalary(10000);
    workersList.add(genDirector);

    Workers mainProgrammer = new Workers();
    mainProgrammer.setName("Eugene");
    mainProgrammer.setSecondName("Deyneka");
    mainProgrammer.setAge(22);
    mainProgrammer.setGender("Male");
    mainProgrammer.setSalary(3000);
    workersList.add(mainProgrammer);

    Workers secretary = new Workers();
    secretary.setName("Alina");
    secretary.setSecondName("Orlova");
    secretary.setAge(23);
    secretary.setGender("Female");
    secretary.setSalary(400);
    workersList.add(secretary);

    Workers qaTester = new Workers();
    qaTester.setName("Anna");
    qaTester.setSecondName("Zayka");
    qaTester.setAge(24);
    qaTester.setGender("Female");
    qaTester.setSalary(1700);
    workersList.add(qaTester);

    Workers seoSpecialist = new Workers();
    seoSpecialist.setName("Egor");
    seoSpecialist.setSecondName("Sahnenko");
    seoSpecialist.setAge(21);
    seoSpecialist.setGender("Male");
    seoSpecialist.setSalary(1200);
    workersList.add(seoSpecialist);

    Workers webDesigner = new Workers();
    webDesigner.setName("Andrey");
    webDesigner.setSecondName("Kicha");
    webDesigner.setAge(22);
    webDesigner.setGender("Male");
    webDesigner.setSalary(1500);
    workersList.add(webDesigner);

    return new ArrayList (workersList);
    }

    public static void showSecondNames(ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).getSecondName() + " ");
        }
        System.out.println();
    }

    public static void showSalaries (ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).getSalary() + "$" + "(" + arr.get(i).getSecondName() + ")" + " ");
        }
        System.out.println();
    }

    public static void showAges (ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i).getSecondName() + "(" + arr.get(i).getAge() + " years old" + ")" + " ");
        }
        System.out.println();
    }

    public static void sortSecondNames (ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1 - i ; j++) {
                if (arr.get(j).getSecondName().length() > arr.get(j + 1).getSecondName().length()) {
                    String t = arr.get(j + 1).getSecondName();
                    arr.get(j + 1).setSecondName(arr.get(j).getSecondName());
                    arr.get(j).setSecondName(t);
                }
            }
        }
        showSecondNames(arr);
    }

    public static void sortSalaries(ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1 - i ; j++) {
                if (arr.get(j).getSalary() > arr.get(j + 1).getSalary()) {
                    int t = arr.get(j + 1).getSalary();
                    arr.get(j + 1).setSalary(arr.get(j).getSalary());
                    arr.get(j).setSalary(t);
                    String t2 = arr.get(j + 1).getSecondName();
                    arr.get(j + 1).setSecondName(arr.get(j).getSecondName());
                    arr.get(j).setSecondName(t2);
                }
            }
        }
        showSalaries(arr);
    }

    public static void sortAges(ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1 - i ; j++) {
                if (arr.get(j).getAge() > arr.get(j + 1).getAge()) {
                    int t = arr.get(j + 1).getAge();
                    arr.get(j + 1).setAge(arr.get(j).getAge());
                    arr.get(j).setAge(t);
                    String t2 = arr.get(j + 1).getSecondName();
                    arr.get(j + 1).setSecondName(arr.get(j).getSecondName());
                    arr.get(j).setSecondName(t2);
                }
            }
        }
        showAges(arr);
    }

    public static void dismissMaleWorkers(ArrayList<Workers> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getGender().equals("Male")) {
                arr.remove(i);
                i--;
            } else {
                arr.get(i).setSalary(arr.get(i).getSalary() + 500);
            }
        }
        showSalaries(arr);
    }
}