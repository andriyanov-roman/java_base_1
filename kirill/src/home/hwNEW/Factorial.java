//	—оздайте программу, вычисл€ющую факториал натурального числа n

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        int n,x;
        Scanner input = new Scanner(System.in);

        System.out.println("VVedite n:");
        n = input.nextInt();
        if(n>0){
            x=n;
            while (n!=1){
                x=x*(n-1);
                n--;
            }
            System.out.println(x);}
        else System.out.println("Tolko N chisla!");
    }}

