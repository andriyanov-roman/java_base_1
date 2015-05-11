package work.oop.factory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * класс производство
 */
public class Production {
    public static void main(String[] args) throws IOException {

        functionSelection();

    }

    public static void functionSelection() throws IOException {
        System.out.println("Выберите операцию: \nдля производство авто введите - 1\nдля вывода ранее созданых авто введите - 2 ");
       // System.out.println("вернуть количество произведенных машин за интервал времени - 3");
        System.out.println("найти самую дорогую машину - 4\nнайти машины одного цвета - 5");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp;
        temp = br.readLine();
        for (; ; ) {
            if (temp.equals("1")) {
                writeCars(newCar());
                break;
            }
            if (temp.equals("2")) {
                printCar();
                break;
            }
            if (temp.equals("3")) {
                break;
            }
            if (temp.equals("4")) {
                getMaxPriseCar(getArrayCar());
                break;
            }
            if (temp.equals("5")) {
                getSameColorCar(getArrayCar());
                break;
            }
        }
    }

    public static ArrayList<Avto> newCar() throws IOException {

        ArrayList<Avto> newAvto = new ArrayList<Avto>();
        Avto avto = new Avto();
        avto.setNameFactory("Avto-ZAZ");
        avto.setName("Ford");
        avto.setDescription("good car");
        avto.setReady("yes");
        newAvto.add(avto);
        return newAvto;
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

    public static ArrayList<Avto> getArrayCar() throws IOException {
        File f = new File("vitalik\\resources\\NewCars.txt");
        FileReader reader = new FileReader(f);
        BufferedReader buffer = new BufferedReader(reader);
        ArrayList<Avto> cars = new ArrayList<Avto>();
        while (buffer.readLine() != null) {
            String arr[] = buffer.readLine().split(":");
            Avto avto = new Avto();
            avto.setNameFactory(arr[0]);
            avto.setName(arr[1]);
            avto.setDescription(arr[2]);
            avto.setReady(arr[3]);
            avto.setProprietor(arr[4]);
            avto.setColor(arr[5]);
            avto.setStyle(arr[6]);
            avto.setNumber(Integer.parseInt(arr[7]));
            avto.setPrice(Integer.parseInt(arr[8]));
            cars.add(avto);
        }
        return cars;
    }

    public static void getSameColorCar(ArrayList<Avto> cars) {
        System.out.println("\nАвтомобили с одинаковым цветом:");
        for (int i = 0; i < cars.size(); i++) {
            for (int j = i + 1; j < cars.size(); j++) {
                if (cars.get(i).getColor().equals(cars.get(j).getColor())) {
                    Avto a = cars.get(i);
                    System.out.println("Автомобиль " + a.getName() + "-" + a.getStyle() + " с гос. номером: " + a.getNumber() + " " + a.getColor() + " цвета");
//                    Avto b = cars.get(j);
//                    System.out.println("Автомобиль " + b.getName() + "-" + b.getStyle() + " с гос. номером: " + b.getNumber() + " " + b.getColor() + " цвета");
                }
            }
        }
    }

    public static void getMaxPriseCar(ArrayList<Avto> cars) {
        System.out.print("\nСамое дорогое авто: ");
        int max = 0;
        int temp = 0;
        for (int i = 0; i < cars.size(); i++) {

            if (cars.get(i).getPrice() > max) {
                max = cars.get(i).getPrice();
                temp = i;
            }
        }
        Avto a = cars.get(temp);
        System.out.println(a.getName() + "-" + a.getStyle() + " " + a.getColor() + " цвета, с гос. номером: " + a.getNumber() + " цена: " + a.getPrice());
    }


    public static void writeCars(ArrayList<Avto> cars) throws IOException {
        File file = new File("vitalik\\resources\\NewCars.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        LocalDate date = LocalDate.now();
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
                        writer.write(": " + str);
                        System.out.println("Введите цену авто:");
                        if ((str = br.readLine()) != null) {
                            writer.write(":" + str);
                            writer.write(":" + date + '\n');
                        }
                        writer.flush();
                        writer.close();
                    }
                }
            }
        }
    }
}