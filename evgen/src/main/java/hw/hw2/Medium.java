package hw.hw2;

/**
 * Created by Евгений on 02.05.2015.
 */
public class Medium {
    public static void main(String[] args) {

        // Выведите на экран все положительные делители натурального числа.
        int n = 648;
        System.out.print("Все положительные делители числа " + n + " равны: ");

        for (int i = 1; i <= n; i++)
            if (n % i == 0) {
                System.out.print(i + " ");
            }

        System.out.println();

        // Выведите на экран общие делители двух натуральных чисел
        int a = 467;
        int b = 865;
        int max;
        System.out.print("Все положительные делители чисел " + a + " и " + b + " равны: ");

        if (a > b) {
            max = b;
        } else {
            max = a;
        }
        for (int i = 1; i <= b; i++)
            if (a % i == b % i) {
                System.out.print(i + " ");
            }
    }
}
