package HTask.Batellfild;

/**
 * Created by Åâãåíèé on 28.04.15.
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

        public int damage () {
        if(length > 5 && caliber > 120){
            return 100;
        }
            return 0;
    }
}
