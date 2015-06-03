package jballs;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class ScalingIcon extends ImageView{
    Timeline bouncer = new Timeline();
    public ScalingIcon(Image image){
        super(image);
        setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setScaleX(1.2);
                setScaleY(1.2);
            }
        });
        setOnMouseExited(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                setScaleX(1.0);
                setScaleY(1.0);
            }
        });
        bouncer.getKeyFrames().addAll(
                new KeyFrame(new Duration(0), new KeyValue(scaleXProperty(), 1)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.2)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.3)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.4)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.5)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.4)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.3)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.2)),
                new KeyFrame(new Duration(400), new KeyValue(scaleXProperty(), 1.1)),
                new KeyFrame(new Duration(0), new KeyValue(scaleYProperty(), 1)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.2)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.3)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.4)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.5)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.4)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.3)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.2)),
                new KeyFrame(new Duration(400), new KeyValue(scaleYProperty(), 1.1))
        );
        bouncer.setCycleCount(Animation.INDEFINITE);
        bouncer.play();
    }
}