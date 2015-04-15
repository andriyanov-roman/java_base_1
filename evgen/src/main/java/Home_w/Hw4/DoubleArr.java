package Home_w.Hw4;

/**
 * Created by ������� on 14.04.2015.
 */
public class DoubleArr {
    public static void main(String[] args) {

        int[][] twoArray = {
                {1, 4, 2, 5, 7},
                {1, 4, 2, 5, 4},
                {56, 23, 6, 23, 3}
        };

        System.out.print("Заданный массив: ");
        showArray(twoArray);
        System.out.println();

        System.out.print("Массив в обратном порядке:");
        showArray(twoArray);
        System.out.println();

        System.out.print("Сумма элементов массива: ");
        int sum = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                sum = sum + twoArray[i][j];
            }
        }
        System.out.print(sum);

        System.out.println();
        System.out.print("Минимальное значение массива: ");
        int min = twoArray[0][0];
        int max = twoArray[0][0];
        int minI = 0, minJ = 0, maxI = 0, maxJ = 0, buf;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                if (twoArray[i][j] < min) {
                    min = twoArray[i][j];
                    minI = i;
                    minJ = j;
                }
            }
        }
        System.out.print(min);

        System.out.println();
        System.out.print("Максимальное значение массива: ");
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                if (twoArray[i][j] > max) {
                    max = twoArray[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.println();

        buf = twoArray[minI][minJ];
        twoArray[minI][minJ] = twoArray[maxI][maxJ];
        twoArray[maxI][maxJ] = buf;

        System.out.print("Меняем минимальное и максимальное значение: ");
        showArray(twoArray);

        int sumLine = 0;
        int[] lineCount = new int[twoArray.length];
        int maxLine;
        int minLine;
        int maxLineIndex = 0;
        int minLineIndex = 0;
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                sumLine = sumLine + twoArray[i][j];
            }
            lineCount[i] = sumLine;
        }
        for (int i = twoArray.length - 1; i != 0; i--) {
            lineCount[i] = lineCount[i] - lineCount[i - 1];
        }

        minLine = lineCount[0];
        maxLine = lineCount[0];

        for (int i = 0; i < lineCount.length; i++) {
            if (maxLine < lineCount[i]) {
                maxLine = lineCount[i];
                maxLineIndex = i;
            }
        }
        for (int i = 0; i < lineCount.length; i++) {
            if (minLine > lineCount[i]) {
                minLine = lineCount[i];
                minLineIndex = i;
            }
        }
        System.out.println();
        System.out.println("Максимальная строка: " + maxLineIndex);
        System.out.println("Минимальная строка: " + minLineIndex);

    }




    public static void showArray(int[][] myBeautifulLittlePony) {
        for (int i = 0; i < myBeautifulLittlePony.length; i++) {
            System.out.println();
            for (int j = 0; j < myBeautifulLittlePony[i].length; j++) {
                System.out.print(myBeautifulLittlePony[i][j] + " ");
            }
        }
        System.out.println();
    }

    public static void showArray(int[] myBeautifulLittlePony) {
        for (int i = 0; i < myBeautifulLittlePony.length; i++) {
            System.out.print(myBeautifulLittlePony[i] + " ");
        }
        System.out.println();
    }
}

