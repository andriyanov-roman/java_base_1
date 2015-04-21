package tasks;

/**
 * Created by sigen on 4/19/2015.
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "A paper encyclopedia stays the same until the next edition, whereas editors can update Wikipedia at any instant, around the clock, keeping articles abreast of the most recent events and scholarship.";
        String[] string = str.split("\\s");
        cleanShit(string);
        showStrings(string);
        System.out.println(getMax(string));
        System.out.println(getMin(string));
        swapMinMax(string);
        sort(string);


    }

    //убираем знаки препинания, скобки и все такое(лень регэкспы юзать пока что)
    public static void cleanShit(String[] string) {
        for (int i = 0; i < string.length; i++) {
            string[i] = string[i].replace(",", "");
            string[i] = string[i].replace(".", "");
            string[i] = string[i].replace("!", "");
            string[i] = string[i].replace(":", "");
            string[i] = string[i].replace(")", "");
            string[i] = string[i].replace("(", "");
        }

    }

    public static void showStrings(String[] string) {
        for (int i = 0; i < string.length; i++) {
            System.out.print(string[i] + " ");
        }
        System.out.println();
    }

    public static String getMax(String[] string) {
        int max = string[0].length();
        int indmax = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() > max) {
                max = string[i].length();
                indmax = i;
            }
        }

        return string[indmax];
    }

    public static String getMin(String[] string) {
        int min = string[0].length();
        int minind = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i].length() < min) {
                min = string[i].length();
                minind = i;
            }
        }
        return string[minind];

    }

    public static void swapMinMax(String[] string) {
        int max = 0;
        int min = 0;
        String temp = "";
        for (int i = 0; i < string.length; i++) {
            if (string[i] == getMax(string)) {
                max = i;
            } else if (string[i] == getMin(string)) {
                min = i;
            }
        }
        temp = string[min];
        string[min] = string[max];
        string[max] = temp;
        showStrings(string);
    }

    public static void sort(String[] string) {
        for (int i = 0; i < string.length; i++) {
            for (int j = 0; j < string.length - 1 - i; j++) {
                if (string[j].length() > string[j + 1].length()) {
                    String t = string[j];
                    string[j] = string[j+1];
                    string[j+1] = t;

                }
            }

        }
        showStrings(string);
    }


}
