package Homework;

/**
 * Created by ���� on 13.04.2015.
 */
public class Homework_4 {
    public static void main(String[] args) {
        int[] road = {10, 20, 30, 40, 50};
        //��� ����� � �������� �������
        for (int i = road.length - 1; i >= 0; i--)
            System.out.println(road[i]);
        //������ �������� �������
        for (int i = 0; i <= road.length / 2; i++)
            System.out.println("First half " + road[i]);
        //� �������� �������
        for (int i = road.length / 2; i >= 0; i--)
            System.out.println(road[i]);
        //������ �������� �������
        for (int i = road.length / 2; i < road.length; i++)
            System.out.println("Second half " + road[i]);
        //� �������� �������
        for (int i = road.length - 1; i >= road.length / 2; i--)
            System.out.println(road[i]);
        //���� ���� ��������� � �������
        int g = 0;
        for (int i = 0; i < road.length; i++) {
            g = g + road[i];
        }
        System.out.println(g);
        //������ ��������������� ���� �����
        System.out.println(g / 2);
        //����������� � ������������ ����� � �������
        int min = road[0];
        int max = road[0];
        for (int i = 0; i < road.length; i++) {
            if (road[i] < min) {
                road[i] = min;
            } else if (road[i] > max) {
                road[i] = max;
            }
        }
        System.out.println(min);
        System.out.println(max);
        //���������� �����
        int same = 0;
        for (int i = 0; i < road.length; i++) {
            for (int k = 0; k < road.length; k++) {
                    if (road[i] == road[k]) same++;
            }
            if(same > 1) {
                System.out.println(road[i] + " " + same);
            }
            same = 0;
        }
        System.out.println(same);

    }
}
