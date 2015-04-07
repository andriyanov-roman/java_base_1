/**
 * Created by Евгений on 07.04.2015.
 */
public class Hometask2_2
{
    public static void main(String[] args)
    {

        int x = 91;
        int y = 114;
        int z = 116;
        int a = 0;

        if (x > y && x > z && x > a)
        {
            System.out.println("The largest naumber is X! Value =" + " " + x + ";");
            if (y > z && y > a) {
                System.out.println("The second largest naumber is Y! Value =" + " " + y + ";");
            } else if (z > y && z > a) {
                System.out.println("The second largest naumber is Z! Value =" + " " + z + ";");
            } else if (a > y && a > z) {
                System.out.println("The second largest naumber is A! Value =" + " " + a + ";");}
        }
        if (y > x && y > z && y > a)
        {
            System.out.println("The largest naumber is Y! Value =" + y);
            if (x > z && x > a) {
                System.out.println("The second largest naumber is X! Value =" + " " + x + ";");
            } else if (z > x && z > a) {
                System.out.println("The second largest naumber is Z! Value =" + " " + z + ";");
            } else if (a > x && a > z) {
                System.out.println("The second largest naumber is A! Value =" + " " + a + ";");}
        }
        if (z > x && z > y && z > a)
        {
            System.out.println("The largest naumber is Z! Value =" + " " + z + ";");
            if (y > x && y > a) {
                System.out.println("The second largest naumber is Y! Value =" + " " + y + ";");
            } else if (x > y && x > a) {
                System.out.println("The second largest naumber is X! Value =" + " " + x + ";");
            } else if (a > y && a > x) {
                System.out.println("The second largest naumber is A! Value =" + " " + a + ";");}
        }
        if (a > x && a > y && a > z)
        {
            System.out.println("The largest naumber is A! Value =" + " " + a + ";");
            if (y > x && y > z) {
                System.out.println("The second largest naumber is Y! Value =" + " " + y + ";");
            } else if (x > y && x > z) {
                System.out.println("The second largest naumber is X! Value =" + " " + x + ";");
            } else if (z > y && z > x) {
                System.out.println("The second largest naumber is Z! Value =" + " " + z + ";");}
        }
    }
}
