/**
 * Created by Евгений on 07.04.15.
 */
public class Std2 {
    public static void main(String[] args) {

        int a=120, b, c0,c1,c2,c3,c4,c5,c6,c7;
        a=a/2;
        c0=a%2;
        a=a/2;
        c1=a%2;
        a=a/2;
        c2=a%2;
        a=a/2;
        c3=a%2;
        a=a/2;
        c4=a%2;
        a=a/2;
        c5=a%2;
        a=a/2;
        c6=a%2;
        a=a/2;
        c7=a%2;
        System.out.println(c7+c6+c5+c4+""+c3+c2+c1+c0);

        int i=0;
        if (true || false) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        //int i=0;
        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
        }


    }
}
