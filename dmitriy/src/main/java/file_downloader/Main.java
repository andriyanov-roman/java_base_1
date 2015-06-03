package file_downloader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Дима on 30.05.2015.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login Form.fxml"));
        primaryStage.setTitle("Enter or go away");
        primaryStage.setScene(new Scene(root, 300, 350));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
