package work.oop.words;

import java.io.*;
import java.util.ArrayList;

/*
  С консоли вводятся слова. Как только ввелось слова SAVE все предидущие слова сохраняются в файл.
 Если ввелось слово LOAD, то все слова загружаются в консоль из файла.
 */
public class InOutWords {
    public static void main(String[] args) throws IOException{

        File file = new File("D:\\InOutWords.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите текст: \nдля записи текста в файл введите - save\nдля вывода текста в консоль введите - load");
        for (int i = 1; i > 0; i++) {
            str = br.readLine();
            if (str.equals("save"))
                break;
            writer.write(str + '\n');
            if (str.equals("load")) {
                System.out.println("\n++++++++ Вывод содержания файла ++++++++");
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String fileLine;
                while ((fileLine = bufferedReader.readLine()) != null) {
                    System.out.println(fileLine);
                }
                break;
            }
        }
        writer.flush();
        writer.close();
    }

}

