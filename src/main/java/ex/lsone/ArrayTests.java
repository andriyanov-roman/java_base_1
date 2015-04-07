package ex.lsone;

/**
 * Created by user on 4/7/2015.
 */
public class ArrayTests {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 999) {
            if (i > 50 || i < 100) {
                System.out.println(i);
            }
            i += 3;
        }
        for (int j = 0; j <= 999; j += 3) {
            if (j > 50 || j < 100) {
                System.out.println(j);
            }
        }
        int j = 0;
        do {
            System.out.println(j);
        }while (j != 0);
    }
}
