package tasks.oophw;

/**
 * Created by sigen on 4/30/2015.
 */
public class Manager extends Employee {
    private String projectName;


    Manager(String name, String secondName, int salary, int age, String projectName) {

        super(name, secondName, salary, age);
        this.projectName = projectName;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
