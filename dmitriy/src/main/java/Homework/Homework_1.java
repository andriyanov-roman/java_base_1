package Homework;

/**
 * Created by Дима on 07.04.2015.
 */
public class Homework_1 {
    public static void main(String[] args){
        byte a = 2 + 5;
        byte e = 5;
        short b = 20 - 10;
        short h = 2;
        int c = 20 / 10;
        long d = 2 * 10;

        byte g = (byte) (a + e);
        byte i = (byte) ((byte)(b + h)/g);
        int k = (b / h) * (g / i);

        System.out.println("Sum of 2 bytes = " + g);
        System.out.println("Sum of 2 shorts division to g = " + i);
        System.out.println("Division of 2 shorts multiple to division of 2 bytes = " + k);

        int x, y, z;
        x = 1;
        y = 3;
        z = 2;
        x = x + z;
        y = y - z;

        System.out.println("Arg x change from 1 to y, so x = " + x);
        System.out.println("Arg y change from 3 to x, so y = " + y);

        int l, v;
        l = 5;
        v = 4;
        l = l + v;
        v = l - v;
        l = l - v;

        System.out.println("Arg l change from 5 to v, so l = " + l);
        System.out.println("Arg v change from 4 to l, so v = " + v);



    }
}
