package Homework_7;

/**
 * Created by Дима on 21.04.2015.
 */
public class oop {
    public static void main(String[] args) {
        Human[] person = getHumans();
        //поменять минимальное и максимальное значение местами
        int min = person[0].surname.length();
        int max = person[0].surname.length();
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i].surname.length() > max) {
                max = person[i].surname.length();
                maxI = i;
            } else if (person[i].surname.length() < min) {
                min = person[i].surname.length();
                minI = i;
            }
        }
        String temp = person[maxI].surname;
        person[maxI].surname = person[minI].surname;
        person[minI].surname = temp;
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].surname);
        }
        //отсортировать по всем состояниям
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].name.length() > person[j + 1].name.length()) {
                    String t = person[j + 1].name;
                    person[j + 1].name = person[j].name;
                    person[j].name = t;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].surname.length() > person[j + 1].surname.length()) {
                    String t = person[j + 1].surname;
                    person[j + 1].surname = person[j].surname;
                    person[j].surname = t;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].age > person[j + 1].age) {
                    int t = person[j + 1].age;
                    person[j + 1].age = person[j].age;
                    person[j].age = t;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].height > person[j + 1].height) {
                    double t = person[j + 1].height;
                    person[j + 1].height = person[j].height;
                    person[j].height = t;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].weight > person[j + 1].weight) {
                    double t = person[j + 1].weight;
                    person[j + 1].weight = person[j].weight;
                    person[j].weight = t;
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].name);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].surname);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].age);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].height);
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].weight);
        }


    }

    public static Human[] getHumans() {
        Human h1 = new Human();
        h1.name = "Dima";
        h1.surname = "Andry";
        h1.age = 16;
        h1.height = 1.74;
        h1.weight = 65.0;
        Human h2 = new Human();
        h2.name = "Dima";
        h2.surname = "Sid";
        h2.age = 16;
        h2.height = 1.65;
        h2.weight = 50.0;
        Human h3 = new Human();
        h3.name = "Vova";
        h3.surname = "Logvinenko";
        h3.age = 15;
        h3.height = 1.62;
        h3.weight = 55.0;
        Human h4 = new Human();
        h4.name = "Danil";
        h4.surname = "Pisarenko";
        h4.age = 17;
        h4.height = 1.80;
        h4.weight = 75.0;
        Human h5 = new Human();
        h5.name = "Pavel";
        h5.surname = "Karpenko";
        h5.age = 16;
        h5.height = 1.79;
        h5.weight = 80.0;
        Human h6 = new Human();
        h6.name = "Valera";
        h6.surname = "Bass";
        h6.age = 16;
        h6.height = 1.76;
        h6.weight = 65.0;
        Human h7 = new Human();
        h7.name = "Marina";
        h7.surname = "Tykhonenko";
        h7.age = 15;
        h7.height = 1.69;
        h7.weight = 40.0;
        Human h8 = new Human();
        h8.name = "Nastya";
        h8.surname = "Artemenko";
        h8.age = 15;
        h8.height = 1.58;
        h8.weight = 40.0;
        Human h9 = new Human();
        h9.name = "Katya";
        h9.surname = "Kiblitskaya";
        h9.age = 15;
        h9.height = 1.74;
        h9.weight = 40.0;
        Human h10 = new Human();
        h10.name = "Liza";
        h10.surname = "Gansevich";
        h10.age = 16;
        h10.height = 1.71;
        h10.weight = 50;
        return new Human[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};

    }


}
