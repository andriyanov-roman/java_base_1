//«адано три переменных, найти переменную с максимальным значением («начение все переменных разные).
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, largest, smallest;

        System.out.print("Enter first: ");
        n1 = input.nextInt();

        System.out.print("Enter second: ");
        n2 = input.nextInt();

        System.out.print("Enter third: ");
        n3 = input.nextInt();

        largest = n1;
        smallest = n1;

        if (n2 > largest)
            largest = n2;
        if (n3 > largest)
            largest = n3;

        if (n2 < smallest)
            smallest = n2;
        if (n3 < smallest)
            smallest = n3;

        System.out.printf("Largest is %d, and smallest is %d%n", largest, smallest);
    }
}