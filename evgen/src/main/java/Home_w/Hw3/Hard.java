package Home_w.Hw3;

/**
 * Created by Евгений on 14.04.2015.
 */
/*
Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве
Вывести в консоль половину массива в которой находиться наименьшее число массива
*/
public class Hard {
    public static void main(String[] args) {

        int[] arr = {-2, 20, -6, -1, -12, -16, -23, 3, 4, 5, 6};

        System.out.print("Заданный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве
        System.out.print("Минимальное  число в массиве равно: ");
        int min = arr[0];
        int max = arr[0];
        int minIndex = 0;
        int maxIndex = 0;
        int buf = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.print(min);
        System.out.println();
        System.out.print("Максимальное число в массиве равно: ");
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.print(max);
        System.out.println();

        int sum = 0;

        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Сумма всех чисел находящихся между минимальным и максимальным числом в массиве равна: " + sum);
        } else {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum = sum + arr[i];
            }
            System.out.println("Сумма всех чисел находящихся между максимальным и минимальным числом в массиве равна: " + sum);
        }

        //Вывести в консоль половину массива в которой находиться наименьшее число массива
        float a = minIndex;

        if (a < (float) arr.length / 2 && a + 0.5 != (float) arr.length / 2) {
            System.out.print("Наименьшее число массива находиться в первой половине массива, которая имеет вид: ");
            for (int i = 0; i < arr.length / 2; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        if (a > (float) arr.length / 2) {
            System.out.print("Наименьшее число массива находиться во второй половине массива, которая имеет вид: ");
            for (int i = arr.length / 2; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Наименьшее число массива находиться посередине массива");
        }

    }
}
