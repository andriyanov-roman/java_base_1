//���� ������ � �������� �� 000001 �� 999999. ����������� ��������� ������� � �������� ����� ������ ��� ���� ������ ����� ����� ��������� ��� ����,
//���, ��������, � ������� � �������� 003102 ��� 567576.
//� ������� ���������, ����������� ������� ���������� �������
public class SchastliviBilet {

    public static void main(String[] args) {
        int x=999999,
                count=0,
                digit1,
                digit2,
                digit3,
                digit4,
                digit5,
                digit6;

        while(x>=0){
            x--;
            digit1=  x /1000000;
            digit2 = x %1000000/100000;
            digit3 = x %1000000%100000/10000;
            digit4 = x %1000000%100000%10000/1000;
            digit5 = x %1000000%100000%10000%1000/100;
            digit6 = x %1000000%100000%10000%1000%100/10;

            if(digit1+digit2+digit3==digit4+digit5+digit6){
                count++;}
        }
        System.out.printf("Kolichestvo schastlivih nomerov = "+count);

    }}