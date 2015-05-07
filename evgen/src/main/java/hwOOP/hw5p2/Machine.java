package hwOOP.hw5p2;

import javax.crypto.Mac;
import java.io.*;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
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
    private String month;


    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

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
        writer.write(customerName + ':' + color + ':' + type + ':' + number + ':' + date + ':' + (int)(Math.random()*10000) + '\n');
        writer.flush();
        writer.close();
    }

    public void readOrder(File file) throws IOException {
        System.out.println("------------------------------------");
        System.out.print("Предыдущие заказы: " + '\n');
        BufferedReader br = new BufferedReader(new FileReader(file));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
    }

    public void getMonthOrderList() throws ParseException, IOException {
        Scanner scanner = new Scanner(new File("./evgen/src/main/java/hwOOP/hw5p2/FactoryDataBase.txt"));
        System.out.println("Введите дату для поиска(в формате гггг-мм-чч): ");
        Scanner scnType = new Scanner(System.in);
        month = scnType.nextLine();
        int count = 0;
        while (scanner.hasNextLine()) {
            Scanner scanner2 = new Scanner(scanner.nextLine());
            while (scanner2.hasNext()) {
                String s = scanner2.next();
                if (s.equalsIgnoreCase(month)) {
                    count = count + 1;
                }
            }
        }
        System.out.println("В этот день было произведено " + count + " машин(а, ы)!");
    }

    public static ArrayList<Machine> getFiguresFromFile() throws IOException {
        //File f = new File("./evgen/src/main/java/hwOOP/hw5p2/FactoryDataBase.txt");
        FileReader reader = new FileReader("./evgen/src/main/java/hwOOP/hw5p2/FactoryDataBase.txt");
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Machine> machines = new ArrayList<Machine>();
        String line;
        while (buffer.readLine() != null) {
            String[] pool = buffer.readLine().split(":");
            if("Евгений".equals(pool[0])) {
                Machine m = new Machine();
                m.setCarName(pool[1]);
                m.setPrice(Integer.parseInt(pool[5]));
                machines.add(m);
            }
        }
        System.out.println(machines.toString());
        //System.out.println(machines);
        return machines;
    }


}
