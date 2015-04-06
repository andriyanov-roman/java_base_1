//Написать программу, делающую обратную операцию перевода, из двоичной в десятеричную.
import java.util.Scanner;
public class TwoVsTen {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int a,x;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;
        int digit6;
        int digit7;

        System.out.print("VVedite dvoichnoe chislo: ");
        a = input.nextInt();

        digit1=  a /1000000;
        digit2 = a %1000000/100000;
        digit3 = a %1000000%100000/10000;
        digit4 = a %1000000%100000%10000/1000;
        digit5 = a %1000000%100000%10000%1000/100;
        digit6 = a %1000000%100000%10000%1000%100/10;
        digit7 = a %1000000%100000%10000%1000%100%10;
        if (digit1==1)
            digit1=64;
        if (digit2==1)
            digit2=32;
        if (digit3==1)
            digit3=16;
        if (digit4==1)
            digit4=8;
        if (digit5==1)
            digit5=4;
        if (digit6==1)
            digit6=2;
        if (digit7==1)
            digit7=1;
        x=digit1+digit2+digit3+digit4+digit5+digit6+digit7;
        System.out.println("Desyatichnoe chislo = "+x);
    }

}
