//Выведите на экран все положительные делители натурального числа.
import java.util.Scanner;
public class DeliteliPlusN {
    public static void main(String[] args) {
        int n, count=0;

        Scanner input = new Scanner(System.in);
        System.out.print("VVedite N chislo -");
        n=input.nextInt();

        if (n>0){
            System.out.print("Deliteli:");

            for(int i=1; i<=n; i++){
                if ((n%i)==0){
                    count++;
                    System.out.print(i+"; ");}
            }

            System.out.printf("\nDelitsa na " + count+" chisla");}
        else System.out.printf("Chislo menshe 0 - ERROR");
    }
}
