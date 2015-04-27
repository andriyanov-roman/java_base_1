package OOP;

import java.util.Scanner;

public class Reader {
    String temp;
    public void Scan() {
        System.out.println("Введите информацию: ");
        Scanner scn = new Scanner(System.in);
        temp = scn.nextLine();

    }
}
