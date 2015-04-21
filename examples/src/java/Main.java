import oop.Human;

/**
 * Created by user on 3/31/2015.
 */
public class Main {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.name = "Dima";
        Human h2 = new Human();
        Human h3 = new Human();
        Human h4 = new Human();
        Human h5 = new Human();
        Human h6 = new Human();
        Human[] humans = new Human[10];
        humans[0] = h1;
        humans[1] = h2;
        humans[0] = h1;
        Human[] array = {h1, h2, h3, h4, h5, h6};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].name + " " + array[i].secondName + " ");
        }
    }
}
