package OOP;

import java.util.Scanner;

public class ConsoleReader {
    String name;
    String surName;
    public void Scan() {
        System.out.println("Введите имя сотрудника: ");
        Scanner scnName = new Scanner(System.in);
        name = scnName.nextLine();

        System.out.println("Введите фамилию сотрудника: ");
        Scanner scnSurname = new Scanner(System.in);
        surName = scnSurname.nextLine();

    }
}
