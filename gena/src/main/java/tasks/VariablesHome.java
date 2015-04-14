package tasks;

/**
 * Created by sigen on 4/5/2015.
 */
public class VariablesHome {
    public static void main(String[] args) {
        byte c = 4 + 6;
        short b = 60 - 30;
        int a = 10 / 5;
        long d = 4 * 12;

        // Передать переменной типа byte результат сложения двух переменных типа byte
        byte s2 = (byte) (c + c);  // при сложении без конвертации выдает ошибку Incompatible Types
        System.out.println("Переменная byte, полученная при сложении двух byte: " + s2);

        //Передать переменной типа byte результат суммы двух переменных типа short , деленных на третью переменную типа byte
        s2 = (byte) ((b + b) / c);
        System.out.println("Переменная byte, полученная при сложении двух short , деленных на третью переменную типа byte: " + s2);

        //Переменной типа int передать результат деления двух short , умноженных на результат деления двух byte
        short s = 3;
        a = (int) ((b / s) * (s2 / c));
        System.out.println("Перемення типа int, полученная как результат деления двух short , умноженных на результат деления двух byte:  " + a);

        //Поменять значения двух целочисленных переменных используя третью
        int a1 = 3;
        int a2 = 2;
        System.out.println("\nДо изменения значений\n" + "a1 = " + a1 + "\na2 = " + a2);
        int c1 = a1;
        a1 = a2;
        a2 = c1;
        System.out.println("После зименения значений\n" + "a1 = " + a1 + "\na2 = " + a2);

        //Поменять значения двух переменных без использования третьей
        int a3 = 3;
        int a4 = 2;
        System.out.println("\nДо изменения значений\n" + "a3 = " + a3 + "\na4 = " + a4);
        a3 = a3 + a4;
        a4 = a3 - a4;
        a3 = a3 - a4;
        System.out.println("После зименения значений\n" + "a3 = " + a3 + "\na4 = " + a4);
    }
}
