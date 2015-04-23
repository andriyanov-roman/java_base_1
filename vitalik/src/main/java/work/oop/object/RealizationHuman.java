package work.oop.object;

/**
 * реализация класса human
 */
public class RealizationHuman {
    public static void main(String[] args) {
        Human[] human = getHuman();
        System.out.println("\nМассив Humans: ");
        System.out.println();
        printHumans(human);
//Найти human с самой длинной фамилией и поменять местами в массиве с самой короткой
        System.out.println("\nНайти human с самой длинной фамилией и поменять местами в массиве с самой короткой");
        System.out.println();
        maxSecondName(human);
        System.out.println();
//Отсортировать по всем состояниям
        System.out.println("\nОтсортировать по всем состояниям");
        sortHumans(human);
//Написать метод которой определяет как ходит человек на всех этапах жизни (пять этапов), до 100 лет
        System.out.println("\nКак ходит человек на всех этапах жизни");
        movementHuman(human);


    }
/*+++++++++++++++++++++++++++++++++++ Методы ++++++++++++++++++++++++++++++++++++++++++++++++++++*/

    //Найти human с самой длинной фамилией и поменять местами в массиве с самой короткой
    public static void maxSecondName(Human[] humans) {
        Human maxName = humans[0];
        Human minName = humans[0];
        int max = 0;
        int min = 0;
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].secondName.length() > maxName.secondName.length()) {
                maxName = humans[i];
                max = i;
            }
            if (humans[i].secondName.length() < minName.secondName.length()) {
                minName = humans[i];
                min = i;
            }
        }
        Human buf = humans[max];
        humans[max] = humans[min];
        humans[min] = buf;
        printHumans(humans);
    }


    //Отсортировать по всем состояниям
    public static void sortHumans(Human[] humans) {
        System.out.println("\n По возросту: ");
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length; j++) {
                if (humans[i].age < humans[j].age) {
                    Human buf = humans[j];
                    humans[j] = humans[i];
                    humans[i] = buf;
                }
            }
        }
        printHumans(humans);
        System.out.println("\n По росту: ");
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length; j++) {
                if (humans[i].height < humans[j].height) {
                    Human buf = humans[j];
                    humans[j] = humans[i];
                    humans[i] = buf;
                }
            }
        }
        printHumans(humans);
        System.out.println("\n По весу: ");
        for (int i = 0; i < humans.length; i++) {
            for (int j = 0; j < humans.length; j++) {
                if (humans[i].weight < humans[j].weight) {
                    Human buf = humans[j];
                    humans[j] = humans[i];
                    humans[i] = buf;
                }
            }
        }
        printHumans(humans);

    }

    //Написать метод которой определяет как ходит человек на всех этапах жизни (пять этапов), до 100 лет
    public static void movementHuman(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            if (humans[i].age <= 1 || humans[i].age > 90) {
                System.out.println("Ходит только под себя");
            }
            if (humans[i].age > 1 && humans[i].age <= 2) {
                System.out.println("Ползает");
            }
            if (humans[i].age > 2 && humans[i].age <= 18) {
                System.out.println("Бегает");
            }
            if (humans[i].age > 18 && humans[i].age <= 55) {
                System.out.println("Просто ходит");
            }
            if (humans[i].age > 55 && humans[i].age <= 90) {
                System.out.println("Ходит медленно");
            }


        }

    }

    //Вывод
    public static void printHumans(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + "    " + humans[i].secondName
                    + "    " + humans[i].age + "    " + humans[i].weight + "    " + humans[i].height);
        }
    }

    //новые 10 человек
    public static Human[] getHuman() {
        Human h1 = new Human();
        h1.name = "Vitalij";
        h1.secondName = "Gorbunov";
        h1.age = 28;
        h1.height = 1.83;
        h1.weight = 80.5;

        Human h2 = new Human();
        h2.name = "Ivan";
        h2.secondName = "Ivanichenko";
        h2.age = 18;
        h2.height = 1.7;
        h2.weight = 71.5;

        Human h3 = new Human();
        h3.name = "Petya";
        h3.secondName = "Petrov";
        h3.age = 12;
        h3.height = 1.54;
        h3.weight = 42.5;

        Human h4 = new Human();
        h4.name = "Stepan";
        h4.secondName = "Sidorov";
        h4.age = 68;
        h4.height = 1.62;
        h4.weight = 64.5;

        Human h5 = new Human();
        h5.name = "Arem";
        h5.secondName = "Mihailov";
        h5.age = 22;
        h5.height = 1.63;
        h5.weight = 57.5;

        Human h6 = new Human();
        h6.name = "Artur";
        h6.secondName = "Dudnik";
        h6.age = 1;
        h6.height = 0.63;
        h6.weight = 8.5;

        Human h7 = new Human();
        h7.name = "Viktor";
        h7.secondName = "Anch";
        h7.age = 38;
        h7.height = 1.93;
        h7.weight = 101.5;

        Human h8 = new Human();
        h8.name = "Roman";
        h8.secondName = "Adardasov";
        h8.age = 44;
        h8.height = 2.03;
        h8.weight = 106.5;

        Human h9 = new Human();
        h9.name = "Fedor";
        h9.secondName = "Fedorov";
        h9.age = 92;
        h9.height = 1.68;
        h9.weight = 59.5;

        Human h10 = new Human();
        h10.name = "Evgenij";
        h10.secondName = "Avdeev";
        h10.age = 8;
        h10.height = 1.13;
        h10.weight = 20.5;
        return new Human[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};
    }
}