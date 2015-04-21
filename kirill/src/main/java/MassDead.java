
public class MassDead {
    public static void main(String[] args) {
        int[][] ms={
            {1,2,4,5,10},
            {4,6,22,12,4},
            {0,13,22,38,42}
        };

        for (int i = 0; i < ms.length; i++) {              //вывести
            for (int j = 0; j < ms[i].length; j++) {
                System.out.print(ms[i][j] + " ");
            }
            System.out.println();}

        for(int o = 0; o < ms.length; o++){                  //вывести в обр сторону строки
            for (int b = ms[o].length-1; b >= 0; b--) {
                    System.out.print(ms[o][b] + " ");
                }
                System.out.println();}


    }
}
