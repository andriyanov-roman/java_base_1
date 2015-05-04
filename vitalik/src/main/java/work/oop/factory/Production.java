package work.oop.factory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * класс производство
 */
public class Production {
    public static void main(String[] args) throws IOException {
        ArrayList<Avto> newCar = new ArrayList<Avto>();
        FactoryCars nameFactory = new FactoryCars();
        nameFactory.setNameFactory("Avto-ZAZ");
        Avto avto = new Avto();
        avto.setName("Ford");
        avto.setPrice(20000);
        avto.setReady("yes");
        LocalDate date = LocalDate.now();
        newCar.add(avto);

        File file = new File("vitalik\\resources\\NewCars.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String temp;

        System.out.println("Выберите операцию: \nдля производство авто введите - 1\nдля вывода ранее созданых авто введите - 2 ");
        for (; ; ) {

            temp = br.readLine();


            if (temp.equals("1")) {

                System.out.println("Введите имя заказщика:");
                if ((str = br.readLine()) != null) {
                    writer.write("Владелец автомобиля: " + str + " марка: " + avto.getName());


                    writer.write("    стоимость: " + avto.getPrice() + " $");
                    writer.write("    готовность: " + avto.getReady());
                    writer.write("    произведен на заводе: " + nameFactory.getNameFactory());


                    System.out.println("Введите цвет авто:");
                    if ((str = br.readLine()) != null) {
                        writer.write("    цвет: " + str);


                        System.out.println("Введите тип авто:");
                        if ((str = br.readLine()) != null) {
                            writer.write("    тип: " + str);


                            System.out.println("Введите номер авто:");
                            if ((str = br.readLine()) != null) {
                                writer.write("    номер авто: " + str);
                                writer.write("    дата производства: " + date + '\n');


                            }
                            writer.flush();
                            writer.close();
                            break;
                        }
                    }
                }else System.out.println("++++++++++++++");
            }
            if (temp.equals("2")) {
                System.out.println("\nАвтомобили построенные на заводе:");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String fileLine;
                while ((fileLine = bufferedReader.readLine()) != null) {
                    System.out.println(fileLine);
                }
                break;
            }
            writer.close();
        }
    }
}