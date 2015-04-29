package exampl.bfGame;

/**
 * Created by ������� on 28.04.2015.
 */
public class Cannon {
    private int caliber;
    private int lenght;

    public int getCaliber() {
        return caliber;
    }

    public void setCaliber(int caliber) {
        this.caliber = caliber;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int damage() {
        if (lenght > 5 && caliber > 100){
            return 100;
        }
        return 0;
    }
}
