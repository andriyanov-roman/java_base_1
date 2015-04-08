/*Электронные часы показывают время в формате от 00:00 до 23:59.
 Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
 что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/
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
