/*����������� ���� ���������� ����� � ������� �� 00:00 �� 23:59.
 ���������� ������� ��� �� ����� ��������� ���, ��� ����� �� ��������� ������������ ������������ ���������� ��� ���,
 ��� ������ �� ��������� (��������, 02:20, 11:11 ��� 15:51).*/
public class ClockTime {
    public static void main(String[] args) {
        int x=0,y,zx,bx,zy,by,count=0;

        while (x!=24){
            y=59;
            while(y>=1){
                if (x>9) zx=x/10;
                else zx=0;
                bx=x%10;
                if(y>9)
                    zy=y/10;
                else zy=0;
                by=y%10;

                if(zx==zy){
                    if (bx==by){
                        count++;
                        System.out.println(zx+""+bx+":"+zy+""+by);}}

                else if (zx==by){
                    if(bx==zy){
                        count++;
                        System.out.println(zx+""+bx+":"+zy+""+by);}}
                y--;}
            x++;
        }
        System.out.println("Simmetrichnix pozici chasov i minut v sutki: "+count);
    }
}
