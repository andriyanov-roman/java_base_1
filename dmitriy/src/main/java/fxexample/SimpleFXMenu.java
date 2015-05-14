package fxexample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Дима on 14.05.2015.
 */
public class SimpleFXMenu extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First FX Application");
        GridPane grid = getPane();
        Scene scene = new Scene(grid, 300, 750);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane getPane() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        return grid;
    }

    public void startProgramme(String[] args) {
        launch(args);
    }
}
