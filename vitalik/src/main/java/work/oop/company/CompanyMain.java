package work.oop.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Класс компания методы
 */
public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();
       company.setName("NATO");


        company.getAdmin().addAll(Arrays.asList(a1, a2, a3));
        company.getManager().addAll(Arrays.asList(m1, m2, m3));
        company.getProgrammer().addAll(Arrays.asList(p1, p2, p3, p4));




    }


}
