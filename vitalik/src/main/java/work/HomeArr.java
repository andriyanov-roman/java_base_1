package work;

/**
 * Масивы
 */
public class HomeArr {
    public static void main(String[] args) {

        //Вывести все числа одномерного массива в обратном порядке

        int arr[] = {54, 86, 9, 74, 61, -32, 2, 98, 4, 8, 55, 99, -3, 44};
        int k = arr.length - 1;
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Массив в обратном порядке: ");

        for (int i = k; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }

        //Вывести первую и вторую половину одномерного массива
        int n = arr.length;
        int d = n / 2;
        System.out.println();
        System.out.print("Перевая часть массива: ");
        for (int i = 0; i < d; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая часть масива: ");

        for (int i = d; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }


    }


}
