package work.oop.company.factory;

import work.oop.company.Empleey;

import java.io.InputStreamReader;
import java.io.*;
import java.util.ArrayList;

/**
 * Created by Александра on 02.05.2015.
 */
public class FactoryCar {


        public static void main(String args[]) throws IOException
        {
//Создатель BufferedReader, используя System.in
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Создать сотрудника? да или нет");
            String vibor = new String();
            if (vibor.equals("да")){

            System.out.println("Какой тип сотрудников вы хотите добавить?\nесли программиста введите: '1'\nесли менеджера введите: '2'\nесли администратора введите: '3'.");
                    String emp = new String();
                if(emp.equals("1")){
                    for (int i = 0; i < 10; i++) {
                        System.out.println(1+1);
                    }
                }


            System.out.println("\nВот ваш файл:");
//отобразить строки

        }
            else if(vibor.equals("нет"))
            { System.out.println("Вы отказались создать нового сотрудника");}
    }}

