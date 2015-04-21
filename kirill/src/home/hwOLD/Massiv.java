//Вывести в консоль все парные числа одномерного массива
//Вывести все числа одномерного массива в обратном порядке
public class Massiv {
    public static void main(String[] args) {
        int[] ms=new int[5];
        ms[0]=-5;
        ms[1]=11;
        ms[2]=35;
        ms[3]=11;
        ms[4]=220;


        for(int i=0; i<ms.length;i++){                                                   //Вывести в консоль все парные числа одномерного массива
            int q=ms.length-1;
            while (q>i){if (ms[i]==ms[q]){
                System.out.println("Parnie chisla massiva: "+ms[i]+", "+ms[q]);}
                q--;}}

        for(int o=ms.length-1; o>=0; o--){                                               //Вывести все числа одномерного массива в обратном порядке
            System.out.print(ms[o]+",");}
        System.out.println("-massiv v obratnom poradke ");//шифт ф6

        for(int p=(ms.length-1)/2; p>=0; p--){                                           //Вывести первую половину одномерного массива в обратном порядке
            System.out.print(ms[p]+",");}
        System.out.println("-pervaya polovina massiva v obratnom poradke ");

        for(int r=(ms.length-1); r>(ms.length)/2; r--){                                  //Вывести вторую половину одномерного массива в обратном порядке
            System.out.print(ms[r]+",");}
        System.out.println("-vtoraya polovina massiva v obratnom poradke ");

        int avr1=0;
        for(int u=0; u<(ms.length-1)/2; u++){                                            //Вывести первую половину одномерного массива
            System.out.print(ms[u]+",");
            avr1+=ms[u];}
        avr1/=(ms.length-1)/2;
        System.out.println("-pervaya polovina massiva");

        int avr2=0;
        for(int y=(ms.length-1)/2; y<ms.length; y++){                                    //Вывести вторую половину одномерного массива
            System.out.print(ms[y]+",");
            avr2+=ms[y];}
        avr2/=(ms.length-1)/2;
        System.out.println("-vtoraya polovina massiva");

        int sum=0;
        for(int t=0; t<ms.length; t++){                                                  //Найти сумму всеx элементов в массиве
            sum+=ms[t];}
        System.out.println(sum+"-Summa vsex elementov");
        System.out.println((sum/ms.length)+"-Srednee vsex elementov");                   //Найти среднеарифметическое всех чисел массива

        for (int i2 = 0; i2 < ms.length; i2++) {                                         //Заменить все отрицательные числа в массиве на 0

            if (ms[i2] < 0){
                ms[i2] = 0;}
            System.out.print(ms[i2]+",");       }
        System.out.println(" -Otricatelnie menaem na 0");

        int min = ms[0];
        int max = ms[0];
        for (int i1 = 1; i1 < ms.length; i1++) {                                     //Найти минимальное и максимальное число в массиве

            if (ms[i1] < min) {
                min = ms[i1]; }
            if (ms[i1] > max) {
                max = ms[i1]; }                }
        System.out.println("Naxodim max=" + max + "; i min=" + min);

        int y = max;                                                                     //Поменять минимальное и максимальное числа в массиве местами
        for (int i3 = 0; i3 < ms.length; i3++) {

            if (max == ms[i3])
                ms[i3] = min;
            else if (min == ms[i3])
                ms[i3] = y;                    }

        for (int i4 = 0; i4 < ms.length; i4++)  {
            System.out.print(ms[i4] + ", ");  }
        System.out.println("-Menaem mestami max na min");

        int t;
        for(int i5=0; i5<ms.length/2;i5++){                                                 //Инвертировать массив

            t=ms[(ms.length-1)-i5];
            ms[(ms.length-1)-i5]=ms[i5];
            ms[i5]=t;}

        for (int i6 = 0; i6 < ms.length; i6++)  {
            System.out.print(ms[i6] + ", ");  }
        System.out.println(" - Invertirovanni massiv");

        if (avr1>avr2){for(int u=0; u<(ms.length-1)/2; u++){                                //Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
            System.out.print(ms[u]+",");}
            System.out.println("-srednaya pervai polovina massiva BOLSHE");}
        else {for(int i7=(ms.length-1)/2; i7<ms.length; i7++){
            System.out.print(ms[i7]+",");}

            System.out.println("-srednaya vtoroi polovini massiva BOLSHE");}



    }
}