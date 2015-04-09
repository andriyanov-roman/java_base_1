/**
 * Created by Дима on 09.04.2015.
 */
public class Massives {
    public static void main(String[] args) {
        int[] road = {10, 20, 30, 40, 50};
        for (int i = road.length - 1; i >= 0; i--)
            System.out.println(road[i]);
        for (int i = 0; i <= road.length / 2; i++)
        System.out.println("First half " + road[i]);
        for (int i = road.length - 1; i >= road.length / 2; i--)
            System.out.println("Second half " + road[i]);

        }

    }

