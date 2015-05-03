package HTask.companyAvto;

import sun.util.resources.LocaleData;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by ≈вгений on 03.05.15.
 */
public class Avto {
    private String nameAvto;
    private String typeAvto;
    private String holder; //owner
    private String numberAvto;
    private String colorAvto;
    private String factoryName;
    private String performence;
    private String descAvto;
    //private Date date_of_day;
    private LocaleData date_of_day;

    public void scanOrder(){
        System.out.println("¬ведите своЄ им€: ");
        Scanner clnName = new Scanner(System.in);
        holder = clnName.nextLine();

        System.out.println("¬ведите цвет будущей машины: ");
        Scanner color = new Scanner(System.in);
        colorAvto = color.nextLine();

        System.out.println("¬ведите тип будущей машины: ");
        Scanner type = new Scanner(System.in);
        typeAvto = type.nextLine();


        //Scanner date = new Scanner(System.in);
        date_of_day = LocalData.now();
        //LocaleData date_of_day = LocaleData.out();
        LocalDate date = LocalDate.now();
        System.out.print(date);
    }
}
