/**
 * Created by Евгений on 07.04.15.
 */
public class Std2v2 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=999) {
            if(i>50 || i<100) {
                System.out.println(i);
            }
            i+=3;

        }
        for (int j = 0; j <=999  ; j+=6) {
                if(j>50 || j<100) {
                    System.out.println(j);
                }

        }

    }
}
