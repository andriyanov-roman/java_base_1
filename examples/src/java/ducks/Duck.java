package ducks;

/**
 * Created by user on 5/12/2015.
 */
public abstract class Duck {
    private String color;
    private double weight;
    private IDoFly doFly;
    private IDoVoice doVoice;

    public IDoFly getDoFly() {
        return doFly;
    }

    public void setDoFly(IDoFly doFly) {
        this.doFly = doFly;
    }

    public IDoVoice getDoVoice() {
        return doVoice;
    }

    public void setDoVoice(IDoVoice doVoice) {
        this.doVoice = doVoice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
