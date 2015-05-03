package HTask.companyAvto;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Created by Евгений on 03.05.15.
 */
public class Company {
        public static void main(String[] args) throws IOException, InterruptedException {

            LocalDate date = LocalDate.of(1992, 2, 23);
            System.out.println(date);

            File dataBase = new File("./evgeniy/src/main/java/HTask/companyAvto/ordersDataBase.txt");

            Avto a1 = new Avto();

            a1.regOrder();

            a1.saveOrder(dataBase);

            a1.scanOrder(dataBase);
        }
    }

