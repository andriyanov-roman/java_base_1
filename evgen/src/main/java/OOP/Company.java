package OOP;

/**
 * Created by ������� on 25.04.2015.
 */
public class Company {
    public static void main(String[] args) {

    showArrayNames(getWorkers());
    }


public static Workers[] getWorkers() {

    Workers genDirector = new Workers();
    genDirector.setName("Stev");
    genDirector.setSecondName("Jobs");
    genDirector.setAge(57);
    genDirector.setGender("Male");
    genDirector.setSalary(10000);

    Workers mainProgrammer = new Workers();
    mainProgrammer.setName("Eugene");
    mainProgrammer.setSecondName("Deyneka");
    mainProgrammer.setAge(22);
    mainProgrammer.setGender("Male");
    mainProgrammer.setSalary(3000);

    Workers secretary = new Workers();
    secretary.setName("Alina");
    secretary.setSecondName("Melnik");
    secretary.setAge(23);
    secretary.setGender("Female");
    secretary.setSalary(400);

    Workers qaTester = new Workers();
    qaTester.setName("Anna");
    qaTester.setSecondName("Zayka");
    qaTester.setAge(22);
    qaTester.setGender("Female");
    qaTester.setSalary(1500);

    Workers seoSpecialist = new Workers();
    seoSpecialist.setName("Anna");
    seoSpecialist.setSecondName("Zayka");
    seoSpecialist.setAge(22);
    seoSpecialist.setGender("Female");
    seoSpecialist.setSalary(1500);

    Workers webDesigner = new Workers();
    webDesigner.setName("Andrey");
    webDesigner.setSecondName("Kicha");
    webDesigner.setAge(22);
    webDesigner.setGender("Female");
    webDesigner.setSalary(1500);

    return new Workers[]{genDirector, mainProgrammer, secretary, qaTester, seoSpecialist, webDesigner};
    }

    public static void showArrayNames (Workers[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getName() + " ");
        }
        System.out.println();
    }

    public static void sortNames (Workers[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j].getName().length() > arr[j + 1].getName().length()) {
                    String t = arr[j + 1].getName();
                    arr[j + 1].setName(arr[j].getName());
                    arr[j].setName(t);
                }
            }
        }
        showArrayNames(arr);
    }
}