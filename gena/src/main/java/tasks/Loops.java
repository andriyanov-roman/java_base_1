package tasks;

/**
 * Created by sigen on 4/12/2015.
 */
public class Loops {
    static void ShowLoop(int start, int step, int finish, int number) {
        if (number == 0) {

            if (finish != 0) {
                for (int i = start; i < finish; i += step) {
                    System.out.println(i);
                }
            } else {
                for (int i = start; i > finish; i += step) {
                    System.out.println(i);
                }
            }
        } else {
            int count = 0;
            int i = start;
            if (finish != 0) {
                while ((count <= number) && (i < finish)) {
                    System.out.println(i);
                    count++;
                    i += step;
                }
            } else {
                while ((count <= number) && (i > finish)) {
                    System.out.println(i);
                    count++;
                    i += step;
                }

            }
        }

    }

    static void Task4(int start, int number) {
        for (int i = 1; i <= number; i++) {
            start *= 2;
            System.out.println(start);
        }
    }

    static void Factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }

    static void Fibonacci(int number){
        int fib = 1;
        int pastfib = 1;
        int sum = 0;
        System.out.println(fib + "\n"+pastfib);
        for (int i = 1; i<number; i++){
            sum = fib + pastfib;
            pastfib = fib;
            fib = sum;
            System.out.println(fib);
        }
    }

    static void Avarage(int array[]){
        int sum = 0;
        for (int i =0; i<=array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum/array.length);
    }

    static void Devider(int number){
        for (int i =1; i<=number;i++){
            if(number%i==0){
                System.out.println(i);
            }
        }
    }

    static void Deviders(int number1, int number2){
        int max = number1;
        if (number2>max){
            max = number2;
        }
        for(int i = 1; i<max;i++){
            if((number1%i==0)&&(number2%i==0)){
                System.out.println(i);
            }
        }
    }

    static void Clock(){
        int count = 0;
        for(int h =0; h<=2; h++){
            for(int hh = 0; hh<=9; hh++){
                if((h==2)&&(hh==4)){
                    break;
                }
                for(int m = 0;m<=5;m++ ){
                    for(int mm= 0;mm<=9;mm++){
                        if((h==mm)&&(hh==m)){
                            System.out.println(h+""+hh+":"+m+""+mm);
                            count++;
                        }
                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        ShowLoop(1000, 3, 10000, 0);  //Task 1
        ShowLoop(1, 2, 10000, 55);    //Task 2
        ShowLoop(90,-15,0,0);         //Task 3
        Task4(1,20);                  //Task 4
        Factorial(4);                 //Task 5, факториал 4, например)
        Fibonacci(10);                //Task 6
        Clock();                        //Задание с часами
        Devider(12);
        Deviders(12,24);
    }
}
