package Home_w.Hw3;

/**
 * Created by Евгений on 14.04.2015.
 */
public class Test {
    public static void main(String[] args) {

        int[][] twoArray = {
                {1, 4, 2, 5, 7},
                {1, 4, 2, 5, 4},
                {56, 23, 6, 23, 3}
        };

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i <twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                sum = sum + twoArray[i][j];
            }
        }
        System.out.print("Summa: ");
        System.out.println(sum);

        int min = twoArray[0][0];
        int max = twoArray[0][0];
        for (int i = 0; i <twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
               if (twoArray[i][j] < min) {
                   min = twoArray[i][j];
               }
            }
        }
        System.out.println("Minimalnoe: " + min);

        for (int i = 0; i <twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                if (twoArray[i][j] > max) {
                    max = twoArray[i][j];
                }
            }
        }
        System.out.println("Maximalnoe: " + max);

        for (int i = twoArray.length; i >= 0; i--) {
            for (int j = twoArray[i].length; j >= 0; j--) {
                System.out.print(twoArray[i][j] + " ");
            }
        }
    }
}
