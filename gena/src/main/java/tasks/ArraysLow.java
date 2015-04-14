package tasks;

/**
 * Created by sigen on 4/2/2015.
 */
public class ArraysLow {


    public static void main(String[] args) {

        int[] arr = {-2, 0, -5, 6, 3, 10, -1, -2, 20, 13};
        //подсчет одинаковых!!!
        int count = 0;
        for (int i = 0; i<arr.length; i++){

            for (int j = 0; j<arr.length; j++){
                if ((j!=i)&&(arr[i]==arr[j])&&(j>i)){
                    count++;
                    System.out.println(arr[i]);
                }
            }
        }

        int sum = 0; //переменная для задания с суммами
        System.out.println("Парные числа");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println(i + " = " + arr[i]);
            }
        }
        System.out.println("В обратном порядке");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(i + " = " + arr[i]);
        }
        System.out.println("\nПервая половина");
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(i + " = " + arr[i]);
        }
        System.out.println("вторая половина");
        for (int i = arr.length / 2; i < arr.length; i++) {
            System.out.println(i + " = " + arr[i]);
        }
        System.out.println("\nПервая половина");
        for (int i = arr.length - 1; i > arr.length / 2 - 1; i--) {
            System.out.println(i + " = " + arr[i]);
        }
        System.out.println("вторая половина");
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            System.out.println(i + " = " + arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            sum = sum + arr[i];
        }
        System.out.println("\nСумма элементов" + sum);

        for (int i = arr.length - 1; i > 0; i--) {
            sum = sum + arr[i];
        }
        System.out.println("\nСреднее арифметическое" + sum / arr.length);


        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nМаксимальное " + max);
        System.out.println("Минимальное " + min);

       System.out.println("Заменили отрицательные на 0");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }


        max = 0;
        min = 10000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        //поменяли местами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] = max;
            } else if (arr[i] == max) {
                arr[i]=min;
            }
        }
        //инвертировали
        int[] arrtemp = new int[10];
        for (int i = arr.length -1; i>=0; i--){
            arrtemp[(arr.length -1)- i] = arr[i];
        }
        arr = arrtemp;
        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }




    }
}