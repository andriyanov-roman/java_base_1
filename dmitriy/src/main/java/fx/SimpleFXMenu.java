package fx;

import Homework_7_oop_tasks.Human;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Дима on 17.05.2015.
 */
public class SimpleFXMenu extends Application {
    private File file = new File("fx.txt");
    private ArrayList<Employee> employees = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First FX Application");
        GridPane grid = getPane();
        Scene scene = new Scene(grid, 400, 375);
        setComponets(grid);


        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void writerToSortFile(FileWriter writer, String... args) throws IOException {
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).getSalary() < employees.get(j + 1).getSalary()) {
                    Employee clone;
                    clone = employees.get(j + 1);
                    employees.set(j + 1, employees.get(j));
                    employees.set(j, clone);
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            writer.write(args[i] + " ");
        }
        writer.write('\n');
        writer.flush();
        writer.close();
    }

    private void setComponets(GridPane grid) throws IOException {
        Label labelHello = new Label("Add new Employee:");
        labelHello.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        grid.add(labelHello, 0, 0, 2, 1);

        Label labelName = new Label("Name:");
        grid.add(labelName, 0, 1);
        TextField name = new TextField();
        grid.add(name, 1, 1);

        Label labelSecondName = new Label("Second Name:");
        grid.add(labelSecondName, 0, 2);
        TextField secondName = new TextField();
        grid.add(secondName, 1, 2);

        Label salaryLabel = new Label("Salary:");
        grid.add(salaryLabel, 0, 3);
        TextField salary = new TextField();
        grid.add(salary, 1, 3);
        Button button = new Button("Add Employee");
        Button button1 = new Button("SortFile");
        final FileWriter writer = new FileWriter(file);
        Label info = new Label();
        info.setFont(Font.font("Tahoma", FontWeight.BLACK, 10));
        grid.add(info, 0, 6);
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
                    if (!name.getText().isEmpty()
                            && !salary.getText().isEmpty()
                            && !secondName.getText().isEmpty()) {
                        Employee employee = new Employee();
                        employee.setName(name.getText());
                        employee.setSalary(Double.parseDouble(salary.getText()));
                        employee.setSecondName(secondName.getText());
                        employees.add(employee);
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
            @Override
            public void handle(ActionEvent event) {
                try {
                    writerToSortFile(writer, name.getText(), secondName.getText(), salary.getText());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.CENTER);
        hbBtn.getChildren().add(button);
        hbBtn.getChildren().add(button1);
        grid.add(hbBtn, 1, 4);
    }

    private GridPane getPane() {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        return grid;
    }

    public void startProgram(String[] args) {
        launch(args);
    }
}
