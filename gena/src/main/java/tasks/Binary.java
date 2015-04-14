package tasks;

/**
 * Created by sigen on 4/5/2015.
 */
public class Binary {
    public static void main(String[] args) {


        // переводим из двоичной в десятичную
        int start = 95;
        System.out.println("В 10-ной С/С: " + start);
        //
        //System.out.println(Integer.toString(start,2)); - но это слишком легко
        //
        // так и не придумал, как избежать использования циклов и массивов

        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < 7; i++) {
            if (start != 1) {
                if (start % 2 == 1) {
                    arr[i] = 1;
                    start = (start - (start % 2)) / 2;

                } else {
                    start = start / 2;
                }
            } else {
                arr[i] = 1;
                break;
            }


        }
        System.out.println("В 2-ной С/С: ");


        for (int i = 7; i >= 0; i--) {
            System.out.print(arr[i]);
        }
        int pow = 0;
        int digit = 0;

        for (int i = 7; i >= 0; i--, pow++) {
            digit += arr[i] * Math.pow(2, i);

        }

        System.out.println("\nИ обратно: " + digit);
    }

}



