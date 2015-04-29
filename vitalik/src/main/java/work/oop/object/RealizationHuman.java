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
            if (humans[i].getSecondName().length() > maxName.getSecondName().length()) {
                maxName = humans[i];
                max = i;
            }
            if (humans[i].getSecondName().length() < minName.getSecondName().length()) {
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
                if (humans[i].getAge() < humans[j].getAge()) {
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
                if (humans[i].getHeight() < humans[j].getHeight()) {
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
                if (humans[i].getWeight() < humans[j].getWeight()) {
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
            if (humans[i].getAge() <= 1 || humans[i].getAge() > 90) {
                System.out.println("Ходит только под себя");
            }
            if (humans[i].getAge() > 1 && humans[i].getAge() <= 2) {
                System.out.println("Ползает");
            }
            if (humans[i].getAge() > 2 && humans[i].getAge() <= 18) {
                System.out.println("Бегает");
            }
            if (humans[i].getAge() > 18 && humans[i].getAge() <= 55) {
                System.out.println("Просто ходит");
            }
            if (humans[i].getAge() > 55 && humans[i].getAge() <= 90) {
                System.out.println("Ходит медленно");
            }


        }

    }

    //Вывод
    public static void printHumans(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].getName() + "    " + humans[i].getSecondName()
                    + "    " + humans[i].getAge() + "    " + humans[i].getWeight() + "    " + humans[i].getHeight()+ "    "
                    + humans[i].getSalary() + "    " + humans[i].getMg());
        }
    }

    //новые 10 человек
    public static Human[] getHuman() {
        Human h1 = new Human();
        h1.setName("Vitalij");
        h1.setSecondName("Gorbunov");
        h1.setAge(28);
        h1.setHeight(1.83);
        h1.setWeight(80.5);
        h1.setSalary(2500);
        h1.setMg('m');

        Human h2 = new Human();
        h2.setName("Ivan");
        h2.setSecondName("Ivanichenko");
        h2.setAge(18);
        h2.setHeight(1.7);
        h2.setWeight(71.5);
        h2.setSalary(2210);
        h2.setMg('m');

        Human h3 = new Human();
        h3.setName("Petya");
        h3.setSecondName("Petrov");
        h3.setAge(22);
        h3.setHeight(1.64);
        h3.setWeight(42.5);
        h3.setSalary(4100);
        h3.setMg('m');

        Human h4 = new Human();
        h4.setName("Stepan");
        h4.setSecondName("Sidorov");
        h4.setAge(68);
        h4.setHeight(1.62);
        h4.setWeight(64.5);
        h4.setSalary(2860);
        h4.setMg('m');

        Human h5 = new Human();
        h5.setName("Arem");
        h5.setSecondName("Mihailov");
        h5.setAge(26);
        h5.setHeight(1.63);
        h5.setWeight(57.5);
        h5.setSalary(6500);
        h5.setMg('m');

        Human h6 = new Human();
        h6.setName("Irina");
        h6.setSecondName("Dudnik");
        h6.setAge(19);
        h6.setHeight(1.63);
        h6.setWeight(48.5);
        h6.setSalary(1900);
        h6.setMg('g');

        Human h7 = new Human();
        h7.setName("Viktoria");
        h7.setSecondName("Anch");
        h7.setAge(38);
        h7.setHeight(1.93);
        h7.setWeight(101.5);
        h7.setSalary(4200);
        h7.setMg('g');

        Human h8 = new Human();
        h8.setName("Rima");
        h8.setSecondName("Adardasova");
        h8.setAge(44);
        h8.setHeight(2.03);
        h8.setWeight(106.5);
        h8.setSalary(2860);
        h8.setMg('g');

        Human h9 = new Human();
        h9.setName("Faina");
        h9.setSecondName("Fedorova");
        h9.setAge(42);
        h9.setHeight(1.68);
        h9.setWeight(59.5);
        h9.setSalary(6300);
        h9.setMg('g');

        Human h10 = new Human();
        h10.setName("Evgenija");
        h10.setSecondName("Avdeeva");
        h10.setAge(38);
        h10.setHeight(1.83);
        h10.setWeight(67.5);
        h10.setSalary(4730);
        h10.setMg('g');
        return new Human[]{h1, h2, h3, h4, h5, h6, h7, h8, h9, h10};
    }
}