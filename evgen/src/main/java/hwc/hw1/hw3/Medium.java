package hwc.hw1.hw3;

/**
 * Created by Евгений on 14.04.2015.
 */

/* Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
   ﻿Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
   Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
   Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
   Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива*/

public class Medium {
    public static void main(String[] args) {
        int[] arr = {15, 20, -6, 0, 25, -2};

        System.out.print("Заданный массив: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
        float arMeanPart1 = 0;
        float arMeanPart2 = 0;

        for (int i = 0; i < arr.length/2; i++) {
            arMeanPart1 = arMeanPart1 + arr[i];
        }
        arMeanPart1 = arMeanPart1 / (arr.length/2);

        for (int i = arr.length/2; i < arr.length; i++) {
            arMeanPart2 = arMeanPart2 + arr[i];
        }
        arMeanPart2 = arMeanPart2 / (arr.length/2);

        if (arMeanPart1 > arMeanPart2) {
            System.out.println("Среднеарифметическое первой половины массива больше и равно: " + arMeanPart1);
        } else {
            System.out.println("Среднеарифметическое второй половины массива больше и равно: " + arMeanPart2);
        }

        //Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
        int sumIndex = 0;
        int sumNegative = 0;
        System.out.print("Индексы положительных чисел: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                System.out.print(i + " ");
            } else {
                sumNegative = sumNegative + arr[i];
            }
            }
        System.out.println();
        System.out.println("Сумма негативных чисел массива равна: " + sumNegative);

        //Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        System.out.print("Числа до нуля включительно: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                break;
            } else {
                System.out.print(arr[i] + " ");
            }
        }

        //Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.

        int max = arr[0];
        int maxBuf = 0;
        int maxIndex = 0;
        int secMax;
        int secMaxBuf = 0;
        int secMaxIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println();
        System.out.println("Первое максимальное число: " + max);

        if ( arr[0] != max) {
            secMax = arr[0];
        } else {
            secMax = arr[1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (secMax < arr[i] && arr[i] != arr[maxIndex]) {
                secMax = arr[i];
                secMaxIndex = i;
            }
        }
        System.out.println("Второе максимальное число: " + secMax);

        System.out.print("Меняем местами два наибольших элемента одномерного массива с первым и последним... Результат: ");
        maxBuf = max;
        arr[maxIndex] = arr[0];
        arr[0] = maxBuf;

        secMaxBuf = secMax;
        arr[secMaxIndex] = arr[arr.length-1];
        arr[arr.length-1] = secMaxBuf;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива
        int min = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        //System.out.println(min);
        System.out.println();
        System.out.print("Элементы одномерного массива, которые расположены до минимального элемента всего массива: ");
        for (int i = 0; i < minIndex; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
