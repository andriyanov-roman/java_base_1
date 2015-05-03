package HTask.companyAvto;

import sun.util.resources.LocaleData;

import java.io.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * Created by Евгений on 03.05.15.
 */
public class Avto {
    private String nameAvto;
    private String typeAvto;
    private String holder; //owner
    private String numberAvto;
    private String colorAvto;
    private String factoryName;
    private String performence;
    private String descAvto;
    private LocalDate date_of_day;

    public void regOrder() {
        System.out.println("Введите своё имя: ");
        Scanner ordName = new Scanner(System.in);
        holder = ordName.nextLine();

        System.out.println("Введите цвет будущей машины: ");
        Scanner ordColor = new Scanner(System.in);
        colorAvto = ordColor.nextLine();

        System.out.println("Введите тип будущей машины: ");
        Scanner ordType = new Scanner(System.in);
        typeAvto = ordType.nextLine();


        Scanner ordDate = new Scanner(System.in);
        date_of_day = LocalDate.now();

        System.out.println();
        System.out.println("Ваш заказ принят.");
        System.out.println("Заказанный автомобиль, клиентов " + holder + ", спроектирован. Автомобиль следующие параметры:");
        System.out.println("Цвет:" + colorAvto);
        System.out.println("Тип автомобиля:" + typeAvto);
        System.out.println("Заказ выполнен" + date_of_day);
    }

    public void saveOrder(File file) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write("Владелец: " + holder + '\n');
        writer.write("Название автомобиля: " + nameAvto + '\n');
        writer.write("Тип автомобиля: " + typeAvto + '\n');
        writer.write("Номер автомобиля: " + numberAvto + '\n');
        writer.write("Цвет автомобиля: " + colorAvto + '\n');
        writer.write("Завод производитель автомобиля: " + factoryName + '\n');
        writer.write("Выполнение заказа: " + performence + '\n');
        writer.write("Описание автомобиля: " + descAvto + '\n');
        writer.write("Дата создания автомобиля: " + date_of_day + '\n' + '\n');
        writer.flush();
        writer.close();
    }

    public void scanOrder(File file) throws IOException {
        System.out.println("------------------------------------");
        System.out.print("Заказы: ");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
    }
}
