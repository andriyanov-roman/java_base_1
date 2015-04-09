package ex.lsone;

/**
 * Created by user on 4/9/2015.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        long[] d = {a, b, c, (int) 8.9, 9};
        boolean[] booleans = {true, false, true, false};
        int[] aRRay = {1, 33, 2, 4, 4, 6, 6, 4, 3, 5, 6, 7, 8,};
        System.out.println(aRRay[1]);
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 15;
        array[2] = 51;
        array[3] = 115;
        array[4] = 151;
        System.out.println(array[0] + array[1] + array[2] + array[3] + array[4]);
        int sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
