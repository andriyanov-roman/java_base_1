package work.Cycle;

/**
 * Циклы сложные
 */
public class HomeWork2 {
    public static void main(String[] args) {

        /* Есть билеты с номерами от 000001 до 999999.
 «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
  как, например, в билетах с номерами 003102 или 567576.
   С помощью программы, подсчитайте сколько счастливых билетов */

        int col = 0;
        for (int i1 = 0; i1 < 10; i1++) {
            for (int i2 = 0; i2 < 10; i2++) {
                for (int i3 = 0; i3 < 10; i3++) {
                    for (int i4 = 0; i4 < 10; i4++) {
                        for (int i5 = 0; i5 < 10; i5++) {
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (i1 + i2 + i3 == i4 + i5 + i6) {
                                   // System.out.println();
                                   // System.out.print("Счастливые билетики: " + i1 + i2 + i3 + i4 + i5 + i6);
                                    col++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.print("Колличество счастливых билетиков: " + col);
        System.out.println();

/* Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
 симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51). */

       // System.out.println("Симметрические комбинации: ");
        int sim = 0;
        for (int y2 = 0; y2 <= 9; y2++) {
            for (int y1 = 0; y1 <= 9; y1++) {
                for (int x2 = 0; x2 <= 5; x2++) {
                    for (int x1 = 0; x1 <= 2; x1++) {
                        if (x1 == y2 && x2 == y1) {
                            sim++;
                            // System.out.println(x1 + "" + y1 + ":" + x2 + "" + y2);
                        }
                    }
                }
            }
        }
        System.out.println("Колличество симметрических комбинаций: " + sim);

//Есть 999999 номерных знаков, подсчитать количество знаков содержащих число 13 и вывести их все в консоль

        System.out.println("Номерные знаки содержащие число 13: ");
        int col13 = 0;
        for (int i1 = 0; i1 < 10; i1++) {
            for (int i2 = 0; i2 < 10; i2++) {
                if (i1 == 1 && i2 == 3){
                    col13++;}
                for (int i3 = 0; i3 < 10; i3++) {
                    if (i2 == 1 && i3 == 3){
                        col13++;}
                    for (int i4 = 0; i4 < 10; i4++) {
                        if (i3 == 1 && i4 == 3){
                            col13++;}
                        for (int i5 = 0; i5 < 10; i5++) {
                            if (i4 == 1 && i5 == 3){
                                col13++;}
                            for (int i6 = 0; i6 < 10; i6++) {
                                if (i5 == 1 && i6 == 3){
                                    col13++;
                                    System.out.println(" " + i1 + i2 + i3 + i4 + i5 + i6);}
                                }
                            }
                        }
                    }
                }
            }
        System.out.print("Колличество номерных знаков содержащих число 13:  " + col13);
       }
}
