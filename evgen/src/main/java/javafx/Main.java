package javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(final Stage scene) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        scene.setTitle("Hello World");
        final Group root = new Group();

        final ImageView dock = new ImageView(new Image("images/dock1.png"));

        dock.setTranslateX(100);
        dock.setTranslateY(200);
        dock.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton() == MouseButton.PRIMARY){
                    dock.setImage(new Image("/images/dock1.png"));
                }else{
                    dock.setImage(new Image("/images/dock2.png"));
                }
            }
        });
        root.getChildren().add(dock);
        
        final String[] icons = {"soccer_ball.png", "tennis_ball.png", "bascket_ball.png"};

        HBox box = new HBox(20);
        for (int i = 0; i < icons.length; i++) {
            final BouncingIcon icon = new BouncingIcon(new Image("icons/" + icons[i]));
            icon.setEffect(new DropShadow());
            box.getChildren().add(icon);
        }
        final ScalingIcon heart = new ScalingIcon(new Image("/images/heart.png"));
        heart.setTranslateX(-200);
        heart.setTranslateY(-180);
        box.getChildren().add(heart);
        box.setTranslateX(145);
        box.setTranslateY(200);
        root.getChildren().add(box);
        scene.setScene(new Scene(root, 520, 300));
        scene.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
