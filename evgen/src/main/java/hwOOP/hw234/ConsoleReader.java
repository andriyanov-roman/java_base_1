package hwOOP.hw234;

import java.util.Scanner;

public class ConsoleReader {
    private String name;
    private String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void Scan() {

        System.out.println("Введите имя сотрудника: ");
        Scanner scnName = new Scanner(System.in);
        name = scnName.nextLine();

        System.out.println("Введите фамилию сотрудника: ");
        Scanner scnSurname = new Scanner(System.in);
        surName = scnSurname.nextLine();

    }
}
