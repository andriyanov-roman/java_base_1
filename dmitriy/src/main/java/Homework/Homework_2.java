package Homework;

/**
 * Created by ���� on 07.04.2015.
 */
public class Homework_2 {
    public static void main(String[] args) {
        int x, y, z;
        x = 4;
        y = 5;
        z = 6;

        if (x >= 6) System.out.println("The biggest Arg is x");
        if (y >= 6) System.out.println("The biggest Arg is y");
        if (z >= 6) System.out.println("The biggest Arg is z");
        //������� ����� �� ���������� ������� � ��������
        int value = 57;
        int temp;
        for (value = 57; value > 1; value /= 2) {
            temp = value % 2;
            System.out.println(temp + "");
        }
        System.out.println(1);


    }
}
