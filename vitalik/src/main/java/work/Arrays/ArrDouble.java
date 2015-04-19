package work.Arrays;

/**
 * Двумерные массивы
 */
public class ArrDouble {
    public static void main(String[] args) {

        int arr[][] = {
                {25, 45, 8, 74, 9},
                {17, 55, 92, 2, 20},
                {8, 98, 7, 41, 3},};
        int arr2[][] = {
                {75, 5, 18, 7, 29},
                {1, 5, 8, 12, 2},
                {81, 9, 3, 41, 31},};

        printArr(arr);


// Найти максимальное и минимальное число в многомерном массиве

        int max = maxCell(arr);
        int min = minCell(arr);
        System.out.print("Mаксимальное число массива: " + max);
        System.out.println();
        System.out.print("Минимальное число массива: " + min);
        System.out.println();

// Поменять максимальное и минимальное число местами

        System.out.println();
        System.out.println("Mинимальное и максимальное числа массива поменяны: ");
        chengeElement(arr);
        printArr(arr);
        System.out.println();


// Инвертировать многомерный массив

        System.out.println();
        System.out.println("Массив в инвертированом виде: ");
        invert(arr);

// Перемножить два многомерных массива
        System.out.println();
        System.out.println("Результат произведения двух массивов: ");
        multArr(arr, arr2);
        System.out.println();

//Найти строку с наибольшей суммой элементов и с наименьшей

        System.out.print("Строка с наибольшей суммой элементов: ");
        stringMax(arr);
        System.out.println();

        System.out.print("Строка с наименьшей суммой элементов: ");

        stringMin(arr);
        System.out.println();

//Поменять местами строку с наибольшей суммой элементов и с наименьшей

//        System.out.println("Результат измененного масива: ");
//        chengeString(arr);

//Отсортировать многомерный массив
        System.out.println();
        System.out.println("Массив в отсортированим виде : ");
        arrSort(arr);
    }


/* ++++++++++++++++++++++++++ Методы ++++++++++++++++++++++++++++++++ */

    public static void printArr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int maxCell(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }

            }
        }
        return max;
    }


    public static int minCell(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }


    public static void chengeElement(int[][] arrays) {
        int maxi = 1;
        int maxj = 1;
        int mini = 1;
        int minj = 1;
        int buf;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] > arrays[maxi][maxj]) {
                    maxi = i;
                    maxj = j;
                }
                if (arrays[i][j] < arrays[mini][minj]) {
                    mini = i;
                    minj = j;
                }
            }
        }
        buf = arrays[maxi][maxj];
        arrays[maxi][maxj] = arrays[mini][minj];
        arrays[mini][minj] = buf;
    }


    public static void invert(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                int buf = arrays[i][j];
                arrays[i][j] = arrays[i][arrays[i].length - j - 1];
                arrays[i][arrays[i].length - j - 1] = buf;
                if (j < arrays[i].length / 2) {
                    System.out.print(arrays[i][j] + " ");
                } else System.out.print(buf + " ");
            }
            System.out.println();
        }
    }

    private static void multArr(int[][] arrays, int[][] arrays2) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = arrays[i][j] * arrays2[i][j];
            }
        }
        printArr(arrays);
    }


    public static int stringMax(int[][] array) {
        int bufMax = 0;
        int maxSum = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > bufMax) {
                bufMax = sum;
                maxSum = i;
            }
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[maxSum][j] + " ");
            }
        }
        return maxSum;
    }


    public static int stringMin(int[][] array) {
        int bufMin = 0;
        int minSum = 0;
        int bufMax = 0;
        int sum;
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > bufMax) {
                bufMax = sum;
                bufMin = bufMax;
            } else if (sum < bufMin) {
                bufMin = sum;
                minSum = i;
            }
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[minSum][j] + " ");
            }
        }
        return minSum;
    }


    public static void chengeString(int[][] arrays) {
        int buf;
        int maxSum = stringMax(arrays);
        int minSum = stringMin(arrays);
//                buf = maxSum;
//                maxSum = minSum;
//                minSum = buf;

    }

    public static void arrSort(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = j + 1; k < array[i].length; k++) {
                    if (array[i][j] > array[i][k]) {
                        int buf = array[i][j];
                        array[i][j] = array[i][k];
                        array[i][k] = buf;
                    }
                }
            }
        }
        printArr(array);
    }
}
