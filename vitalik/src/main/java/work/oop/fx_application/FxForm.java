package work.oop.fx_application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.*;
import java.util.ArrayList;

/**
 *
 */
public class FxForm extends Application {
    private File file = new File("vitalik\\resources\\Fx.txt");
    private ArrayList<Employes> employes = new ArrayList<Employes>();
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("FX Application");
        GridPane grid = getPane();
        Scene scene = new Scene(grid, 330, 400);
        setComponets(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    private void setComponets (GridPane grid) throws IOException{
        Label labelAdd = new Label("Add new Employee:");
        labelAdd.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        grid.add(labelAdd, 0,  0);
        Label labelSave = new Label("Save  Employee:");
        labelSave.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
        grid.add(labelSave, 0, 7);

        Label labelName = new Label("Name:");
        grid.add(labelName, 0, 1);
        final TextField name = new TextField();
        grid.add(name, 1, 1);

        Label labelSecondName = new Label("Second Name:");
        grid.add(labelSecondName, 0, 2);
        final TextField secondName = new TextField();
        grid.add(secondName, 1, 2);

        Label salaryLabel = new Label("Salary:");
        grid.add(salaryLabel, 0, 3);
        final TextField salary = new TextField();
        grid.add(salary, 1, 3);

        Label ageLabel = new Label("Age:");
        grid.add(ageLabel, 0, 4);
        final TextField age = new TextField();
        grid.add(age, 1, 4);



        ToggleGroup group = new ToggleGroup();

        RadioButton rb1 = new RadioButton("no sorting");
        rb1.setToggleGroup(group);
        rb1.setSelected(true);
        grid.add(rb1, 0, 8);

        RadioButton rb2 = new RadioButton("sorting by salary");
        rb2.setToggleGroup(group);
        grid.add(rb2, 0, 9);

        RadioButton rb3 = new RadioButton("sort by age");
        rb3.setToggleGroup(group);
        grid.add(rb3, 0, 10);

        Button button = new Button("  Add  ");
        Button button1 = new Button("  Save   ");


        final FileWriter writer = new FileWriter(file, true);
        final Label info = new Label();
        info.setFont(Font.font("Tahoma", FontWeight.BLACK, 10));
        grid.add(info, 1, 5);
        final Label info2 = new Label();
        info2.setFont(Font.font("Tahoma", FontWeight.BLACK, 10));
        grid.add(info2, 1, 11);




        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                try {
                    if (!name.getText().isEmpty()
                            && !salary.getText().isEmpty()
                            && !age.getText().isEmpty()
                            && !secondName.getText().isEmpty()) {
                        Employes employee = new Employes();
                        employee.setName(name.getText());
                        employee.setSalary(Double.parseDouble(salary.getText()));
                        employee.setAge(Integer.parseInt(age.getText()));
                        employee.setSecondName(secondName.getText());
                        employes.add(employee);
                        info.setText("Employee Added");
                    } else {
                        info.setText("Employee not Added");
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });





button1.setOnAction(new EventHandler<ActionEvent>() {
    public void handle(ActionEvent event) {
        if (!name.getText().isEmpty()
                && !salary.getText().isEmpty()
                && !age.getText().isEmpty()
                && !secondName.getText().isEmpty()) {
            try {
                writerToFile(writer, name.getText(), secondName.getText(), salary.getText(), age.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
            info2.setText("Employee save");
    }
        else {
            info2.setText("Employee not save");
        }}
});

        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER_LEFT);
        hbBtn.getChildren().add(button);
        grid.add(button, 0, 5);
        hbBtn.getChildren().add(button1);
        button1.setAlignment(Pos.CENTER_LEFT);
        grid.add(button1, 0, 11);


    }
    private void writerToFile(FileWriter writer, String... args) throws IOException {
        for (int i = 0; i < args.length; i++) {
            writer.write(args[i] + " ");
        }
        writer.write('\n');
        writer.flush();
        writer.close();
    }
    private GridPane getPane() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        return grid;
    }
    public static void main(String[] args) {
        launch(args);
    }
}