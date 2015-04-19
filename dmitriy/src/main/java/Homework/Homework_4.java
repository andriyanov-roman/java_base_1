package Homework;

/**
 * Created by Дима on 13.04.2015.
 */
public class Homework_4 {
    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] road = {10, 20, 30, 30, 40, 50};
        //все числа в обратном порядке
        for (int i = road.length - 1; i >= 0; i--)
            System.out.println(road[i]);
        //первая половина массива
        for (int i = 0; i <= road.length / 2; i++)
            System.out.println("First half " + road[i]);
        //в обратном порядке
        for (int i = road.length / 2; i >= 0; i--)
            System.out.println(road[i]);
        //вторая половина массива
        for (int i = road.length / 2; i < road.length; i++)
            System.out.println("Second half " + road[i]);
        //в обратном порядке
        for (int i = road.length - 1; i >= road.length / 2; i--)
            System.out.println(road[i]);
        //сума всех элементов в массиве
        int g = 0;
        for (int i = 0; i < road.length; i++) {
            g = g + road[i];
        }
        System.out.println(g);
        //средне аррифметическое всех чисел
        System.out.println(g / 2);
        //минимальное и максимальное число в массиве
        int min = road[0];
        int max = road[0];
        for (int i = 0; i < road.length; i++) {
            if (road[i] < min) {
                min = road[i];
            } else if (road[i] > max) {
                max = road[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        //одинаковые числа
        int same = 0;
        for (int i = 0; i < road.length; i++) {
            for (int k = 0; k < road.length; k++) {
                if (road[i] == road[k]) same++;
                if (i == k) same--;
            }
        }
        System.out.println(same);
        //поменять минимальное и максимальное местами
        int swapmax = road[0];
        int swapmin = road[0];
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < road.length; i++) {
            if (road[i] > swapmax) {
                swapmax = road[i];
                maxI = i;
            } else if (road[i] < swapmin) {
                swapmin = road[i];
                minI = i;
            }
        }
        int temp = road[maxI];
        road[maxI] = road[minI];
        road[minI] = temp;
        show(road);


    }
}
