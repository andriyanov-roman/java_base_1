import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class Hw7file {
    public static void main(String[] args) throws FileNotFoundException {

        Start();


    }

    public static void Start(){

        Scanner input = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<String>();
        String t;
        String fileName = "E://a.txt";


        do{
            System.out.print("VVedite slovo: ");
            t= input.nextLine();

            if (t.equals("SAVE") || t.equals("LOAD")){
                if (t.equals("SAVE")){
                    write(fileName, List);
                }
                else    for (int i = 0; i < List.size(); i++) {
                    System.out.print(List.get(i) + " ");
                }
                System.out.println();
            }

            else List.add(t);
        } while(t.equals("SAVE") || !t.equals("LOAD"));
    }

    public static void write(String fileName, ArrayList<String> t ) {
        //���������� ����
        File file = new File(fileName);

        try {
            //���������, ��� ���� ���� �� ���������� �� ������� ���
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter ��������� ����������� ������ � ����
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //���������� ����� � ����
                out.print(t);
            } finally {
                //����� ���� �� ������ ������� ����
                //����� ���� �� ���������
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

	/*public static String read(String fileName) throws FileNotFoundException {
	    //���� ����. ������ ��� ���������� ������
	    StringBuilder sb = new StringBuilder();

	    exists(fileName);

	    try {
	        //������ ��� ������ ����� � �����
	        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
	        try {
	            //� ����� ��������� ��������� ����
	            String s;
	            while ((s = in.readLine()) != null) {
	                sb.append(s);
	                sb.append("\n");
	            }
	        } finally {
	            //����� �� �������� ������� ����
	            in.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }

	    //���������� ���������� ����� � �����
	    return sb.toString();
	}*/

}
