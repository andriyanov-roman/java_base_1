package ex.lsone;

/**
 * Created by user on 4/7/2015.
 */
public class BinaryTranslator {
    public static void main(String[] args) {
        int value = 120;
        int temp;
        int one, two, three, four, five, six, seven, eight;
        one = value % 2;
        temp = value / 2;
        two = temp % 2;
        temp = temp / 2;
        three = temp % 2;
        temp = temp / 2;
        four = temp % 2;
        temp = temp / 2;
        five = temp % 2;
        temp = temp / 2;
        six = temp % 2;
        temp = temp / 2;
        seven = temp % 2;
        temp = temp / 2;
        eight = temp % 2;
        System.out.println(eight + "" + seven);
        int a = 100;
        int b = 20;
        int c = 30;
        if (a > b && a > c) {
            System.out.println(a + " is max");
        } else if (b > c && b > a) {
            System.out.println(b + " is max");
        } else {
            System.out.println(c);
        }

        if (true || false || false || true || true) {
            System.out.println("true");
        } else {
            System.out.println("else");
        }
        int i = 2;
        String str = "Test";
        switch (str) {
            case "Test":
                System.out.println("тест");
                switch (i) {
                     case 1:System.out.println("in test"); break;
                }
                break;
            case "Book":
                System.out.println("книга");
                break;
        }
    }
}
