package tasks;

/**
 * Created by sigen on 4/14/2015.
 */
public class ArraysMiddle {
    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }

    public static void showHalf(int[] arr, int half) {
        if (half == 1) {
            for (int i = 0; i < arr.length / 2; i++) {
                System.out.println(arr[i]);
            }
        } else if (half == 2) {
            for (int i = arr.length / 2; i < arr.length - 1; i++) {
                System.out.println(arr[i]);
            }
        }

    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //﻿Найти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
    public static int getIndexes(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(i);
            } else if (arr[i] < 0) {
                sum += arr[i];
            }
        }
        return sum;
    }


    //Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
    static void getBeforeZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == 0) {
                break;
            }
        }
    }

    //Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива
    static void getBeforeMin(int[] arr) {
        int min = getMin(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] == min) {
                break;
            }
        }
    }

    //Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
    static void swapBiggest(int[] arr) {
        int max = 0;
        int second = 0;
        int maxind = 0;
        int secind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                secind = maxind;
                max = arr[i];
                maxind = i;
            } else if (arr[i] > second) {
                second = arr[i];
                secind = i;
            }
        }
        int temp = arr[0];
        arr[0] = max;
        arr[maxind] = temp;

        temp = arr[arr.length - 1];
        arr[arr.length - 1] = second;
        arr[secind] = temp;
        showArray(arr);
    }

    //Вывести в консоль половину массива, среднеарифметическое которых является наибольшим
    static void getBiggestAvarage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        sum = 0;
        int avar1 = sum / (arr.length / 2);
        for (int i = arr.length / 2; i < arr.length; i++) {
            sum += arr[i];
        }
        int avar2 = sum / (arr.length / 2);
        if (avar1 > avar2) {
            showHalf(arr, 1);

        } else {
            showHalf(arr, 2);
        }
    }

    //Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве
    public static int getSumBetween(int[] arr) {
        int sum = 0;
        int max = 0;
        int min = 10000;
        int maxind = 0;
        int minind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxind = i;
            } else if (arr[i] < min) {
                min = arr[i];
                minind = i;
            }
        }
        if (minind > maxind) {
            for (int i = maxind = 1; i < minind; i++) {
                sum += arr[i];
            }

        } else if (maxind > minind) {
            for (int i = minind + 1; i < maxind; i++) {
                sum += arr[i];
            }

        }
        return sum;
    }

    //Вывести в консоль половину массива в которой находиться наименьшее число массива
    static void getMinHalf(int[] arr) {
        int min = 10000;
        int minind = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minind = i;
            }
        }
        if (minind < arr.length / 2) {
            showHalf(arr, 1);
        } else {
            showHalf(arr, 2);
        }

    }

    /*static void swapHard(int[] arr, int a,int b) {
        int [] arrtemp = new int[10];
        int j = arrtemp.length;
        for (int i = 0; i<arr.length; i++){

            while(j>=0){
                if((arr[i]>a)&&(arr[i]<b)){
                    arrtemp[j]=arr[i];
                    j--;
                    break;
                }
                else {arrtemp[i]=0;
                    j--;

                }
            }
            System.out.println(arrtemp[i]);

        }

    }*/

    public static void main(String[] args) {
        int[] arr = {-2, -5, 0, 6, 3, 10, -1, -2, 20, 13};
        //swapBiggest(arr);
        //getBiggestAvarage(arr);
        //getSumBetween(arr);
        //getMinHalf(arr);
        //swapHard(arr,3,7);
    }
}
