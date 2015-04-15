package ex.lsone;


public class MethodsTests {
    public static void main(String[] args) {
        int[] arrayOne = {1, 3, 4, 2, 4, 5};
        int[] arrayTwo = {1, 31, 44, 23, 41, 5};
        int maxOne = getMax(arrayOne);
        int maxTwo = getMax(arrayTwo);
        if (maxOne > maxTwo) {
            System.out.println("Array one is bigger");
        } else if (maxOne < maxTwo) {
            System.out.println("Array two is bigger");
        }
        showInRange(arrayOne, 1, 10);
        showInRange(arrayOne, 1);
        short s = 0;
        double d = 0.0;
        System.out.println(d);
    }

    public static void showInRange(int[] array, int from, int to) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > from && array[i] < to) {
                System.out.println();
            }
        }
    }

    public static void showInRange(int[] array, int from) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > from) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static int getMax(int[] array) {
        int max = array[0];
        showArray(array);
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static void showArray(int[] myBeautifulLittlePony) {
        for (int i = 0; i < myBeautifulLittlePony.length; i++) {
            System.out.print(myBeautifulLittlePony[i] + " ");
        }
        System.out.println();
    }
}
