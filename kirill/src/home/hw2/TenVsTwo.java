//Написать алгоритм перевода в двоичную систему счисления любого числа от 1 до 127 и представить его в виде одного byte. Пример 19 в двоичной системе 10011, в представлении byte это 0001 0011
import java.util.Scanner;
public class TenVsTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int a, x, y;
        System.out.print("VVedite chislo ot 1 do 127: ");
        a=input.nextInt();
        while (a!=0){
            x=a;
            a=a/2;
            y=x%2;
            System.out.print(y);}
        System.out.println("");
        System.out.print("Chitaem spravo nalevo =)");
    }

}
