package ex.lsone;


public class MethodsExample {
    public static void main(String[] args) {
        int[] array = {12, 5, 24, 6};
        System.out.println(array[0]);
        int[][] twoArray = {
                {1, 4, 2, 5, 7},
                {1, 4, 2, 5, 4},
                {56, 23, 6, 23, 3}
        };
        System.out.println(twoArray[0][0]);
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                System.out.print(twoArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
