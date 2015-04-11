package work;

/**
 * Масивы
 */
public class HomeArr {
    public static void main(String[] args) {

        //Вывести все числа одномерного массива в обратном порядке

        int arr[] = {54, 25, 86, 9, 74, 61, 2, 98, 4, 8, 55, 99, -3, 44};
        int k = arr.length - 1;
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Массив в обратном порядке: ");

        for (int i = k; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //Вывести первую и вторую половину одномерного массива



    }


}
