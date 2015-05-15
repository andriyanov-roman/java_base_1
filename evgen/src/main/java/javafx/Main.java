package javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Евгений on 16.05.2015.
 */
public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Factory Application");
        Button button1 = new Button("Add employee");
        button1.setOnAction(e -> System.out.println("Employee added"));

        StackPane layout = new StackPane();
        layout.getChildren().addAll(button1);
        //layout.setAlignment(Pos.CENTER_LEFT);

        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
