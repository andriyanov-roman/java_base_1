package hw.hw1;

/**
 * Created by Евгений on 02.05.2015.
 */
public class MaxVar {
    public static void main(String[] args)
    {
        int x = 3;
        int y = -7;
        int z = 6;

        if (x > y && x > z) {
            System.out.println("The larbyte i = a;gest naumber is X! Value =" + x);
        } else if (y > x && y > z) {
            System.out.println("The largest naumber is Y! Value =" + y);
        } else if (z > x && z > y) {
            System.out.println("The largest naumber is Z! Value =" + " " + z + ";");
        } else {
            System.out.println("Error");
        }
    }
}
