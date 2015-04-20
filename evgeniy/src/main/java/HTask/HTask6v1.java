package HTask;

/**
 * Created by Евгений on 20.04.15.
 */
public class HTask6v1 {
    public static void main(String[] args) {
        String string = "The value if the argument is a string lexicographically equal " +
                "to this string; a value less than if the argument is a string " +
                "lexicographichjghgfgjhally greater than this string; and a value greater than " +
                "0 if the argument is a string lexicographically less than this string. ";
        String[] strings = string.split("\\s");
        int max = strings[0].length();
        int min = strings[0].length();

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        String maxT = strings[0];
        String minT = strings[0];
        String nonI = strings[0];

        int maxN=0;
        int minN=0;
        for (int i = 0; i < strings.length; i++)  {
            if(strings[i].length() > max) {
                max = strings[i].length();
                maxT = strings[i];
                maxN = i;
            }


            if(strings[i].length() < min) {
                min = strings[i].length();
                minT = strings[i];
                minN = i;
            }
           maxT=strings[minN];
            minT=strings[maxN];

        }

        System.out.println(max);
        System.out.println(maxT);
        System.out.println(min);
        System.out.println(minT);

    }
}
