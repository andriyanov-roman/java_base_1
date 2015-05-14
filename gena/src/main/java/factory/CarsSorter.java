package factory;

import java.io.File;

/**
 * Created by user on 5/12/2015.
 */
public class CarsSorter {
    public static void main(String[] args) throws Exception {
        System.out.println(Face.readFromFile(new File("gena\\cars.txt")));
    }
}
