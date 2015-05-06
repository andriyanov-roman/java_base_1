package work.oop.factory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * класс производство
 */
public class Production {
    public static void main(String[] args) throws IOException {

        writeCars(newCars());
    }

    public static ArrayList<Avto> getMaxPriceCar() throws IOException {
        System.out.println("\nСамая дорогая машина построенные на заводе:");
        File f = new File("vitalik\\resources\\NewCars.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Avto> cars = new ArrayList<Avto>();
        // String line;
        int max = 0;

        for (int i = 0; buffer.readLine() != null; i++) {
            String[] pool = buffer.readLine().split(":");
            Avto car = new Avto();
            car.setName(pool[1]);
            car.setPrice(Integer.parseInt(pool[4]));
            cars.add(car);

//                    if (max < car.getPrice()){
//                        max = car.getPrice();
//
//                    }

        }
        System.out.println(cars);
        return cars;

    }

    public static void printCar() throws IOException {

        System.out.println("\nАвтомобили построенные на заводе:");
        File file = new File("vitalik\\resources\\NewCars.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String fileLine;
        while ((fileLine = bufferedReader.readLine()) != null) {
            System.out.println(fileLine);
        }

    }


    public static ArrayList<Avto> newCars() throws IOException {
        ArrayList<Avto> newCar = new ArrayList<Avto>();
        Avto avto = new Avto();
        avto.setNameFactory("Avto-ZAZ");
        avto.setName("Ford");
        avto.setDescription("good car");
        avto.setReady("yes");
        newCar.add(avto);
        return newCar;
    }

    public static void writeCars(ArrayList<Avto> cars) throws IOException {
        File file = new File("vitalik\\resources\\NewCars.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String temp;
        LocalDate date = LocalDate.now();
        System.out.println("Выберите операцию: \nдля производство авто введите - 1\nдля вывода ранее созданых авто введите - 2 ");
        System.out.println("вернуть количество произведенных машин за интервал времени - 3\nнайти самую дорогую машину - 4 ");
        System.out.println("найти машины одного цвета - 5");
        for (; ; ) {
            temp = br.readLine();
            if (temp.equals("1")) {
                writer.write(cars.toString());
                System.out.println("Введите имя заказщика:");
                if ((str = br.readLine()) != null) {
                    writer.write(":" + str);
                    System.out.println("Выберите цвет авто: \nкрасный   - 1 \nзеленый  - 2 \nчерный  - 3");
                    if ((str = br.readLine()) != null) {
                        if (str.equals("1")) {
                            str = "red";
                        }
                        if (str.equals("2")) {
                            str = "green";
                        }
                        if (str.equals("3")) {
                            str = "black";
                        }
                        writer.write(":" + str);
                        System.out.println("Выберите тип авто:  \n" +
                                "пикап   - 1 \n" +
                                "седан  - 2 \n" +
                                "кабриолет  - 3");
                        if ((str = br.readLine()) != null) {
                            if (str.equals("1")) {
                                str = "pickup";
                            }
                            if (str.equals("2")) {
                                str = "sedan";
                            }
                            if (str.equals("3")) {
                                str = "convertible";
                            }
                            writer.write(":" + str);
                            System.out.println("Введите номер авто:");
                            if ((str = br.readLine()) != null) {
                                writer.write(":" + str);
                                System.out.println("Введите цену авто:");
                                if ((str = br.readLine()) != null) {
                                    writer.write(":" + str);
                                    writer.write(":" + date + '\n');
                                }
                                writer.flush();
                                writer.close();
                                break;
                            }
                        }
                    }
                }
            }
            if (temp.equals("2")) {
                printCar();
                break;
            }
            if (temp.equals("3")) {
                getMaxPriceCar();
                break;
            }
        }
    }

}