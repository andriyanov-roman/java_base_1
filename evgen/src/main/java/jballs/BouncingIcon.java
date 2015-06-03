package jballs;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class BouncingIcon extends ImageView{
    boolean mouseIn = false;
    Timeline bouncer = new Timeline();
    public BouncingIcon(Image image){
        super(image);
        setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mouseIn = true;
                bouncer.play();
            }
        });
        setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                mouseIn = false;
            }
        });
        bouncer.getKeyFrames().addAll(
                new KeyFrame(new Duration(0), new KeyValue(translateYProperty(), 0)),
                new KeyFrame(new Duration(300), new KeyValue(translateYProperty(), -70)),
                new KeyFrame(new Duration(600), new KeyValue(translateYProperty(), 0))
        );
        /*bouncer.setCycleCount(Animation.INDEFINITE);
        bouncer.play();*/
        bouncer.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (mouseIn){
                    bouncer.play();
                }
            }
        });
    }
}
