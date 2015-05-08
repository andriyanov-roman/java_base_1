package work.procedures.Arrays;

/**
 * Массивы минимум
 */
public class HomeArr {
    public static void main(String[] args) {

        int arr[] = {104, 86, 99, 74, 61, -32, 2, 198, 4, 8, 55, 99, -3, -154};
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//Вывести в консоль все парные числа одномерного массива

        System.out.println();
        System.out.print("Парные числа одномерного массива: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                System.out.print(arr[i] + " ");
        }

//Вывести все числа одномерного массива в обратном порядке

        int k = arr.length - 1;
        System.out.println();
        System.out.print("Массив в обратном порядке: ");

        for (int i = k; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

//Вывести первую и вторую половину одномерного массива

        int n = arr.length;
        int d = n / 2;
        System.out.println();
        System.out.print("Перевая часть массива: ");
        for (int i = 0; i < d; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая часть масива: ");

        for (int i = d; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

//Вывести первую и вторую половину одномерного массива в обратном порядке

        System.out.println();
        System.out.print("Перевая часть массива в обратном порядке: ");
        for (int i = d - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая часть масива в обратном порядке: ");

        for (int i = k; i >= d; i--) {
            System.out.print(arr[i] + " ");
        }

//Найти сумму все элементов в массиве

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println();
        System.out.print("Сумма всех элементов в массиве равна: " + sum);

//Найти среднеарифметическое всех чисел массива

        int arm = 0;
        arm = sum / arr.length;
        System.out.println();
        System.out.print("Среднеарифметическое всех чисел массива: " + arm);
        System.out.println();

//Найти минимальное и максимальное число в массиве

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            else if (min > arr[i])
                min = arr[i];
        }
        System.out.print("Mаксимальное число массива: " + max);
        System.out.println();
        System.out.print("Минимальное число массива: " + min);
        System.out.println();

//Заменить все отрицательные числа в массиве на 0

        int arr2[] = {104, 86, 99, 74, 61, -32, 2, 198, 4, 8, 55, 99, -3, -154};
        System.out.print("Заменены все отрицательные числа в массиве на 0: ");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0)
                arr2[i] = 0;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

//Подсчитать одинаковые числа в одномерном массиве

        int iden = 0;
        int med = 1;
        for (int i2 = 0; i2 < arr.length; i2++) {
            for (int j = med; j < arr.length; j++) {
                if (arr[i2] == arr[j]) {
                    iden++;
                }
            }
            med++;
        }
        System.out.print("Одинаковых чисел: " + iden);
        System.out.println();

//Поменять минимальное и максимальное числа в массиве местами

        System.out.print("Mинимальное и максимальное числа массива поменяны: ");
        int imax = 1;
        int imin = 1;
        int buf;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[imax]) {
                imax = i;
            }
            if (arr[i] < arr[imin]) {
                imin = i;
            }
        }
        buf = arr[imax];
        arr[imax] = arr[imin];
        arr[imin] = buf;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");}

//Инвертировать массив

        int arr3[] = {104, 86, 99, 74, 61, -32, 2, 198, 4, 8, 55, 99, -3, -154};
        System.out.println();
        System.out.print("Массив в инвертированом виде: ");
        for (int i = 0; i < arr3.length; i++) {
            int buf2 = arr3[i];
            arr3[i] = arr3[arr3.length - i - 1];
            arr3[arr3.length - i - 1] = buf2;

            if (i < arr3.length / 2) {
                System.out.print(arr3[i] + " ");
            } else System.out.print(buf2 + " ");
        }
    }
}
