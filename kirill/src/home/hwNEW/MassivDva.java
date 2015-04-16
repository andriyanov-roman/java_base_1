
public class MassivDva {
    public static void main(String[] args){
        int[][] dm=
                {{2,4,1,2,35},
                        {-21,-212,-11,-21,-34},
                        {23,45,56,11,223}};

        showM(dm);
        //  System.out.println(min(dm)+"-Minimum v massive");
        //  System.out.println(max(dm)+"-Maximum v massive");
        zam(dm);
        showM(dm);
        bolsheMenshe(dm);
        showM(dm);
    }



    public static void bolsheMenshe(int[][] bol){                    //Найти строку с наибольшей суммой элементов и с наименьшей
        int sum=0, sumMin=sum, sumMax=sum;


        for (int i = 0; i < bol.length; i++) {
            for (int j = 0; j < bol[i].length; j++) {
                sum+=bol[i][j];
            }
            if (sum>sumMax) sumMax=sum;

            else if(sum<sumMin) sumMin=sum;

            sum=0;
        }
        System.out.print(sumMax+"-sumMax;"+sumMin+"-SumMin") ;
        System.out.println();



    }

    public static void showM(int[][] pi){                       //vivod massiva na ekran

        for (int i = 0; i < pi.length; i++) {
            for (int j = 0; j < pi[i].length; j++) {
                System.out.print(pi[i][j]+", ");
            }
            System.out.println();}
    }

    public static void zam (int[][] za){                         //Поменять местами max i min
        int temp=max(za);
        int temp1=min(za);
        for (int i = 0; i < za.length; i++){
            for (int j = 0; j < za[i].length; j++) {
                if (za[i][j]== max(za))
                    za[i][j]=temp1;
                else  if (za[i][j]== min(za))
                    za[i][j]=temp;
            }
        }

    }

    public static int max (int[][] zu){                         //Найти максимальное и минимальное число в многомерном массиве
        int max=zu[0][0];
        for (int i = 0; i < zu.length; i++){
            for (int j = 0; j < zu[i].length; j++) {
                if (zu[i][j]>max)
                    max=zu[i][j];
            }
        }
        return max;
    }

    public static int min (int[][] zp){                         //Найти максимальное и минимальное число в многомерном массиве
        int min=zp[0][0];
        for (int i = 0; i < zp.length; i++){
            for (int j = 0; j < zp[i].length; j++) {
                if (zp[i][j]<min)
                    min=zp[i][j];
            }
        }
        return min;
    }

}