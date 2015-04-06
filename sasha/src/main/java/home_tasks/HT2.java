package home_tasks;

public class HT2 {

    public static void main(String[] args) {

        int x = 121, y = 20, z = 30, x1, x2, x3, x4, x5, x6, x7, x8;

        if (x >= 30)
            System.out.println("The biggest variable is x = " + x);

        if (y >= 30)
            System.out.println("The biggest variable is y = " + y);

        if (z >= 30)
            System.out.println("The biggest variable is z = " + z);

        x1 = x%2;
        x2 = x1%2;
        x3 = x2%2;
        x4 = x3%2;
        x5 = x4%2;
        x6 = x5%2;
        x7 = x6%2;
        x8 = x7%2;

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);
        System.out.println(x7);
        System.out.println(x8);

        }

    }
