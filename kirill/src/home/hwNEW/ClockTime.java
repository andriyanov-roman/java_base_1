/*����������� ���� ���������� ����� � ������� �� 00:00 �� 23:59.
 ���������� ������� ��� �� ����� ��������� ���, ��� ����� �� ��������� ������������ ������������ ���������� ��� ���,
 ��� ������ �� ��������� (��������, 02:20, 11:11 ��� 15:51).*/
public class ClockTime {
    public static void main(String[] args) {
        int x=0,y,zx,bx,zy,by,count=0;

        while (x<=24){
            y=0;
            while(y<=60){
                zx=x/100;
                bx=x%100;
                zy=y/100;
                by=y%100;
                if(zx==zy && bx==by){count++;};
                if(zx==by && bx==zy){count++;};
                y++;}
            x++;
        }

        System.out.println("Simmetrichnix pozici chasov i minut v sutki: "+count);
    }

}
