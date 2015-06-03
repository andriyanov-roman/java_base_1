package jballs;

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

import java.io.File;
import java.net.MalformedURLException;

public class Main extends Application {
    @Override
    public void start(final Stage scene) throws Exception{
        scene.setTitle("Jumping Balls");
        final Group root = new Group();
        final File dock1 = new File("./evgen/src/main/java/jballs/images/dock1.png");
        final File dock2 = new File("./evgen/src/main/java/jballs/images/dock2.png");
        final File heart = new File("./evgen/src/main/java/jballs/images/heart.png");
        final ImageView dock = new ImageView(new Image(dock1.toURI().toURL().toString()));
        dock.setTranslateX(100);
        dock.setTranslateY(200);
        dock.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton() == MouseButton.PRIMARY){
                    try {
                        dock.setImage(new Image(dock1.toURI().toURL().toString()));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        dock.setImage(new Image(dock2.toURI().toURL().toString()));
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        root.getChildren().add(dock);
        final File[] balls = {new File("./evgen/src/main/java/jballs/icons/soccer_ball.png"),
                              new File("./evgen/src/main/java/jballs/icons/tennis_ball.png"),
                              new File("./evgen/src/main/java/jballs/icons/bascket_ball.png")};
        HBox box = new HBox(20);
        for (File icons : balls) {
            final BouncingIcon icon = new BouncingIcon(new Image(icons.toURI().toURL().toString()));
            icon.setEffect(new DropShadow());
            box.getChildren().add(icon);
        }
        final ScalingIcon heartBeats = new ScalingIcon(new Image(heart.toURI().toURL().toString()));
        heartBeats.setTranslateX(-200);
        heartBeats.setTranslateY(-180);
        box.getChildren().add(heartBeats);
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
