package work.procedures.Arrays;

/**
 * Массивы среднее
 */
public class HomeArr2 {
    public static void main(String[] args) {

        int arr[] = {104, 86, 99, 10, 61, -32, 2, 198, 0, -188, 550, 99, -3, -154};
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//Вывести в консоль половину массива, среднеарифметическое которых является наибольшим

        int sum = 0;
        int sum2 = 0;
        int arm, arm2;
        int n = arr.length;
        int d = n / 2;
        for (int i = 0; i < d; i++) {
            sum += arr[i];
        }
        arm = sum / d;
        for (int i = d; i < arr.length; i++) {
            sum2 += arr[i];
        }
        arm2 = sum2 / d;
        System.out.println();
        System.out.print("Часть массива среднеарифметическое которых является наибольшим: ");
        if (arm > arm2)
            for (int i = 0; i < d; i++) {
                System.out.print(arr[i] + " ");
            }
        else
            for (int i = d; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
//Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве

        System.out.println();
        System.out.print("Индексы положительных чисел: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Сумма отрицательных чисел: ");
        int summa = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                summa += arr[i];
        }
        System.out.print(summa + " ");

//Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.

        System.out.println();
        System.out.print("Массив чисел до нуля: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0)
                break;
        }
//Поменять  местами два наибольших элемента одномерного массива с первым и последним

        System.out.println();
        System.out.print("Два наибольших элемента одномерного массива с первым и последним поменяны: ");
        int imax = 1;
        int imax2 = 1;
        int buf;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[imax]) {
                imax = i;
            }
        }
        buf = arr[imax];
        arr[imax] = arr[0];
        arr[0] = buf;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[imax2]) {
                imax2 = i;
            }
        }
        buf = arr[imax2];
        arr[imax2] = arr[arr.length - 1];
        arr[arr.length - 1] = buf;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива

        System.out.println();
        System.out.print("Массив чисел до минимального элемента: ");
        int imin = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[imin]) {
                imin = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == arr[imin - 1])
                break;
        }
    }
}
