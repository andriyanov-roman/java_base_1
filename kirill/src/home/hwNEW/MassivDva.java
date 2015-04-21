
public class MassivDva {
    public static void main(String[] args) {
        int[][] dm =
                {{2, 4, 1, 2, 35},
                 {-21, -212, -11, 20, -34},
                 {23, 45, 56, 11, 223}};

        showM(dm);
        zam(dm);
       // zmST(dm);
        sort(dm);
        umnozh(dm, dm);
        inv(dm);
    }

    public static void zmST(int[][] pi) {
        int sum = 0;
        int[] tmax = {0, 0, 0, 0, 0};
        int[] tmin = {0, 0, 0, 0, 0};
        int[] t = {0, 0, 0, 0, 0}, q = {0, 0, 0, 0, 0};



 /*   for (int i = 0; i < pi.length; i++) {
        for (int j = 0; j < pi[i].length; j++) {
           sum+=pi[i][j];t[j]=pi[i][j];
        }
        if (sum>sumMax) {sumMax=sum;
        tmax=t;}
        if(sum<sumMin) {sumMin=sum;
        tmin=t;}
        t=q; sum=0;
    }
*/
  /*  for (int i1 = 0; i1 < pi.length; i1++) {
        for (int j1 = 0; j1 < pi[i1].length; j1++) {
            sum+=pi[i1][j1];
        }
        if (sum==sumMax) {
            for (int i2 = 0; i2 < pi.length; i2++) {
                for (int j2 = 0; j2 < pi[i2].length; j2++) {
                    pi[i2][j2] = tmin[j2];
                }
            }

        }

        else if(sum==sumMin) {
            for (int i3 = 0; i3 < pi.length; i3++) {
                for (int j3 = 0; j3 < pi[i3].length; j3++) {
                    pi[i3][j3] = tmax[j3];
                }

            }
        }


    }*/

    }


    public static int Menshe(int[][] men) {                     //Найти строку с наименьшей суммой элементов
        int sum = 0, sumMin = sum, sumMax = sum;


        for (int i = 0; i < men.length; i++) {
            for (int j = 0; j < men[i].length; j++) {
                sum += men[i][j];
            }
            if (sum > sumMax) sumMax = sum;

            else if (sum < sumMin) sumMin = sum;

            sum = 0;
        }
        return sumMin;
    }

    public static int bolshe(int[][] bol) {                    //Найти строку с наибольшей суммой элементов
        int sum = 0, sumMin = sum, sumMax = sum;


        for (int i = 0; i < bol.length; i++) {
            for (int j = 0; j < bol[i].length; j++) {
                sum += bol[i][j];
            }
            if (sum > sumMax) sumMax = sum;

            else if (sum < sumMin) sumMin = sum;

            sum = 0;
        }
        return sumMax;


    }

    public static void showM(int[][] pi) {                       //vivod massiva na ekran

        for (int i = 0; i < pi.length; i++) {
            for (int j = 0; j < pi[i].length; j++) {
                System.out.print(pi[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void zam(int[][] za) {                         //Поменять местами max i min
        int temp = max(za);
        int temp1 = min(za);
        for (int i = 0; i < za.length; i++) {
            for (int j = 0; j < za[i].length; j++) {
                if (za[i][j] == max(za))
                    za[i][j] = temp1;
                else if (za[i][j] == min(za))
                    za[i][j] = temp;
            }
        }

    }

    public static int max(int[][] zu) {                         //Найти максимальное число в многомерном массиве
        int max = zu[0][0];
        for (int i = 0; i < zu.length; i++) {
            for (int j = 0; j < zu[i].length; j++) {
                if (zu[i][j] > max)
                    max = zu[i][j];
            }
        }
        return max;
    }

    public static int min(int[][] zp) {                         //Найти минимальное число в многомерном массиве
        int min = zp[0][0];
        for (int i = 0; i < zp.length; i++) {
            for (int j = 0; j < zp[i].length; j++) {
                if (zp[i][j] < min)
                    min = zp[i][j];
            }
        }
        return min;
    }

    private static void umnozh(int[][] arr1, int[][] arr2) {       //  Перемножить два многомерных массива
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        showM(arr1);
    }

    public static void inv(int[][] lop) {                          //Инвертировать многомерный массив
        for (int i = 0; i < lop.length; i++) {
            for (int j = 0; j < lop[i].length; j++) {


                if (j > lop[i].length / 2 && i >= lop.length / 2) {
                    break;
                } else {
                    int temp = lop[i][j];
                    lop[i][j] = lop[lop.length - i - 1][lop[i].length - j - 1];
                    lop[lop.length - i - 1][lop[i].length - j - 1] = temp;
                }
            }
            System.out.println();
        }
        for (int i2 = 0; i2 < lop.length; i2++) {
            for (int j2 = 0; j2 < lop[i2].length; j2++) {
                if (j2 >= lop[i2].length / 2 && i2 < lop.length / 2) {
                    int temp = lop[i2][j2];
                    lop[i2][j2] = lop[lop.length - i2 - 1][lop[i2].length - j2 - 1];
                    lop[lop.length - i2 - 1][lop[i2].length - j2 - 1] = temp;
                }

            }
        }showM(lop);
    }


    public static void sort(int[][] sor) {
        for (int i = 0; i < sor.length; i++) {
            for (int j = 0; j < sor[i].length-1; j++) {
                for (int f = j+1; f < sor[i].length; f++) {

                    if (sor[i][j] > sor[i][f]) {
                        int t = sor[i][j];
                        sor[i][j] = sor[i][f];
                        sor[i][f] = t;

                    }
                }
            }

        }showM(sor);
    }
}
