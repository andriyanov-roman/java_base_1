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
/*
public class TenVsTwo{
public static void main(String[] args) {
    int value = 120;
    int temp;
    int o1, o2, o3, o4, o5, o6, o7, o8;
    o1 = value % 2;
    System.out.println(o + "" + value);
    temp = value / 2;
    o2 = temp % 2;
    temp = value / 2;
    o3 = temp % 2;
    temp = value / 2;
    o4 = temp % 2;
    temp = value / 2;
    o5 = temp % 2;
    temp = value / 2;
    o6 = temp % 2;
    temp = value / 2;
    o7 = temp % 2;
    temp = value / 2;
    o8 = temp % 2;
    System.out.println(o8 + "" + o7 + "" + o6 + "" + o5 + "" + o4 + "" + o3 + "" + o2 + "" + o1);
}
}*/


