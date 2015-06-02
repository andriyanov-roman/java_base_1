//package sample;
//
//
//import javafx.animation.Animation;
//import javafx.animation.PathTransition;
//import javafx.animation.PathTransition.OrientationType;
//import javafx.animation.SequentialTransition;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.MoveTo;
//import javafx.scene.shape.Path;
//import javafx.scene.shape.VLineTo;
//import javafx.util.Duration;
//
//public class Controller {
//    @FXML
//    public static Circle circle;
//
//    public Controller() {
//    }
//
//    public void jump(ActionEvent e) throws Exception {
//        PathTransition pathTo = this.getPathTransitionFirst(circle);
//        PathTransition pathCont = this.getPathTransitionBack(circle);
//        SequentialTransition sequentialTransition = new SequentialTransition();
//        sequentialTransition.getChildren().addAll(new Animation[]{pathTo, this.getPathTransitionSecond(circle), this.getPathTransitionThird(circle), pathCont});
//        sequentialTransition.setDelay(Duration.ZERO);
//        sequentialTransition.setCycleCount(-1);
//        sequentialTransition.setAutoReverse(true);
//        sequentialTransition.play();
//    }
//
//    public PathTransition getPathTransitionFirst(Circle circle) {
//        Path path = new Path();
//        path.getElements().add(new MoveTo(circle.getCenterX(), circle.getCenterY()));
//        path.getElements().add(new VLineTo(circle.getCenterY() - 150.0D));
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setPath(path);
//        pathTransition.setNode(circle);
//        pathTransition.setOrientation(OrientationType.NONE);
//        pathTransition.setCycleCount(1);
//        pathTransition.setDuration(Duration.millis(250.0D));
//        pathTransition.setAutoReverse(false);
//        return pathTransition;
//    }
//
//    public PathTransition getPathTransitionSecond(Circle circle) {
//        Path path = new Path();
//        path.getElements().add(new MoveTo(circle.getCenterX(), circle.getCenterY() - 150.0D));
//        path.getElements().add(new VLineTo(circle.getCenterY() - 180.0D));
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setPath(path);
//        pathTransition.setNode(circle);
//        pathTransition.setOrientation(OrientationType.NONE);
//        pathTransition.setCycleCount(1);
//        pathTransition.setDuration(Duration.millis(75.0D));
//        pathTransition.setAutoReverse(false);
//        return pathTransition;
//    }
//
//    public PathTransition getPathTransitionThird(Circle circle) {
//        Path path = new Path();
//        path.getElements().add(new MoveTo(circle.getCenterX(), circle.getCenterY() - 180.0D));
//        path.getElements().add(new VLineTo(circle.getCenterY() - 200.0D));
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setPath(path);
//        pathTransition.setNode(circle);
//        pathTransition.setOrientation(OrientationType.NONE);
//        pathTransition.setCycleCount(1);
//        pathTransition.setDuration(Duration.millis(100.0D));
//        pathTransition.setAutoReverse(false);
//        return pathTransition;
//    }
//
//    public PathTransition getPathTransitionBack(Circle circle) {
//        Path path = new Path();
//        path.getElements().add(new MoveTo(circle.getCenterX(), circle.getCenterY() - 200.0D));
//        path.getElements().add(new VLineTo(circle.getCenterY() - 210.0D));
//        PathTransition pathTransition = new PathTransition();
//        pathTransition.setPath(path);
//        pathTransition.setNode(circle);
//        pathTransition.setOrientation(OrientationType.NONE);
//        pathTransition.setCycleCount(1);
//        pathTransition.setDuration(Duration.millis(120.0D));
//        pathTransition.setAutoReverse(false);
//        return pathTransition;
//    }
//}
