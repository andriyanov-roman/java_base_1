package Home_w.Hw6;

/**
 * Created by Евгений on 21.04.2015.
 */
public class String {
        public static void main(java.lang.String[] args) {
            java.lang.String string = "Lorem ipsum dolor sit amet tempor consectetur adipisicing elit sit do eiusmod tempor incididunt utu " +
                    "labore et dolore tempor aliqua.";

            java.lang.String[] strings = string.split("\\s");

            int max = strings[0].length();
            int min = strings[0].length();

            System.out.print("Заданная строка: ");
            showArray(strings);

            int maxI = 0;
            int minI = 0;

            java.lang.String[] moreMin = new java.lang.String[3];
            java.lang.String[] moreMax = new java.lang.String[2];

            for (int i = 0; i < strings.length; i++) {
                if (strings[i].length() > max) {
                    max = strings[i].length();
                    maxI = i;
                } else if (strings[i].length() < min) {
                    min = strings[i].length();
                    minI = i;
                }
            }

            for (int i = 0, k = 0, n = 0; i < strings.length; i++) {
                if (strings[minI].length() == strings[i].length()) {
                    moreMin[k] = strings[i];
                    k++;
                } else if (strings[maxI].length() == strings[i].length()) {
                    moreMax[n] = strings[i];
                    n++;
                }
            }

            System.out.println("Максимальное слово: " + strings[maxI]+ ", количество символов - " + max );
            System.out.println("Минимальное слово: " + strings[minI]+ ", количество символов - " + min );

            System.out.print("Другие максимальные слова: ");
            showArray(moreMin);

            System.out.print("Другие минимальные слова: ");
            showArray(moreMax);

            System.out.print("Меняем местами максимальное слово " + strings[maxI] + " и минимальное " + strings[minI] + " местами: ");

            java.lang.String buf = null;
            buf = strings[minI];
            strings[minI] = strings [maxI];
            strings [maxI] = buf;

            showArray(strings);

            System.out.print("Сортируем слова по возростанию: ");

            bubbleSort(strings);

            System.out.println("Дубликаты и количество их повторений: ");
            for (int i = 0; i < strings.length; i++) {
                for (int j = i + 1, count = 0; j < strings.length - 1; j++) {
                    if (strings[i].equals(strings[j])) {
                        count++;
                        System.out.println(strings[j] + " " + count);
                    }
                }
            }

            java.lang.String reverse = new StringBuffer(string).reverse().toString();
            java.lang.String[] stringsTwo = string.split("\\s");
            java.lang.String[] reverseArr = reverse.split("\\s");

            System.out.println("Полиндромы: ");
            for (int i = 0, j = reverseArr.length - 1; i < reverseArr.length; i++, j--) {
                if (stringsTwo[i].equals(reverseArr[j])) {
                    System.out.println(stringsTwo[i]);
                }
            }

        }

        public static void showArray(java.lang.String[] myBeautifulLittlePony) {
            for (int i = 0; i < myBeautifulLittlePony.length; i++) {
                System.out.print(myBeautifulLittlePony[i] + " ");
            }
            System.out.println();
        }

        public static void bubbleSort(java.lang.String[] arr) {
            //int counter = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i ; j++) {
                    if (arr[j].length() > arr[j + 1].length()) {
                        java.lang.String t = arr[j + 1];
                        arr[j + 1] = arr[j];
                        arr[j] = t;
                        //counter++;
                    }
                }
            }
            //System.out.println(counter);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

