package HTask.companyAvto;

import sun.util.resources.LocaleData;

import java.io.*;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;

/**
 * Created by ������� on 03.05.15.
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
    private LocalDate date_of_day;

    public void regOrder() {
        System.out.println("������� ��� ���: ");
        Scanner ordName = new Scanner(System.in);
        holder = ordName.nextLine();

        System.out.println("������� ���� ������� ������: ");
        Scanner ordColor = new Scanner(System.in);
        colorAvto = ordColor.nextLine();

        System.out.println("������� ��� ������� ������: ");
        Scanner ordType = new Scanner(System.in);
        typeAvto = ordType.nextLine();


        Scanner ordDate = new Scanner(System.in);
        date_of_day = LocalDate.now();

        System.out.println();
        System.out.println("��� ����� ������.");
        System.out.println("���������� ����������, �������� " + holder + ", �������������. ���������� ��������� ���������:");
        System.out.println("����:" + colorAvto);
        System.out.println("��� ����������:" + typeAvto);
        System.out.println("����� ��������" + date_of_day);
    }

    public void saveOrder(File file) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write("��������: " + holder + '\n');
        writer.write("�������� ����������: " + nameAvto + '\n');
        writer.write("��� ����������: " + typeAvto + '\n');
        writer.write("����� ����������: " + numberAvto + '\n');
        writer.write("���� ����������: " + colorAvto + '\n');
        writer.write("����� ������������� ����������: " + factoryName + '\n');
        writer.write("���������� ������: " + performence + '\n');
        writer.write("�������� ����������: " + descAvto + '\n');
        writer.write("���� �������� ����������: " + date_of_day + '\n' + '\n');
        writer.flush();
        writer.close();
    }

    public void scanOrder(File file) throws IOException {
        System.out.println("------------------------------------");
        System.out.print("������: ");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null) {
            System.out.println(sCurrentLine);
        }
    }
}
