package Homework;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by ƒима on 08.04.2015.
 */
public class Homework_3 {
    public static void main(String[] args) {
        //программа вывод€ща€ на экран все четырЄхзначные числа последовательности 1000 1003 1006 1009 1012 1015 Е.
        int a = 1000;
        while (a <= 5000) {
            System.out.println(a);
            a = a + 3;
        }
        //программа, вывод€щ€€ на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 Е.
        int b = 1;
        while (b <= 109) {
            System.out.println(b);
            b += 2;
        }
        //программа, вывод€ща€ на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 Е.
        int c = 90;
        while (c >= 0) {
            System.out.println(c);
            c -= 5;
        }
        //программа, вывод€ща€ на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 Е.
        int d = 2;
        while (d <= 1048576) {
            System.out.println(d);
            d *= 2;
        }
        //программа, вычисл€юща€ факториал натурального числа n
        int n = 6;
        int f = 1;
        for (int k = 1; k <= n; ++k) {
            f = f * k;
        }
        System.out.println(f);
        //первые 20 членов последовательности ‘ибоначчи
        int h = 0;
        System.out.println(h);
        int e = 1;
        System.out.println(e);
        for (int x = h + e; x <= 6765;){
            h = e;
            e = x;
            System.out.println(x);
        }


    }
}
