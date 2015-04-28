package oop;

/**
 * Created by sigen on 4/21/2015.
 */
public class Human {
    private int age;
    private String secondName;
    private String name;
    private double weight;
    private double height;


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
    public int getAge(){ return age;}
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){return  name;   }
    public void setName(String name){
        this.name = name;
    }

    public String getSecondName(){ return secondName;}


    public void  setSecondName(String secondName){
        this.secondName = secondName;
    }

    public double getHeight(){return height;    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){ return weight;   }
    public void setWeight(double weight){
        this.weight = weight;
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
