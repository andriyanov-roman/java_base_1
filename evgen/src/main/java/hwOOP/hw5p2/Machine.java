package hwOOP.hw5p2;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by Евгений on 02.05.2015.
 */
public class Machine {
    private String carName;
    private String customerName;
    private String type;
    private String owner;
    private String number;
    private String color;
    private String factoryName;
    private String status;
    private String description;
    private int price;
    private LocalDate date;

    public void scanOrder() {

        System.out.println("Введите свое имя: ");
        Scanner scnName = new Scanner(System.in);
        customerName = scnName.nextLine();

        System.out.println("Введите желаемый цвет машины: ");
        Scanner scnSurname = new Scanner(System.in);
        color = scnSurname.nextLine();

        System.out.println("Введите желаемый тип машины: ");
        Scanner scnType = new Scanner(System.in);
        type = scnType.nextLine();

        System.out.println("Введите желаемый номер машины: ");
        Scanner scnNumber = new Scanner(System.in);
        number = scnNumber.nextLine();

        //System.out.println("Введите дату построения машины: ");
        Scanner scnDate = new Scanner(System.in);
        //date = LocalDate.parse(scnDate.nextLine());
        date = LocalDate.now();

        System.out.println();
        System.out.println("Спасибо за Ваш заказ! Осуществляем построение машины...");
        System.out.println("Машина построена! Поздравляем счастливого обладателя новой машины!");

    }

    public void writeOrder(File file) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write("Имя заказчика: " + customerName + '\n');
        writer.write("Желаемый цвет машины: " + color + '\n');
        writer.write("Желаемый тип машины: " + type + '\n');
        writer.write("Желаемый номер машины: " + number + '\n');
        writer.write("Дата построения машины: " + date + '\n' + '\n');
        writer.flush();
        writer.close();
    }

    /*public void readOrder(File file) throws IOException {
        System.out.println("------------------------------------");
        System.out.println("Предыдущие заказы: ");
        System.out.println();
        FileReader reader = new FileReader(file);
        int r;
        while ((r = reader.read()) != -1) {
            char c = (char)r;
            System.out.print(c);
        }
    }*/

    public void readOrder(File file) throws IOException {
        System.out.println("------------------------------------");
        System.out.print("Предыдущие заказы: ");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
    }


}
