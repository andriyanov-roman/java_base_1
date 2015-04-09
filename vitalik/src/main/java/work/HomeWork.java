package work;

public class HomeWork {
    public static void main(String[] args) {

// четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015

        int i;
        i = 1000;
        System.out.println("четырёхзначные числа последовательности");
        while (i <= 9999) {
            System.out.println(i);
            i += 3;
        }
//первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17
        System.out.println("первые 55 элементов последовательности");
        for (int j = 0; j <= 55; j++) {
            if (j % 2 != 0)
                System.out.println(j);
        }

// все неотрицательные элементы последовательности 90 85 80 75 70 65 60
        int t;
        t = 90;
        System.out.println("все неотрицательные элементы последовательности");
        while (t >= 5) {
            System.out.println(t);
            t -= 5;
        }

// первые 20 элементов последовательности 2 4 8 16 32 64 128

        int y;
        y = 2;
        System.out.println("первые 20 элементов последовательности");
        for (int r = 0; r <= 19; r++) {
            System.out.println(y);
            y += y;
        }
//факториал натурального числа n
        int fac, r;
        fac = 6;
        r = fac;
        System.out.println("факториал натурального числа n");
        for (int q = 0; q <= r; q++) {
            fac *= --r;
        }
        System.out.println(fac);

//первые 20 членов последовательности Фибоначчи
        int a, b, n, fib;
        fib = 20;
        a = 1;
        b = 1;
        n = fib;
        System.out.print("первые 20 членов последовательности Фибоначчи: \n" + a + " " + b);
        for (int k = 2; k < n; k++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
        }

// положительные делители натурального числа
        int s = 46;
        int u = s;
        int e = s;
        System.out.println("\n положительные делители натурального числа");
        while (e > 0) {
            if (s % u == 0)
                System.out.println(u);
            u--;
        e--;
        }

//общие делители двух натуральных чисел

        int nat1 = 28;
        int nat2 = 44;
        int m;
        if (nat1 < nat2)
            m = nat1;
        else
            m = nat2;
        int p = m;
        int l = m;
        System.out.println("\n общие делители двух натуральных чисела");
        while (l > 0) {
            if (nat1 % p == 0)
                if (nat2 % p == 0)
                    System.out.println(p);
            p--;
        l--;
        }

/* Есть билеты с номерами от 000001 до 999999.
 «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
  как, например, в билетах с номерами 003102 или 567576.
   С помощью программы, подсчитайте сколько счастливых билетов */









    }
}
