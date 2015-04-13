package Homework;

/**
 * Created by Дима on 13.04.2015.
 */
public class FortuneTickets {
    public static void main(String[] args) {
        int x = 999999, quantity = 0, number1, number2, number3, number4, number5, number6;
        while (x >= 0) {
            x--;
            number1 = x / 1000000;
            number2 = x % 1000000 / 100000;
            number3 = x % 1000000 % 100000 / 10000;
            number4 = x % 1000000 % 100000 % 10000 / 1000;
            number5 = x % 1000000 % 100000 % 10000 % 1000 / 100;
            number6 = x % 1000000 % 100000 % 10000 % 1000 % 100 / 10;
            if (number1 + number2 + number3 == number4 + number5 + number6){
                ++quantity;
            }
        }
        System.out.println(quantity);


    }
}
