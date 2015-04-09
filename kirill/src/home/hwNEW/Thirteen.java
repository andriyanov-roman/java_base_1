//Есть 999999 номерных знаков, подсчитать количество знаков содержащих число 13 и вывести их все в консоль
public class Thirteen {
    public static void main(String[] args) {
        int x = 999999,
                count = 0,
                digit1,
                digit2,
                digit3,
                digit4,
                digit5,
                digit6;

        while (x >= 0) {
            x--;
            digit1 = x / 1000000;
            digit2 = x % 1000000 / 100000;
            digit3 = x % 1000000 % 100000 / 10000;
            digit4 = x % 1000000 % 100000 % 10000 / 1000;
            digit5 = x % 1000000 % 100000 % 10000 % 1000 / 100;
            digit6 = x % 1000000 % 100000 % 10000 % 1000 % 100 / 10;

            if (digit1 == 1 && digit3 == 1) {                                //исключение повторений из счетчика
                if (digit2 == 3 && digit4 == 3) {
                    count--;
                }
            }
            if (digit1 == 1 && digit5 == 1) {                                //исключение повторений из счетчика
                if (digit2 == 3 && digit6 == 3) {
                    count--;
                }
            }
            if (digit2 == 1 && digit4 == 1) {                                //исключение повторений из счетчика
                if (digit3 == 3 && digit5 == 3) {
                    count--;
                }
            }

            if (digit1 == 1 && digit2 == 3) {                                    //считаем и выводим
                count++;
                System.out.println(x);
            }
            if (digit2 == 1 && digit3 == 3) {
                count++;
                System.out.println(x);
            }
            if (digit3 == 1 && digit4 == 3) {
                count++;
                System.out.println(x);
            }
            if (digit4 == 1 && digit5 == 3) {
                count++;
                System.out.println(x);
            }
            if (digit5 == 1 && digit6 == 3) {
                count++;
                System.out.println(x);
            }


        }
        System.out.printf("Kolichestvo nomerov, kotorie soderzhat \"13\" = " + count);


    }}

