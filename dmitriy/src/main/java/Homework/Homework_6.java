package Homework;

/**
 * Created by Дима on 19.04.2015.
 */
public class Homework_6 {
    public static void show(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {
        String pentatonic = "A pentatonic scale is a musical scale or mode with five notes per octave in contrast to a heptatonic " +
                "(seven note) scale such as the major scale and minor scale.";
        String[] words = pentatonic.split("\\s");
        show(words);
        //макс и мин поменять местами
        String max = words[0];
        String min = words[0];
        int maxI = 0;
        int minI = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max.length()) {
                max = words[i];
                maxI = i;
            } else if (words[i].length() < min.length()) {
                min = words[i];
                minI = i;
            }
        }
        System.out.println(max);
        System.out.println(min);
        String temp = words[minI];
        words[minI] = words[maxI];
        words[maxI] = temp;
        show(words);
        //отсортировать по возрастанию
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                if (words[j].length() > words[j+1].length()){
                    String t = words[j+1];
                    words[j+1] = words[j];
                    words[j] = t;
                }
            }
        }
        show(words);

    }
}
