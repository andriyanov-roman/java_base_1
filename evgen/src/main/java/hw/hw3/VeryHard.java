package hw.hw3;

/**
 * Created by Евгений on 02.05.2015.
 */
public class VeryHard {
    public static void main(String[] args) {

//Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b]

            int[] arr = {6, 8, 2, 7, 9, 1, 3, 4, 7, 0};
            int a, b, z, i, k, p, r;

            a = 6;
            b = 8;
            p = 9;

            System.out.print("Заданный массив: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

            for (r = 0; r < p; r++) {
                for (i = 0; i < p; i++) {
                    for (k = a; k <= b; k++) {
                        if (arr[i] == k) {
                            z = arr[p];
                            arr[p] = arr[i];
                            arr[i] = z;
                            p--;
                        }
                    }
                }
            }

            System.out.print("Новый массив: ");
            for (i = 0; i < 10; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
