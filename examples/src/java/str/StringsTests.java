package str;

/**
 * Created by user on 4/16/2015.
 */
public class StringsTests {
    public static void main(String[] args) {
        int[] array = {};
        int a = 20000;
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        String str = "hello dima!!!!";
        String strTwo = new String("hello");
        String strThree = "hello";
        System.out.println(str.intern() == strTwo.intern());
        System.out.println(str.equals(strThree));
        System.out.println("Dima".contains("dimaa"));
        System.out.println("Dima".compareTo("dimaa"));
        System.out.println("test" + '\b' + "testtest");
        String string = "The value 0 if the argument is a string lexicographically equal " +
                "to this string; a value less than 0 if the argument is a string " +
                "lexicographichjghgfgjhally greater than this string; and a value greater than " +
                "0 if the argument is a string lexicographically less than this string. ";
        String[] strings = string.split("\\s");
        int max = strings[0].length();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length() > max) {
                max = strings[i].length();
            }
        }
        System.out.println(max);
    }
}
