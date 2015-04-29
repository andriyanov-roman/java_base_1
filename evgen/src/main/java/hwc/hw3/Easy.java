package hwc.hw3;

/**
 * Created by Евгений on 10.04.2015.
 */

/* Минимум
Вывести в консоль все парные числа одномерного массива
Вывести все числа одномерного массива в обратном порядке
Вывести первую и вторую половину одномерного массива
Вывести первую и вторую половину одномерного массива в обратном порядке
Найти сумму все элементов в массиве
Найти среднеарифметическое всех чисел массива
Найти минимальное и максимальное число в массиве
Заменить все отрицательные числа в массиве на 0
Подсчитать одинаковые числа в одномерном массиве
Поменять минимальное и максимальное числа в массиве местами
Инвертировать массив
*/

public class Easy {
    public static void main(String[] args) {

        int[] arr = {7, 1, -3, -17, -8, -4};
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Вывести в консоль все парные числа одномерного массива
        System.out.print("Парные числа одномерного массива: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Вывести все числа одномерного массива в обратном порядке
        System.out.print("Все числа одномерного массива в обратном порядке: ");
        for (int a = arr.length - 1; a < arr.length && a >= 0; a--) {
            System.out.print(arr[a] + " ");

        }
        System.out.println();

        //Вывести первую и вторую половину одномерного массива
        System.out.print("Первая половина одномерного массива: ");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая половина одномерного массива: ");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Вывести первую и вторую половину одномерного массива в обратном порядке
        System.out.print("Первая половина одномерного массива в обратном порядке: ");
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая половина одномерного массива в обратном порядке: ");
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Найти сумму все элементов в массиве
        System.out.print("Сумма всех элементов в массиве равна: ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

        //Найти среднеарифметическое всех чисел массива
        System.out.print("Среднеарифметическое всех чисел массива равно: ");
        float arMean;
        arMean = (float) sum / arr.length;
        System.out.print(arMean);
        System.out.println();

        //Найти минимальное и максимальное число в массиве
        System.out.print("Минимальное  число в массиве равно: ");
        int min = arr[0];
        int max = arr[0];
        int minChange = 0;
        int maxChange = 0;
        int buf = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minChange = i;
            }
        }
        System.out.print(min);
        System.out.println();
        System.out.print("Максимальное число в массиве равно: ");
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxChange = i;
            }
        }
        System.out.print(max);
        System.out.println();

        System.out.print("Поменять минимальное и максимальное числа в массиве местами: ");
        buf = arr[maxChange];
        arr[maxChange] = arr[minChange];
        arr[minChange] = buf;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Заменить все отрицательные числа в массиве на 0
        System.out.print("Замена отрицательных чисел на ноль: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int sum2 = 0;
        //Подсчитать одинаковые числа в одномерном массиве
        System.out.print("Подсчитать одинаковые числа в одномерном массиве: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sum2 = sum2 + 1;
                }
            }
        }
        System.out.print(sum2);
        System.out.println();

        //Инвертировать массив(непонял каким образом провести инверсию каждого элемента массива, потому просто поменял значение на противоположное )
        System.out.print("Инвертированный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * -1;
            System.out.print(arr[i] + " ");
        }
    }
}