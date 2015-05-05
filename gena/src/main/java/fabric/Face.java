package fabric;


import java.io.*;

import java.util.*;
import java.text.*;

/**
 * Created by sigen on 5/5/2015.
 */
public class Face {
    public static void main(String[] args) throws Exception {

        File f = new File("gena\\cars.txt");
        Scanner in = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>(readFromFile(f));

        ask(f,in,cars);



    }

    public static void fillFile(File f) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Set customer name: ");
        String customerName = in.nextLine();
        System.out.print("Set customer secondName: ");
        String customerSecondName = in.nextLine();
        System.out.print("Enter customer Id: ");
        int id = Integer.parseInt(in.nextLine());
        System.out.print("Enter car name: ");
        String name = in.nextLine();
        System.out.print("Enter car type: ");
        String type = in.nextLine();
        System.out.print("Enter car colour: ");
        String colour = in.nextLine();
        System.out.print("Enter car fabric: ");
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
                cost + ", " + customerName + ", " + " " + customerSecondName + ", " + id + ", " +
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
                        Car max = getMaxCost(list);
                        System.out.print("\nThe most expensive car is ");
                        System.out.print(max.getFabricName() + " " + max.getName() + " " + max.getCost());
                        System.out.println('\n');
                        ask(f, in, list);

                    case 2:
                        System.out.print("Enter start date: ");
                        String start = in.nextLine();
                        System.out.print("Enter end date: ");
                        String end = in.nextLine();
                        betweenTheDates(list, start, end);
                        ask(f, in, list);
                    case 3:
                        System.out.print("Enter colour: ");
                        String colour = in.nextLine();
                        findSameColour(list, colour);
                        ask(f, in, list);

                }
            case 3: System.exit(0);
        }

    }

    public static ArrayList<Car> readFromFile(File f) throws Exception {
        ArrayList<Car> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(f));
        String current;
        while ((current = br.readLine()) != null) {
            String[] strings = current.split(", ");

            double cost = Double.parseDouble(strings[6]);

            int id = Integer.parseInt(strings[9]);

            DateFormat format = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
            Date date = format.parse(strings[3]);
            boolean ready = true;
            if (strings[5].equals("False")) {
                ready = false;
            }
            list.add(new Car(strings[0], strings[1], strings[2], date, strings[4], ready, cost, strings[7], strings[8], id, strings[10], strings[11]));
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


}