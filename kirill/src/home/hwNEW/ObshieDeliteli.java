
//Выведите на экран общие делители двух натуральных чисел

public class ObshieDeliteli {
    public static void main(String[] args) {
        int n=12, n1=36;



        if (n>0 && n1>0){
            System.out.print("Deliteli: ");

            for(int i=1; i<=n && i<=n1; i++){         //Vrode rabotaet =)
                if ((n%i)==0 && (n1%i)==0){


                    System.out.print(i+"; ");}
            }}


        else System.out.println("Tolko N chisla!");


    }
}
