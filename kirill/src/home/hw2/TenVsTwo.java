//�������� �������� �������� � �������� ������� ��������� ������ ����� �� 1 �� 127 � ����������� ��� � ���� ������ byte. ������ 19 � �������� ������� 10011, � ������������� byte ��� 0001 0011
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
