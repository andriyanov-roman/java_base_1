package work.Arrays;

/**
 * Массивы очень сложные
 */

//
//
//
//Не законченно, получается переместить отрезок [a, b] в конец массива только на одну позицию.
//
//
//
//
//

public class HomeArr4 {
    public static void main(String[] args) {

        // int arr[] = {104, 86, 909, 10, 61, -32, 2, 198, 0, -188, 550, 99, -3, -154};
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//Переместить в конец массива все элементы, значения которых находится в отрезке [a,b]

        System.out.println();
        System.out.print("Два  поменяны: ");
        int a = 2;
        int b = 4;
        int buf;

        for (int i1 = b; i1 < arr.length - 1; i1++) {
            buf = arr[b];
            arr[b] = arr[b + 1];
            arr[b + 1] = buf;
            b--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
