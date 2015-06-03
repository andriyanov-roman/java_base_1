package oop.readers;
import java.io.*;
/**
 * Created by sigen on 5/12/2015.
 */
public class Container {
    static File f = new File("gena\\test.txt");
    public static void main(String[] args) throws Exception{
        SqarePrinter sqPrinter = new SqarePrinter(f);
        sqPrinter.readToConsole();

        StaresPrinter stPrinter = new StaresPrinter(f);
        //stPrinter.readToConsole();
    }

}
