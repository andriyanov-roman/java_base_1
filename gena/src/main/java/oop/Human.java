package oop;

/**
 * Created by sigen on 4/21/2015.
 */
public class Human {
    public int age;
    public String secondName;
    public String name;
    public double weight;
    public double height;


    public void walking() {
        if (age <= 2) {
            System.out.print(" Ползает\n");
        }
        if (age > 2 && age <= 20) {
            System.out.print(" Быстро ходит\n");
        }
        if (age > 20 && age <= 50) {
            System.out.print(" Нормально ходит \n");
        }
        if (age > 50 && age <= 80) {
            System.out.print(" Медленно ходит\n");
        }
        if (age > 80 && age <= 120) {
            System.out.print(" Вероятно не ходи\n");
        }
        if (age > 120) {
            System.out.print(" Лежит, но скоро пойдет \n");
        }


    }

    public double getArgNum(String parametr){
        double box = 0;
        if (parametr.equals("age")){
            box = age;
        }
        if (parametr.equals("height")){
            box = height;
        }
        if (parametr.equals("weight")){
            box = weight;
        }
        return box;
    }
    public String getArgString(String parametr){
        String box = "";
        if (parametr.equals("name")){
            box = name;
        }
        if (parametr.equals("secondName")){
            box = secondName;
        }

        return box;
    }


}
