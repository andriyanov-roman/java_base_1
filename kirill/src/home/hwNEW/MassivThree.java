//Ќайти сумму всех чисел наход€щихс€ между минимальным и максимальным числом в массиве
public class MassivThree {
    public static void main(String[] args) {
        int[] ms={5, 19, 21, -1, 200};

        int min = ms[0];
        int max = ms[0];

        for (int i1 = 1; i1 < ms.length; i1++) {

            if (ms[i1] < min) {
                min = ms[i1]; }
            if (ms[i1] > max) {
                max = ms[i1]; }                }
        int sum=0;
        for (int i2 = 0; i2 < ms.length-1; i2++) {
            if (i2-1>=0 && i2+1<=ms.length-1){
                if (ms[i2]>min && ms[i2]<max)
                    sum+=ms[i2];
            }
        }
        System.out.println(sum);

        //¬ывести в консоль половину массива в которой находитьс€ наименьшее число массива

        for (int i3 = 0; i3 < ms.length; i3++){

            if (i3<ms.length/2){

                if (ms[i3]==min){

                    for (int i4 = 0; i4 < (ms.length-1)/2; i4++){
                        System.out.print(ms[i4]+" ");}}}

            else if (i3>ms.length/2){

                if (ms[i3]==min){
                    for (int i5 = (ms.length-1)/2; i5 < ms.length; i5++){
                        System.out.print(ms[i5]+" ");}}}



        }

    }


}  