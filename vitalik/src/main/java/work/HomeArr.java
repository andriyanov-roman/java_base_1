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

//Вывести первую и вторую половину одномерного массива в обратном порядке

        System.out.println();
        System.out.print("Перевая часть массива в обратном порядке: ");
        for (int i = d - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Вторая часть масива в обратном порядке: ");

        for (int i = k; i >= d; i--)
        {
            System.out.print(arr[i] + " ");
        }

//Найти сумму все элементов в массиве

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum += arr [i];
        }
        System.out.println();
        System.out.print("Сумма всех элементов в массиве равна: " + sum);

//Найти среднеарифметическое всех чисел массива

        int arm = 0;
        arm = sum / arr.length;
        System.out.println();
        System.out.print("Среднеарифметическое всех чисел массива: " + arm);
        System.out.println();
//Найти минимальное и максимальное число в массиве

        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++)
        {
           if (max < arr[i])
               max = arr[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
        if (min > arr[i])
            min = arr[i];
        }
        System.out.print("Mаксимальное число массива: " + max);
        System.out.println();
        System.out.print("Минимальное число массива: " + min);
        System.out.println();

//Заменить все отрицательные числа в массиве на 0



    }


}
