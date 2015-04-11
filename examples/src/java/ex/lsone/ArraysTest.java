package ex.lsone;

/**
 * Created by user on 4/9/2015.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] array = {-1, -33, -2, -4, -4, -6, -6, -4, -3, -5, -6, -7, -8};
        //Просто вывести массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Найти сумму массива
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        System.out.println(sum);
        //Вывести массив в обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            } else if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
