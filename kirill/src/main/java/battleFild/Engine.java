package battleFild;

/**
 * Created by Pipin on 28.04.2015.
 */
public class Engine {
    private int power;
    private Tank tank;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    private String type;
    private double volume;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
