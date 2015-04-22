package Cakes;

/**
 * Created by ������� on 21.04.2015.
 */
public class Earth {
    public static void main(String[] args) {
        Humans[] h = getHuman();

        System.out.println(h[8].walk());

        System.out.println("Имена людей: ");
        showArrayNames(h);

        System.out.println("Отсортируем имена по возрастанию: ");
        sortNames(h);

        System.out.println("Найдем human с самой длинной фамилией и поменяем местами в массиве с самой короткой: ");
        changeMaxAndMinNames(h);



    }

        public static Humans[] getHuman(){

        Humans h1 = new Humans();
        h1.name = "David";
        h1.secondName = "De Gea";
        h1.age = 22;
        h1.height = 1.84;
        h1.weight = 79;

        Humans h2 = new Humans();
        h2.name = "Luke";
        h2.secondName = "Show";
        h2.age = 24;
        h2.height = 1.86;
        h2.weight = 90;

        Humans h3 = new Humans();
        h3.name = "Marcus";
        h3.secondName = "Roho";
        h3.age = 22;
        h3.height = 1.88;
        h3.weight = 85;

        Humans h4 = new Humans();
        h4.name = "Cris";
        h4.secondName = "Smolling";
        h4.age = 26;
        h4.height = 1.92;
        h4.weight = 90;

        Humans h5 = new Humans();
        h5.name = "Ashlie";
        h5.secondName = "Young";
        h5.age = 25;
        h5.height = 1.84;
        h5.weight = 77;

        Humans h6 = new Humans();
        h6.name = "Anhel";
        h6.secondName = "Di Maria";
        h6.age = 25;
        h6.height = 1.82;
        h6.weight = 75;

        Humans h7 = new Humans();
        h7.name = "Huan";
        h7.secondName = "Mata";
        h7.age = 28;
        h7.height = 1.85;
        h7.weight = 74;

        Humans h8 = new Humans();
        h8.name = "Antonio";
        h8.secondName = "Valencia";
        h8.age = 29;
        h8.height = 1.85;
        h8.weight = 81;

        Humans h9 = new Humans();
        h9.name = "Wayne";
        h9.secondName = "Rooney";
        h9.age = 29;
        h9.height = 1.86;
        h9.weight = 85;

        Humans h10 = new Humans();
        h10.name = "Robin";
        h10.secondName = "Van Persie";
        h10.age = 30;
        h10.height = 1.86;
        h10.weight = 87;

        return new Humans[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};
    }

    public static void sortNames (Humans[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j].name.length() > arr[j + 1].name.length()) {
                    String t = arr[j + 1].name;
                    arr[j + 1].name = arr[j].name;
                    arr[j].name = t;
                }
            }
        }
        showArrayNames(arr);
    }

    public static void showArrayNames (Humans[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].name + " ");
        }
        System.out.println();
    }

    public static void changeMaxAndMinNames (Humans[] arr) {
        String max = arr[0].name;
        String min = arr[0].name;
        int minI = 0;
        int maxI = 0;
        String buf = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.length() > max.length()){
                max = arr[i].name;
                maxI = i;
            } else if (arr[i].name.length() < min.length()){
                min = arr[i].name;
                minI = i;
            }
        }
        System.out.println("Самая длинная фамилия: " + max);
        System.out.println("Самая короткая фамилия: " + min);
        buf = arr[maxI].name;
        arr[maxI].name = arr[minI].name;
        arr[minI].name = buf;
        System.out.println("Меняем местами: ");
        showArrayNames(arr);
    }
}
