package jfx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Pipin on 14.05.2015.
 */
public class Jfx extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First Fx application");
 // Scene scene = new Scene(getPane(), 300, 375);
        GridPane grid =getPane(); //layout tipe
        Scene scene = new Scene(grid, 300, 375);
        Label labelName = new Label("Name");
       // grid.add(labelName, 0 , 1);
        TextField name = new TextField();
       // grid.add(name, 1,1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
private GridPane getPane(){
    //tabl
    GridPane grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);  //interval mezhdu strokami gorizont
    grid.setVgap(10);  //vertikalmii promezhutok
    grid.setPadding(new Insets(25, 25, 25, 25)); //polya jnstupa ot stage
    return grid;
}

    public void startProgram(String[] args){
        launch();
    }


}
