package Homework;

/**
 * Created by Дима on 14.04.2015.
 */
public class Homework_5 {
    public static void main(String[] args) {
        int[][] road = {
                {1, 2, 3, 4, 5},
                {11, 12, 13, 14, 15},
                {10, 20, 30, 40, 50}
        };
        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j < road[i].length; j++) System.out.println(road[i][j]);
        }
        for (int i = road.length - 1; i >= 0; i--) {
            for (int j = road[i].length - 1; j >= 0; j--) System.out.println(road[i][j]);
        }
        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j <= road[i].length / 2; j++) System.out.println("First half " + road[i][j]);
        }
        for (int i = 0; i < road.length; i++) {
            for (int j = road[i].length / 2; j < road[i].length; j++) System.out.println("Second half " + road[i][j]);
        }
        int max = road[0][0];
        int min = road[0][0];
        for (int i = 0; i < road.length; i++) {
            for (int j = 0; j < road.length; j++) {
                if (road[i][j] < min) {
                    road[i][j] = min;
                } else if (road[i][j] > max) {
                    road[i][j] = max;
                }
            }

        }
        System.out.println(min);
        System.out.println(max);
    }
}