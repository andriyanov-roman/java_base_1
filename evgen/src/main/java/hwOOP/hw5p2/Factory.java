
package hwOOP.hw5p2;

import java.io.*;
import java.time.LocalDate;

public class Factory {
    public static void main(String[] args) throws IOException, InterruptedException {

        LocalDate date = LocalDate.of(1992, 2, 23);
        System.out.println(date);

        File dataBase = new File("./evgen/src/main/java/hwOOP/hw5p2/FactoryDataBase.txt");

        Machine m1 = new Machine();

        m1.scanOrder();

        m1.writeOrder(dataBase);

        m1.readOrder(dataBase);
    }
}

