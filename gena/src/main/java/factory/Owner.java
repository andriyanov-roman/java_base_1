package factory;

/**
 * Created by sigen on 5/5/2015.
 */
public class Owner {
    private String name;
    private String secondName;
    private int id;

    Owner(String name, String secondName, int id){
        this.id = id;
        this.name = name;
        this.secondName = secondName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
