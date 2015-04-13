package work.Arrays;

/**
 * Массивы сложные
 */
public class HomeArr3 {
    public static void main(String[] args) {

        int arr[] = {104, 86, 909, 10, 61, -32, 2, 198, 0, -188, 550, 99, -3, -154};
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
//Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве

        System.out.println();
        System.out.print("Сумма чисел между минимальным и максимальным числом: ");
        int imax = 1;
        int imin = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[imax]) {
                imax = i;
            }
            if (arr[i] < arr[imin]) {
                imin = i;
            }
        }
        if (imax > imin) {
            for (int i = imin + 1; i < imax; i++) {
                sum += arr[i];
            }
        } else
            for (int i = imax + 1; i < imin; i++) {
                sum += arr[i];
            }
        System.out.print(sum);

//Вывести в консоль половину массива в которой находиться наименьшее число массива

        int min1 = arr[0];
        int min2 = arr[0];
        int n = arr.length;
        int d = n / 2;
        for (int i = 0; i < d; i++) {
            if (min1 > arr[i])
                min1 = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            if (min2 > arr[i])
                min2 = arr[i];
        }
        System.out.println();
        System.out.print("Часть массива с наименьшим числом: ");
        if (min1 < min2)
            for (int i = 0; i < d; i++) {
                System.out.print(arr[i] + " ");
            }
        else
            for (int i = d; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
