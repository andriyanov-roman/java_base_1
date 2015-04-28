package oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.org.mozilla.javascript.internal.ast.ArrayLiteral;

import java.util.*;


/**
 * Created by sigen on 4/21/2015.
 */
public class Main extends  Application {
    public static void main(String[] args) {

        Human[] h = getHumans();
        //tellWalkingType(h);
        //showHumans(h);
        //sortHumanByNumeric(h, "age");
        //sortHumanByString(h, "secondName");
        //swap(h);
        ArrayList<Human> human = new ArrayList<Human>(Arrays.asList(h));
        ArrayList<Human> human1 = human;
        showListOfHuman(human1);
        deleteFromList(3, 5, human1);
        showListOfHuman(human1);
    }
    @Override
    public void start(Stage stage) throws Exception{
        String fxmlFile = "/fxml/hello.fxml";
        FXMLLoader loader = new FXMLLoader();
        Parent root = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));
        stage.setTitle("JavaFX and Maven");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void showHumans(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getSecondName() + " " + humans[i].getName()
                    + " " + humans[i].getAge() + " " + humans[i].getWeight());
        }
    }
    public static void tellWalkingType(Human[] humans){
        for (int i = 0; i < humans.length; i++) {
            System.out.print(humans[i].getName() + " "+ humans[i].getSecondName());
            humans[i].walking();
        }
    }

    public static void sortHumanByNumeric(Human[] human, String parameter){
        for (int i = 0; i < human.length; i++) {
            for (int j = 0; j < human.length-i-1; j++) {
                if (human[j].getArgNum(parameter) > human[j+1].getArgNum(parameter)){
                    Human t = human[j];
                    human[j] = human[j+1];
                    human[j+1] = t;
                }
            }
        }
        System.out.println("\nSorting human by " + parameter);
        showHumans(human);
    }

    public static void sortHumanByString(Human[] human, String parameter){
        for (int i = 0; i < human.length; i++) {
            for (int j = 0; j < human.length-i-1; j++) {
                if (human[j].getArgString(parameter).length() > human[j+1].getArgString(parameter).length()){
                    Human t = human[j];
                    human[j] = human[j+1];
                    human[j+1] = t;
                }
            }
        }
        System.out.println("\nSorting human by " + parameter);
        showHumans(human);
    }

    public static void showListOfHuman(List<Human> list){
        for(Human elem : list){
            System.out.printf(elem.getName()+" "+ elem.getSecondName()+", ");
        }
        System.out.println();
    }

    public static void swap(Human[] h){
        int mini = 0;
        int maxi = 0;
        Human max = h[0];
        Human min = h[0];
        for (int i = 0; i < h.length; i++) {
            if(h[i].getSecondName().length()>max.getSecondName().length()){
                max = h[i];
                maxi = i;
            }
            if(h[i].getSecondName().length()<min.getSecondName().length()){
                min = h[i];
                mini = i;
            }
        }
        Human t = max;
        h[maxi] = min;
        h[mini] = t;
        showHumans(h);
    }


    public static void deleteFromList(int beginInd, int endInd, ArrayList<Human> list){
        ListIterator<Human> it = list.listIterator(beginInd);
        for (int i = 0; i <endInd-beginInd+1 ; i++) {
            Human tmp = it.next();
            it.remove();


        }

    }

    public static Human [] getHumans(){
        Human human1 = new Human();
        human1.setSecondName("Sipakov");
        human1.setName("Gennadiy");
        human1.setAge(20);
        human1.setWeight(97);
        human1.setHeight(1.84);

        Human human2 = new Human();
        human2.setSecondName("Shevchuk");
        human2.setName("Dmitriy");
        human2.setAge(20);
        human2.setWeight(92);
        human2.setHeight(1.92);

        Human human3 = new Human();
        human3.setSecondName("Koval");
        human3.setName("Dmitriy");
        human3.setAge(20);
        human3.setWeight(75);
        human3.setHeight(1.76);

        Human human4 = new Human();
        human4.setSecondName("Starodub");
        human4.setName("Aleksandr");
        human4.setAge(2);
        human4.setWeight(68);
        human4.setHeight(1.69);

        Human human5 = new Human();
        human5.setSecondName("Sipakova");
        human5.setName("Ekaterina");
        human5.setAge(17);
        human5.setWeight(63);
        human5.setHeight(1.72);

        Human human6 = new Human();
        human6.setSecondName("Sipakov");
        human6.setName("Aleksandr");
        human6.setAge(49);
        human6.setWeight(95);
        human6.setHeight(1.80);

        Human human7 = new Human();
        human7.setSecondName("Sus");
        human7.setName("Konstantin");
        human7.setAge(20);
        human7.setWeight(76);
        human7.setHeight(1.78);

        Human human8 = new Human();
        human8.setSecondName("Vishnivsky");
        human8.setName("Roman");
        human8.setAge(21);
        human8.setWeight(86);
        human8.setHeight(1.86);

        Human human9 = new Human();
        human9.setSecondName("Lenin");
        human9.setName("Vladimir");
        human9.setAge(145);
        human9.setWeight(40);
        human9.setHeight(1.65);

        Human human10 = new Human();
        human10.setSecondName("King");
        human10.setName("Stephen");
        human10.setAge(67);
        human10.setWeight(92);
        human10.setHeight(1.93);
        return new Human[]{human1, human2, human3, human4,
                human5, human6, human7, human8, human9, human10};
    }
}
