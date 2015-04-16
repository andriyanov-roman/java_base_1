package ex.lsone;

/**
 * Created by user on 4/16/2015.
 */
public class SamplesArray {
    public static void main(String[] args) {
        int[] array = {12, 5, 24, 6};
        int[][] twoArray = {
                {1, 4, 2, 5, 7},
                {1, 4, 2, 5, 4},
                {56, 23, 6, 23, 3}
        };
        swap(array);
    }

    public static void swap(int[] array) {
        int max = array[0];
        int min = array[0];
        int minI = 0;
        int maxI = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxI = i;
            } else if(min > array[i]) {
                min = array[i];
                minI = i;
            }
        }
        int temp = array[maxI];
        array[maxI] = array[minI];
        array[minI] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
