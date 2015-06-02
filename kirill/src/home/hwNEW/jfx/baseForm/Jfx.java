package jfx.baseForm;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class Jfx {

    public Label info;
    public String getNameE() {
        return nameE.getText();
    }

    public String getSecondEName() {
        return secondEName.getText();
    }

    public String getSalaryE() {
        return salaryE.getText();
    }

    @FXML
    TextField nameE;
    @FXML
    TextField secondEName;
    @FXML
    TextField salaryE;


     private File file = new File("C:\\java_base_1\\kirill\\src\\home\\hwNEW\\jfx\\Data");
     private ArrayList<Employee> employees = new ArrayList<>();

    public void AddtoList() throws IOException {
        try {
            if(!getNameE().isEmpty()
                    && !getSalaryE().isEmpty()
                    && !getSecondEName().isEmpty()) {
                Employee employee = new Employee();
                employee.setName(getNameE());
                employee.setSalary(Double.parseDouble(getSalaryE()));
                employee.setSecondName(getSecondEName());
                employees.add(employee);
                info.setText("Employee Added");
                nameE.clear();
                salaryE.clear();
                secondEName.clear();
            } else {
                info.setText("Employee not Added");

            }
        } catch (Exception e1) {
            info.setText("Salary is not a String! Try again!");
        }
    }

   public void writerToFile() throws IOException {
        Collections.sort(employees);
        final FileWriter writer = new FileWriter(file, true);
        try {
            if(!employees.isEmpty()) {
                for (int i = 0; i < employees.size(); i++) {
                    writer.write(employees.get(i).getName() + " "+employees.get(i).getSecondName()+" "+employees.get(i).getSalary()+'\n');
                }
                writer.write('\n');
                writer.flush();
                writer.close();
                info.setText("Wrote");
            }
            else {
                info.setText("Please fill the form!"); }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}




