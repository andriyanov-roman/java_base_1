package tasks.oophw;

/**
 * Created by sigen on 4/30/2015.
 */
public class Admin extends Employee {


    private String platform;

    Admin(String name, String secondName, int salary, int age, String platform) {
        super(name, secondName, salary, age);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
