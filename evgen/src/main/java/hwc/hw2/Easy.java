package hwc.hw2;

/**
 * Created by Евгений on 09.04.2015.
 */
public class Easy {
    public static void main(String[] args) {

        // Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….
        System.out.println("Задание 1.");
        for (int a = 1000; a < 10000; a = a + 3) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Задание 2.");
        // Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
        int count1 = 0;

        for (int b = 0; b <= 54; b++) {
            int value = 2 * b + 1;
            count1++;
            System.out.println(count1 + ". " + value);
        }

        System.out.println("Задание 3.");
        //Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
        for (int c = 90; c >0 ; c=c-5) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Задание 4.");
        //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
        int count2 = 1;

        for (int d = 1; d < 21; d++) {
            count2 = count2 * 2;
            System.out.println(d + ". " + count2);
        }

        System.out.println("Задание 5.");
        //Создайте программу, вычисляющую факториал натурального числа n
        long n = 14;
        long count3 = 1;

        while (0 < n) {
            count3 = count3 * n;
            n = n - 1;
            //System.out.println(count3); //Каждый даунд подсчета
        }
        System.out.println(count3);

        System.out.println("Задание 6.");
        //Выведите на экран первые 20 членов последовательности Фибоначчи.
        int f = 20;
        int count4 = 2;
        int [] arr = new int[f];
        arr [0] = 0;
        arr [1] = 1;

        System.out.println("1. " + arr[0]);
        System.out.println("2. " + arr[1]);

        for (int i = 2; i < f; i++) {

            arr[i]= arr [i-1] + arr [i-2];

            count4++;

            System.out.println(count4 + ". " + arr[i]);

        }

    }
}
