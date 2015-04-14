package tasks;

/**
 * Created by sigen on 4/5/2015.
 */
// ЕЩЕ НЕ ДОДЕЛАЛ
public class Condition {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;
        int c = 10;
        int d = 18;
        System.out.println("Заданы числа: " + a + ", " + b + ", " + c);
        int max;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else //т.е. b>a
        {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("максимальное: " + max);


    }


}
