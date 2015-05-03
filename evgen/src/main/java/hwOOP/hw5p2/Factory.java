
package hwOOP.hw5p2;

import java.io.*;

public class Factory {
    public static void main(String[] args) throws IOException, InterruptedException {

        File dataBase = new File("./evgen/src/main/java/hwOOP/hw5p2/FactoryDataBase.txt");

        Machine m1 = new Machine();

        m1.scanOrder();

        m1.writeOrder(dataBase);

        m1.readOrder(dataBase);
    }
}

