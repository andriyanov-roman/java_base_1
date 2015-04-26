package OOP;

import java.util.ArrayList;

/**
 * Created by ������� on 25.04.2015.
 */
public class Company {
    public static void main(String[] args) {

    showArrayNames(getWorkers());
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
    qaTester.setAge(22);
    qaTester.setGender("Female");
    qaTester.setSalary(1500);
    workersList.add(qaTester);

    Workers seoSpecialist = new Workers();
    seoSpecialist.setName("Egor");
    seoSpecialist.setSecondName("Sahnenko");
    seoSpecialist.setAge(22);
    seoSpecialist.setGender("Male");
    seoSpecialist.setSalary(1500);
    workersList.add(seoSpecialist);

    Workers webDesigner = new Workers();
    webDesigner.setName("Andrey");
    webDesigner.setSecondName("Kicha");
    webDesigner.setAge(22);
    webDesigner.setGender("Female");
    webDesigner.setSalary(1500);
    workersList.add(webDesigner);

    return new ArrayList (workersList);
    }

    public static void showArrayNames (ArrayList arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }


}