package tasks;

/**
 * Created by sigen on 4/5/2015.
 */
public class CondHard {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;
        int d = 18;
        int max = 0;
        int second = 0;
        System.out.println("Заданы числа " + a + ", " + b + ", " + c + ", " + d);
        if (a > b) {
            max = a;
            second = b;
            if (a > c) // a>b & a>c
            {
                if (b < c) //a>c>b ?d
                {
                    second = c;

                    if (c < d) //a>c c<d
                    {
                        second = d;
                        if (d > a) {
                            max = d;
                            second = a;

                        }
                    }

                } else //a>b>c
                {
                    if (b < d) {
                        second = d;
                        if (d > a) {
                            max = d;
                            second = a;

                        }
                    }

                }
            } else //c>a>b
            {
                max = c;
                second = a;
                if (a < d) {
                    second = d;
                    if (d > c) {
                        max = d;
                        second = c;
                    }
                }
            }


        } else //b>a
        {
            max = b;
            second = a;
            if (b > d) //b>d>a
            {
                second = d;
                if (b > c) {
                    if (c > d) {
                        second = c;
                        if (c > b) {
                            max = c;
                            second = b;
                        }
                    }

                }

            } else //d>b>a
            {
                max = d;
                second = b;
                if (c > d) //c>d>b>a
                {
                    second = d;
                    max = c;

                } else {
                    if (c > b) {
                        second = c;
                    }

                }
            }
        }

        System.out.println("Второе по величине: " + second);

    }
}
