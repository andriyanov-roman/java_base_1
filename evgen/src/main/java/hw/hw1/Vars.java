package hw.hw1;

/**
 * Created by Евгений on 02.05.2015.
 */
public class Vars {
    /*
Создать четыре целочисленные переменные
Инициализировать переменную типа byte результатом суммы двух любых чисел
Инициализировать переменную типа short  результатом вычитания двух любых чисел
Инициализировать переменную типа int результатом деления двух любых чисел
Инициализировать переменную типа long результатом умножения двух любых чисел
Передать перменной типа byte результат суммы двух переменной типа byte
Передать переменной типа byte результат суммы двух переменных типа short , деленных на третью переменную типа byte
Переменной типа int передать результат деления двух short , умноженных на результат деления двух byte
Поменять значения двух целочисленных переменных используя третью
Поменять значения двух переменных без использования третей
*/

    public static void main(String[] args) {

// Создать четыре целочисленные переменные

        int a,b,c,d;

// Инициализировать переменную типа byte результатом суммы двух любых чисел

        byte e = 2 + 2;

// Инициализировать переменную типа short  результатом вычитания двух любых чисел

        short f = 5 - 2;

// Инициализировать переменную типа int результатом деления двух любых чисел

        int g = 10 / 2;

// Инициализировать переменную типа long результатом умножения двух любых чисел

        long h = 3 * 5;

// Передать перменной типа byte результат суммы двух переменной типа byte

        byte i = 2, j = 4;
        byte k = (byte) (i + j);

// Передать переменной типа byte результат суммы двух переменных типа short , деленных на третью переменную типа byte

        short l = 3;
        byte m = (byte) ((l + f)/k);

// Переменной типа int передать результат деления двух short , умноженных на результат деления двух byte

        int o = ((l / f) * (k / m));

// Поменять значения двух целочисленных переменных используя третью

        int p = 2;
        int q = 3;
        int s = q;
        p = s;
        q = s - 1;
        System.out.println("Р равно: " + p + " " + "( изначально обьявлено значение - 2 )");
        System.out.println("Q равно: " + q + " " + "( изначально обьявлено значение - 3 )");

// Поменять значения двух переменных без использования третей

        int u = 3;
        int v = 4;
        u = u + 1;
        v = v - 1;
        System.out.println("U равно: " + u + " " + "( изначально обьявлено значение - 3 )");
        System.out.println("V равно: " + v + " " + "( изначально обьявлено значение - 4 )");
    }
}
