package work.string;

/**
 * String домашняя работа
 */
public class StringHome {
    public static void main(String[] args) {
        String text;
        text = "One design system goal of Java isi portability, operating arra system of with adequate runnur of system support.";
        System.out.println("Текст: " + text);

////Найти максимальное и минимальное слово и поменять их местами
//
//        chengeWord(text);
//
////Отсортировать по возрастанию
//
//        System.out.println();
//        System.out.print("Отсортированный текст по возростанию: ");
//        sortWord(text);

//Вывести дубликаты и количество повторений

        System.out.println();
        System.out.println("Дубликаты: ");
        iterText (text);

//Найти палиндромы

        System.out.println();
        System.out.print("Слова палиндромы: ");
        polindrom(text);


    }

    /* +++++++++++++++++++++++++++++++ Методы ++++++++++++++++++++++++++++++++++++++ */

    //Найти максимальное и минимальное слово и поменять их местами

    public static void chengeWord(String text) {

        String[] arrWord = text.split("[\\s,.!?]+");
        String maxLetter = arrWord[0];
        String minLetter = arrWord[0];
        int max = 0, min = 0;
        String buf;
        for (int i = 0; i < arrWord.length; i++) {
            if (arrWord[i].length() > maxLetter.length()) {
                maxLetter = arrWord[i];
                max = i;
            } else if (arrWord[i].length() < minLetter.length()) {
                minLetter = arrWord[i];
                min = i;
            }
        }
        buf = arrWord[max];
        arrWord[max] = arrWord[min];
        arrWord[min] = buf;
        System.out.print("Максимальное слово: " + maxLetter);
        System.out.println();
        System.out.print("Минимальное слово: " + minLetter);
        System.out.println();
        System.out.print("Обновленный текст: ");
        for (int i = 0; i < arrWord.length; i++) {
            System.out.print(arrWord[i] + " ");
        }
    }

//Отсортировать по возрастанию

    public static void sortWord(String text) {

        String[] arrWord = text.split("[\\s,.!?]+");
        String buf;
        for (int i = 0; i < arrWord.length; i++) {
            for (int j = 0; j < arrWord.length - i - 1; j++) {
                if (arrWord[j].length() > arrWord[j + 1].length()) {
                    buf = arrWord[j];
                    arrWord[j] = arrWord[j + 1];
                    arrWord[j + 1] = buf;
                }
            }
        }
        for (int i = 0; i < arrWord.length; i++) {
            System.out.print(arrWord[i] + " ");
        }
    }

//Вывести дубликаты и количество повторений

    public static void iterText(String text) {

        String[] arrWord = text.split("[\\s,.!?]+");
        int iter = 0;
        for (int i = 0; i < arrWord.length; i++) {
            for (int j = i + 1; j < arrWord.length - i - 1; j++) {
                if ((arrWord[i].equals(arrWord[j])) == true) {
                    System.out.println(arrWord[i]);
                    iter++;
                }
            }
        }
        System.out.println(iter);
    }

//Найти палиндромы

    public static void polindrom(String text) {

        String[] arrWord = text.split("[\\s,.!?]+");

        for (int i = 0; i < arrWord.length; i++) {
            int lenghWord = arrWord[i].length();


            for (int t = 0; t < lenghWord / 2; t++) {


                for (int j = lenghWord - 1; j > lenghWord / 2; j--) {
//                    if (arrWord.)
//                    {
//                        System.out.println(arrWord[i]);
//                    }
                }
            }


        }
    }
}
