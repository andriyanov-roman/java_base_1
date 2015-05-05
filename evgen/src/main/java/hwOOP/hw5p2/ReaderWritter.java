package hwOOP.hw5p2;

import java.io.*;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Евгений on 02.05.2015.
 */
public class ReaderWritter {
    /*public static void main(String[] args) throws FileNotFoundException
    {
        int k = 50, i = 0;
        String[] s = new String[k];
        Scanner in = new Scanner(new File("./evgen/src/main/java/hwOOP/hw5p2/FactoryDataBase.txt"));
        while(in.hasNext())
        {
            s[i] = in.nextLine() + "\r\n";
            System.out.println(s[i]);
            i++;
        }
        in.close();
    }*/
        public static void main(String[] args) throws ParseException {
            Calendar cal = Calendar.getInstance();
            Date d = cal.getTime();
            print(d);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            print(d.compareTo(sdf.parse("11111111")));
            print(sdf.parse("11111111"));
            print(d.compareTo(sdf.parse("22211222")));
            print(sdf.parse("22211222"));
            print(d.compareTo(cal.getTime()));
        }

        static void print(Object o) {
            System.out.println(o.toString());
        }

}
