package HTask.Batellfild;

/**
 * Created by Евгений on 28.04.15.
 */
public class Motor  {
    private double volum;
    private String name;
    private String type;
    private int power;
    private Tank tank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
