package work;

public class HomeWork {
    public static void main(String[] args) {

// ������������� ����� ������������������ 1000 1003 1006 1009 1012 1015

        int i;
        i = 1000;
        System.out.println("������������� ����� ������������������");
        while (i <= 9999) {
            System.out.println(i);
            i += 3;
        }
//������ 55 ��������� ������������������ 1 3 5 7 9 11 13 15 17
        System.out.println("������ 55 ��������� ������������������");
        for (int j = 0; j <= 55; j++) {
            if (j % 2 != 0)
                System.out.println(j);
        }

// ��� ��������������� �������� ������������������ 90 85 80 75 70 65 60
        int t;
        t = 90;
        System.out.println("��� ��������������� �������� ������������������");
        while (t >= 5) {
            System.out.println(t);
            t -= 5;
        }

// ������ 20 ��������� ������������������ 2 4 8 16 32 64 128

        int y;
        y = 2;
        System.out.println("������ 20 ��������� ������������������");
        for (int r = 0; r <= 19; r++) {
            System.out.println(y);
            y += y;
        }
//��������� ������������ ����� n
        int fac, r;
        fac = 6;
        r = fac;
        System.out.println("��������� ������������ ����� n");
        for (int q = 0; q <= r; q++) {
            fac *= --r;
        }
        System.out.println(fac);

//������ 20 ������ ������������������ ���������
        int a, b, n, fib;
        fib = 20;
        a = 1;
        b = 1;
        n = fib;
        System.out.print("������ 20 ������ ������������������ ���������: \n" + a + " " + b);
        for (int k = 2; k < n; k++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.print(" " + fib);
        }

// ������������� �������� ������������ �����
        int s = 46;
        int u = s;
        int e = s;
        System.out.println("\n ������������� �������� ������������ �����");
        while (e > 0) {
            if (s % u == 0)
                System.out.println(u);
            u--;
        e--;
        }

//����� �������� ���� ����������� �����

        int nat1 = 28;
        int nat2 = 44;
        int m;
        if (nat1 < nat2)
            m = nat1;
        else
            m = nat2;
        int p = m;
        int l = m;
        System.out.println("\n ����� �������� ���� ����������� ������");
        while (l > 0) {
            if (nat1 % p == 0)
                if (nat2 % p == 0)
                    System.out.println(p);
            p--;
        l--;
        }

/* ���� ������ � �������� �� 000001 �� 999999.
 ����������� ��������� ������� � �������� ����� ������ ��� ���� ������ ����� ����� ��������� ��� ����,
  ���, ��������, � ������� � �������� 003102 ��� 567576.
   � ������� ���������, ����������� ������� ���������� ������� */









    }
}
