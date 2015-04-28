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
        //Определяем файл
        File file = new File(fileName);

        try {
            //проверяем, что если файл не существует то создаем его
            if(!file.exists()){
                file.createNewFile();
            }

            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try {
                //Записываем текст у файл
                out.print(t);
            } finally {
                //После чего мы должны закрыть файл
                //Иначе файл не запишется
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }

	/*public static String read(String fileName) throws FileNotFoundException {
	    //Этот спец. объект для построения строки
	    StringBuilder sb = new StringBuilder();

	    exists(fileName);

	    try {
	        //Объект для чтения файла в буфер
	        BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
	        try {
	            //В цикле построчно считываем файл
	            String s;
	            while ((s = in.readLine()) != null) {
	                sb.append(s);
	                sb.append("\n");
	            }
	        } finally {
	            //Также не забываем закрыть файл
	            in.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }

	    //Возвращаем полученный текст с файла
	    return sb.toString();
	}*/

}
