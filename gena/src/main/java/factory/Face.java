package factory;


import java.io.*;

import java.util.*;
import java.text.*;

/**
 * Created by sigen on 5/5/2015.
 */
public class Face {
    public static int CAR_NAME = 0;
    public static int CAR_NUMBER = 1;
    public static int CAR_COLOUR = 2;
    public static int DATE = 3;
    public static int FABRIC = 4;
    public static int READY = 5;
    public static int COST = 6;
    public static int CUSTOMER_NAME = 7;
    public static int CUSTOMER_SECOND_NAME = 8;
    public static int CUSTOMER_ID = 9;
    public static int CAR_TYPE = 10;
    public static int CAR_DESCRIPTION = 11;



    public static void main(String[] args) throws Exception {
        File f = new File("gena\\cars.txt");
        Scanner in = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>(readFromFile(f));
        ask(f, in, cars);
    }

    public static void fillFile(File f) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter car name: ");
        String name = in.nextLine();
        System.out.print("Enter car type: ");
        String type = in.nextLine();
        System.out.print("Enter car colour: ");
        String colour = in.nextLine();
        System.out.print("Enter car factory: ");
        String fabricName = in.nextLine();
        System.out.print("Enter car number: ");
        String number = in.nextLine();
        System.out.print("Is a car ready?: ");
        String ready = in.nextLine();
        System.out.print("Enter car description: ");
        String description = in.nextLine();
        System.out.print("Enter car cost: ");
        String cost = in.nextLine();
        System.out.print("Enter car development date: ");
        String date = in.nextLine();
        FileWriter writer = new FileWriter(f, true);
        writer.write(name + ", " + number + ", " + colour + ", " + date + ", " + fabricName + ", " + ready + ", " +
                cost + ", " + askCustomer(in) + ", " +
                type + ", " + description + "\n");
        writer.flush();
        writer.close();
    }

    public static void ask(File f, Scanner in, ArrayList<Car> list) throws Exception {
        System.out.print("Enter 1 to fill the file \n 2 to do smth with it \n 3 to exit: ");
        int key = Integer.parseInt(in.nextLine());
        switch (key) {
            case 1:
                fillFile(f);
                ask(f, in, list);
            case 2:
                System.out.print("Enter \n 21 to find the most expensive car \n 2 show the cars of period \n 3 to find car of the same colour: ");
                int key2 = Integer.parseInt(in.nextLine());
                switch (key2) {
                    case 1:
                        maxAnswer(f, list, in);
                    case 2:
                        dateAnswer(f, in, list);
                    case 3:
                        colourAnswer(f, in, list);
                }
            case 3:
                System.exit(0);
        }

    }

    public static ArrayList<Car> readFromFile(File f) throws Exception {
        ArrayList<Car> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String current;
        while ((current = br.readLine()) != null) {
            String[] strings = current.split(", ");
            double cost = Double.parseDouble(strings[COST]);
            int id = Integer.parseInt(strings[CUSTOMER_ID]);
            DateFormat format = getDateFormat();
            Date date = format.parse(strings[DATE]);
            boolean ready = true;
            if (strings[5].equals("False")) {
                ready = false;
            }
            list.add(new Car(strings[CAR_NAME], strings[CAR_NUMBER], strings[CAR_COLOUR], date, strings[FABRIC], ready, cost, strings[CUSTOMER_NAME], strings[CUSTOMER_SECOND_NAME], id, strings[CAR_TYPE], strings[CAR_DESCRIPTION]));
        }
        list.trimToSize();
        return list;

    }

    public static Car getMaxCost(ArrayList<Car> list) {
        Car max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCost() > max.getCost()) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static void findSameColour(ArrayList<Car> list, String colour) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getColour().equals(colour)) {
                System.out.println(list.get(i).getFabricName() + " " + list.get(i).getName() + " " + list.get(i).getColour());
            }
        }
    }

    public static void betweenTheDates(ArrayList<Car> list, String start, String end) throws Exception {
        System.out.println("Cars between " + start + " and " + end);

        for (int i = 0; i < list.size(); i++) {
            DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            Date startDate = format.parse(start);
            Date endDate = format.parse(end);
            if (list.get(i).getDate().getTime() < endDate.getTime() && list.get(i).getDate().getTime() > startDate.getTime()) {
                System.out.println(list.get(i).getFabricName() + " " + list.get(i).getName() + " " + list.get(i).getDate());
            }
        }
    }

    public static void maxAnswer(File f, ArrayList<Car> list, Scanner in) throws Exception {
        Car max = getMaxCost(list);
        System.out.print("\nThe most expensive car is ");
        System.out.print(max.getFabricName() + " " + max.getName() + " " + max.getCost());
        System.out.println('\n');
        ask(f, in, list);
    }

    public static void dateAnswer(File f, Scanner in, ArrayList<Car> list) throws Exception {
        System.out.print("Enter start date: ");
        String start = in.nextLine();
        System.out.print("Enter end date: ");
        String end = in.nextLine();
        betweenTheDates(list, start, end);
        ask(f, in, list);
    }

    public static void colourAnswer(File f, Scanner in, ArrayList<Car> list) throws Exception {
        System.out.print("Enter colour: ");
        String colour = in.nextLine();
        findSameColour(list, colour);
        ask(f, in, list);
    }

    public static String askCustomer(Scanner in) throws IOException {
        System.out.print("Set customer name: ");
        String customerName = in.nextLine();
        System.out.print("Set customer secondName: ");
        String customerSecondName = in.nextLine();
        System.out.print("Enter customer Id: ");
        int id = Integer.parseInt(in.nextLine());
        return (customerName + ", " + customerSecondName + ", " + id + ", ");
    }


    public static DateFormat getDateFormat() {
        return new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
    }
}
