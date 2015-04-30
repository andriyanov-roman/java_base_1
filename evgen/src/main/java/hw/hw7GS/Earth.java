package hw.hw7GS;

/**
 * Created by пїЅпїЅпїЅпїЅпїЅпїЅпїЅ on 21.04.2015.
 */
public class Earth {
    public static void main(String[] args) {
        Humans[] h = getHuman();

        System.out.println(h[8].walk());

        System.out.println("Заданный массив: ");
        showArrayNames(h);

        System.out.println("Сортируем заданный массив по именам: ");
        sortNames(h);

        System.out.println("Меняем максимальное и минимальное слово местами ");
        changeMaxAndMinNames(h);



    }

        public static Humans[] getHuman(){

        Humans h1 = new Humans();
        h1.setName("David");
        h1.setSecondName("De Gea");
        h1.setAge(22);
        h1.setHeight(1.84);
        h1.setWeight(79);

        Humans h2 = new Humans();
        h2.setName("Luke");
        h2.setSecondName("Show");
        h2.setAge(24);
        h2.setHeight(1.86);
        h2.setWeight(90);

        Humans h3 = new Humans();
        h3.setName("Marcus");
        h3.setSecondName("Roho");
        h3.setAge(22);
        h3.setHeight(1.88);
        h3.setWeight(85);

        Humans h4 = new Humans();
        h4.setName("Chris");
        h4.setSecondName("Smolling");
        h4.setAge(26);
        h4.setHeight(1.92);
        h4.setWeight(90);

        Humans h5 = new Humans();
        h5.setName("Ashlie");
        h5.setSecondName("Young");
        h5.setAge(25);
        h5.setHeight(1.84);
        h5.setWeight(77);

        Humans h6 = new Humans();
        h6.setName("Anhel");
        h6.setSecondName("Di Maria");
        h6.setAge(25);
        h6.setHeight(1.82);
        h6.setWeight(75);

        Humans h7 = new Humans();
        h7.setName("Huan");
        h7.setSecondName("Mata");
        h7.setAge(28);
        h7.setHeight(1.85);
        h7.setWeight(74);

        Humans h8 = new Humans();
        h8.setName("Antonio");
        h8.setSecondName("Valencia");
        h8.setAge(29);
        h8.setHeight(1.85);
        h8.setWeight(81);

        Humans h9 = new Humans();
        h9.setName("Wayne");
        h9.setSecondName("Rooney");
        h9.setAge(29);
        h9.setHeight(1.86);
        h9.setWeight(85);

        Humans h10 = new Humans();
        h10.setName("Robin");
        h10.setSecondName("Van Persie");
        h10.setAge(30);
        h10.setHeight(1.86);
        h10.setWeight(87);

        return new Humans[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};
    }

    public static void sortNames (Humans[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i ; j++) {
                if (arr[j].getName().length() > arr[j + 1].getName().length()) {
                    String t = arr[j + 1].getName();
                    arr[j + 1].setName(arr[j].getName());
                    arr[j].setName(t);
                }
            }
        }
        showArrayNames(arr);
    }

    public static void showArrayNames (Humans[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getName() + " ");
        }
        System.out.println();
    }

    public static void changeMaxAndMinNames (Humans[] arr) {
        String max = arr[0].getName();
        String min = arr[0].getName();
        int minI = 0;
        int maxI = 0;
        String buf = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().length() > max.length()){
                max = arr[i].getName();
                maxI = i;
            } else if (arr[i].getName().length() < min.length()){
                min = arr[i].getName();
                minI = i;
            }
        }
        System.out.println("Максимальное имя в массиве: " + max);
        System.out.println("Минимальное имя в массиве: " + min);
        buf = arr[maxI].getName();
        arr[maxI].setName(arr[minI].getName());
        arr[minI].setName(buf);
        System.out.println("После замены: ");
        showArrayNames(arr);
    }
}
