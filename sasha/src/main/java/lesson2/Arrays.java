package lesson2;

/**
 * Created by Андрей on 09.04.2015.
 */
public class Arrays {
    public static void main(String[] args) {
        int[] a = {10, 2, 30, 4, 5, 75, 46, 1};
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + "+");
        }
        int s = 0;
        for (int b = 0; b < a.length; b++) {
            s = s + a[b];
        }
        System.out.println("=" + s);

        for (int b = a.length - 1; b >= 0; b--) {
            System.out.println(a[b]);
        }
        int max = a[0];
        int min = a[0];
        for (int b = 0; b < a.length; b++) {
            if (a[b] < min) {
                min = a[b];
            } else if (a[b] > max) {
                max = a[b];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
