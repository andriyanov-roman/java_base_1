package oop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


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
        swap(h);
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
            System.out.println(humans[i].secondName + " " + humans[i].name
                    + " " + humans[i].age + " " + humans[i].weight);
        }
    }
    public static void tellWalkingType(Human[] humans){
        for (int i = 0; i < humans.length; i++) {
            System.out.print(humans[i].name + " "+ humans[i].secondName);
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

    public static void swap(Human[] h){
        int mini = 0;
        int maxi = 0;
        Human max = h[0];
        Human min = h[0];
        for (int i = 0; i < h.length; i++) {
            if(h[i].secondName.length()>max.secondName.length()){
                max = h[i];
                maxi = i;
            }
            if(h[i].secondName.length()<min.secondName.length()){
                min = h[i];
                mini = i;
            }
        }
        Human t = max;
        h[maxi] = min;
        h[mini] = t;
        showHumans(h);
    }



    public static Human [] getHumans(){
        Human human1 = new Human();
        human1.secondName = "Sipakov";
        human1.name = "Gennadiy";
        human1.age = 20;
        human1.weight = 97;
        human1.height = 1.84;

        Human human2 = new Human();
        human2.secondName = "Shevchuk";
        human2.name = "Dmitriy";
        human2.age = 20;
        human2.weight = 92;
        human2.height = 1.92;

        Human human3 = new Human();
        human3.secondName = "Koval";
        human3.name = "Dmitriy";
        human3.age = 20;
        human3.weight = 75;
        human3.height = 1.76;

        Human human4 = new Human();
        human4.secondName = "Starodub";
        human4.name = "Aleksandr";
        human4.age = 2;
        human4.weight = 68;
        human4.height = 1.69;

        Human human5 = new Human();
        human5.secondName = "Sipakova";
        human5.name = "Ekaterina";
        human5.age = 17;
        human5.weight = 63;
        human5.height = 1.72;

        Human human6 = new Human();
        human6.secondName = "Sipakov";
        human6.name = "Aleksandr";
        human6.age = 49;
        human6.weight = 95;
        human6.height = 1.80;

        Human human7 = new Human();
        human7.secondName = "Sus";
        human7.name = "Konstantin";
        human7.age = 20;
        human7.weight = 76;
        human7.height = 1.78;

        Human human8 = new Human();
        human8.secondName = "Vishnivsky";
        human8.name = "Roman";
        human8.age = 21;
        human8.weight = 86;
        human8.height = 1.8;

        Human human9 = new Human();
        human9.secondName = "Lenin";
        human9.name = "Vladimir";
        human9.age = 145;
        human9.weight = 40;
        human9.height = 1.65;

        Human human10 = new Human();
        human10.secondName = "King";
        human10.name = "Stephen";
        human10.age = 67;
        human10.weight = 92;
        human10.height = 1.93;
        return new Human[]{human1, human2, human3, human4,
                human5, human6, human7, human8, human9, human10};
    }
}
