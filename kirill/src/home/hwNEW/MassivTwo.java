//Ќаписать программу, котора€ выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива
public class MassivTwo {
    public static void main(String[] args) {
        int[] ms={-10, 16, 185, 66, -60};

        int min = ms[0];
        int max = ms[0];

        for (int i1 = 1; i1 < ms.length; i1++) {

            if (ms[i1] < min) {
                min = ms[i1]; }
            if (ms[i1] > max) {
                max = ms[i1]; }                }

        for (int i2 = 0; i2 < ms.length; i2++) {

            if (ms[i2] == min){
                break;        }
            else System.out.print(ms[i2]+","); }
        System.out.println(" - Vivod do minimalnogo znacheniya");

//Ќаписать программу, мен€ющую местами два наибольших элемента одномерного массива с первым и последним.	

        int x=0;
        int prev=min;
        for (int i3 = 0; i3 < ms.length; i3++) {                            //ищет второе по значению после max
            if ( prev<max)
                x=prev;
            prev=ms[i3];}
        System.out.println("2e naibolshee chislo v massive- "+x);

        int y=ms[0];
        for (int i4 = 0; i4 < ms.length; i4++){

            if (x==ms[i4]){ ms[i4]=y;}                                    //замена наибольших значений внутри массива
            else if (max==ms[i4]){ms[i4]=ms[ms.length-1];}}

        ms[0]=x;                                                      //замена первого и последнего значений наибольшими
        ms[ms.length-1]=max;

        for (int i5 = 0; i5 < ms.length; i5++) {
            System.out.print(ms[i5]+", ");}
        System.out.println("- Rezultat zameni");

    }

}