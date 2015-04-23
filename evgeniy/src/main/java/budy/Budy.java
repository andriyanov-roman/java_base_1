package budy;

/**
 * Created by Евгений on 23.04.15.
 */
public class Budy {
    private String name;
    private String secondName;
    private int ads;
    private double weight;
    private double height;

    public String run(double height, double weight) {
        if (this.weight < weight && this.height > height) {
            return "non";
        } else if (this.weight > weight && this.height < height) {
            return "blablabla";
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}