package work.Arrays;

/**
 * Двумерные массивы
 */
public class ArrDouble {
    public static void main(String[] args) {

        int arr[][] = {
                {25, 45, 8, 74, 9},
                {17, 55, 9, 2, 20},
                {8, 98, 7, 412, 3},};
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


        System.out.println("Mинимальное и максимальное числа массива поменяны: ");
        chengeElement(arr);
        printArr(arr);


// Инвертировать многомерный массив

        System.out.println();
        System.out.println("Массив в инвертированом виде: ");
        invert(arr);

// Перемножить два многомерных массива
        System.out.println();
        System.out.println("Результат произведения двух массивов: ");
        multArr(arr, arr2);

    }


/* ++++++++++++++++++++++++++ Методы ++++++++++++++++++++++++++++++++ */

    public static void printArr(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
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
//                int buf = Arrays[i][j];
//                Arrays[i][j] = Arrays[i][Arrays[i].length-j-1];
//                Arrays[i][Arrays[i].length-j-1] = buf;
//                if (j < Arrays[i].length/2 )
//                {
//                    System.out.print(Arrays[i][j] + " ");
//                }else System.out.print(buf  + " ");
                int buf = arrays[i][j];
                arrays[i][j] = arrays[arrays.length - i - 1][arrays[i].length - j - 1];
                arrays[arrays.length - i - 1][arrays[i].length - j - 1] = buf;

                if (j < arrays[i].length && i <= arrays.length / 2) {
                    System.out.print(arrays[i][j] + " ");
                } else System.out.print(buf + " ");
            }
            System.out.println();
        }
    }

    private static void multArr(int[][] arrays, int [][] arrays2) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = arrays[i][j] * arrays2[i][j];
            }
        }
        printArr(arrays);
   }


}
