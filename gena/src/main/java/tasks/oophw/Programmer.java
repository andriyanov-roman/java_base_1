package tasks.oophw;

/**
 * Created by sigen on 4/30/2015.
 */
public class Programmer extends Employee {

    private String language;

    Programmer(String name, String secondName, int salary, int age, String language) {
        super(name, secondName, salary, age );
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
