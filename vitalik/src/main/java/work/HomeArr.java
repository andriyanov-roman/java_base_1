package work;

/**
 * Масивы
 */
public class HomeArr {
    public static void main(String[] args) {

        int arr[] = {54, 86, 9, 74, 61, -32, 2, 98, 4, 8, 55, 99, -3, 54};

//Вывести в консоль все парные числа одномерного массива
//
//        System.out.print("Парные числа одномерного массива: ");
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i] % 2 == 0)
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//Вывести все числа одномерного массива в обратном порядке

//        int k = arr.length - 1;
//        System.out.print("Массив: ");
//        for (int i = 0; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print("Массив в обратном порядке: ");
//
//        for (int i = k; i >= 0; i--)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
////Вывести первую и вторую половину одномерного массива
//        int n = arr.length;
//        int d = n / 2;
//        System.out.println();
//        System.out.print("Перевая часть массива: ");
//        for (int i = 0; i < d; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print("Вторая часть масива: ");
//
//        for (int i = d; i < arr.length; i++)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
////Вывести первую и вторую половину одномерного массива в обратном порядке
//
//        System.out.println();
//        System.out.print("Перевая часть массива в обратном порядке: ");
//        for (int i = d - 1; i >= 0; i--)
//        {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.print("Вторая часть масива в обратном порядке: ");
//
//        for (int i = k; i >= d; i--)
//        {
//            System.out.print(arr[i] + " ");
//        }
//
////Найти сумму все элементов в массиве
//
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++)
//        {
//            sum += arr [i];
//        }
//        System.out.println();
//        System.out.print("Сумма всех элементов в массиве равна: " + sum);
//
////Найти среднеарифметическое всех чисел массива
//
//        int arm = 0;
//        arm = sum / arr.length;
//        System.out.println();
//        System.out.print("Среднеарифметическое всех чисел массива: " + arm);
//        System.out.println();

//Найти минимальное и максимальное число в массиве
//
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++)
//        {
//           if (max < arr[i])
//               max = arr[i];
//        else
//        if (min > arr[i])
//            min = arr[i];
//        }
//        System.out.print("Mаксимальное число массива: " + max);
//        System.out.println();
//        System.out.print("Минимальное число массива: " + min);
//        System.out.println();

////Заменить все отрицательные числа в массиве на 0
//
//        System.out.print("Заменены все отрицательные числа в массиве на 0: ");
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i] < 0)
//                arr[i] = 0;
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

////Подсчитать одинаковые числа в одномерном массиве
//
//        int iden = 0;
//        int med = 1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = med; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    iden++;
//                }
//            }
//            med++;
//        }
//        System.out.print("Одинаковых чисел: " + iden);
//        System.out.println();
//
//Поменять минимальное и максимальное числа в массиве местами
       /* int max = arr[0];
        int min = arr[0];
       int buf;
        int imax = 0;

        int imin = 0;

        for (int i = 0; i < arr.length; i++)
        {
           if (arr[i] > arr[++i])
           {

               arr[imax]= arr[i];
           }



        if (arr[i] < arr[++i])
        {

            arr[imin]= arr[i];

        }
            buf =arr[imax];
            arr[imax] = arr[imin];
            arr[imin] = buf;

            System.out.print(arr[i]+ " ");
        }




        System.out.println();
        System.out.print("Mаксимальное число массива: " + max);
        System.out.println();
        System.out.print("Минимальное число массива: " + min);
*/


//Инвертировать массив

        System.out.print("Массив в инвертированом виде: ");
        for (int i = 0; i < arr.length; i++)
        {
            int k = arr.length / 2;
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;

            if (i < k)
            {
                System.out.print(arr[i] + " ");
            }
            else System.out.print(tmp + " ");
        }


    }


}
