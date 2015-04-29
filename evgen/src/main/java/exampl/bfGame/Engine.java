package exampl.bfGame;

/**
 * Created by ������� on 28.04.2015.
 */
public class Engine {
    private double volume;
    private int power;
    private String type;
    private Tank tank;

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setType(String type) {
        this.type = type;
    }
}
