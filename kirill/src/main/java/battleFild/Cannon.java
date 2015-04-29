package battleFild;

/**
 * Created by Pipin on 28.04.2015.
 */
public class Cannon {
    private int caliber;
    private int length;

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int damage(){
        if(this.length>5 && this.caliber>120){
            return 100;
        }
        return 0;
    }
}
