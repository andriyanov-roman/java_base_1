package Homework_7_oop_tasks;

import java.util.ArrayList;

/**
 * Created by Дима on 21.04.2015.
 */
public class oop {
    public static void main(String[] args) {
        Human[] person = getHumans();
        //поменять минимальное и максимальное значение местами
        int min = person[0].getSurname().length();
        int max = person[0].getSurname().length();
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < person.length; i++) {
            if (person[i].getSurname().length() > max) {
                max = person[i].getSurname().length();
                maxI = i;
            } else if (person[i].getSurname().length() < min) {
                min = person[i].getSurname().length();
                minI = i;
            }
        }
        String temp = person[maxI].getSurname();
        person[maxI].setSurname(person[min].getName());
        person[minI].setSurname(temp);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getSurname());
        }
        //отсортировать по всем состояниям
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].getName().length() > person[j + 1].getName().length()) {
                    String t = person[j + 1].getName();
                    person[j + 1].setName(person[j].getName());
                    person[j].setName(t);
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].getSurname().length() > person[j + 1].getSurname().length()) {
                    String t = person[j + 1].getSurname();
                    person[j + 1].setSurname(person[j].getSurname());
                    person[j].setSurname(t);
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].getAge() > person[j + 1].getAge()) {
                    int t = person[j + 1].getAge();
                    person[j + 1].setAge(person[j].getAge());
                    person[j].setAge(t);
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].getHeight() > person[j + 1].getHeight()) {
                    double t = person[j + 1].getHeight();
                    person[j + 1].setHeight(person[j].getHeight());
                    person[j].setHeight(t);
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - i - 1; ) {
                if (person[j].getWeight() > person[j + 1].getWeight()) {
                    double t = person[j + 1].getWeight();
                    person[j + 1].setWeight(person[j].getWeight());
                    person[j].setWeight(t);
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getName());
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getSurname());
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getAge());
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getHeight());
        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].getWeight());
        }
        //отсортировать по зп, возрасту, длине фамилии
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getScale() < person[j + 1].getScale()) {
                    Human clone = new Human();
                    clone = person[j + 1];
                    person[j + 1] = person[j];
                    person[j] = person[j + 1];
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    Human clone = new Human();
                    clone = person[j + 1];
                    person[j + 1] = person[j];
                    person[j] = person[j + 1];
                }
            }
        }
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getSurname().length() < person[j + 1].getSurname().length()) {
                    Human clone = new Human();
                    clone = person[j + 1];
                    person[j + 1] = person[j];
                    person[j] = person[j + 1];
                }
            }
        }
        //переделать под Arraylist и уволить всех мужчин, женщинам поднять зп
        ArrayList changes = new ArrayList();
        changes.add(getHumans());
        for (int i = 0; i < changes.size(); i++) {
            if (person[i].getState() == "male") {
                changes.remove(i);
            } else person[i].setScale(person[i].getScale() + 200);

        }


    }

    public static Human[] getHumans() {
        Human h1 = new Human();
        h1.setName("Dima");
        h1.setSurname("Andry");
        h1.setState("male");
        h1.setScale(100);
        h1.setAge(16);
        h1.setHeight(1.74);
        h1.setWeight(65.0);
        Human h2 = new Human();
        h2.setName("Dima");
        h2.setSurname("Sid");
        h2.setState("male");
        h2.setScale(200);
        h2.setAge(16);
        h2.setHeight(1.65);
        h2.setWeight(50.0);
        Human h3 = new Human();
        h3.setName("Vova");
        h3.setSurname("Logvinenko");
        h3.setState("male");
        h3.setScale(300);
        h3.setAge(15);
        h3.setHeight(1.62);
        h3.setWeight(55.0);
        Human h4 = new Human();
        h4.setName("Danil");
        h4.setSurname("Pisarenko");
        h4.setState("male");
        h4.setScale(400);
        h4.setAge(17);
        h4.setHeight(1.80);
        h4.setWeight(75.0);
        Human h5 = new Human();
        h5.setName("Pavel");
        h5.setSurname("Karpenko");
        h5.setState("male");
        h5.setScale(500);
        h5.setAge(16);
        h5.setHeight(1.79);
        h5.setWeight(80.0);
        Human h6 = new Human();
        h6.setName("Valera");
        h6.setSurname("Bass");
        h6.setState("male");
        h6.setScale(600);
        h6.setAge(16);
        h6.setHeight(1.76);
        h6.setWeight(65.0);
        Human h7 = new Human();
        h7.setName("Marina");
        h7.setSurname("Tykhonenko");
        h7.setState("female");
        h7.setScale(700);
        h7.setAge(15);
        h7.setHeight(1.69);
        h7.setWeight(40.0);
        Human h8 = new Human();
        h8.setName("Nastya");
        h8.setSurname("Artemenko");
        h8.setState("female");
        h8.setScale(800);
        h8.setAge(15);
        h8.setHeight(1.58);
        h8.setWeight(40.0);
        Human h9 = new Human();
        h9.setName("Katya");
        h9.setSurname("Kiblitskaya");
        h9.setState("female");
        h9.setScale(900);
        h9.setAge(15);
        h9.setHeight(1.74);
        h9.setWeight(40.0);
        Human h10 = new Human();
        h10.setName("Liza");
        h10.setSurname("Gansevich");
        h10.setState("female");
        h10.setScale(1000);
        h10.setAge(16);
        h10.setHeight(1.71);
        h10.setWeight(50);
        return new Human[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};

    }


}
