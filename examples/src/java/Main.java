import oop.Human;

/**
 * Created by user on 3/31/2015.
 */
public class Main {
    public static void main(String[] args) {
        Human[] h = getHumans();
        showHumans(h);
    }

    public static void showHumans(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i].name + " " + humans[i].secondName);
        }
    }

    public static Human[] getHumans() {
        Human human1 = new Human();
        human1.name = "Gennadiy";
        human1.secondName = "Sipakov";
        human1.age = 20;
        human1.weight = 97;
        human1.height = 1.84;

        Human human2 = new Human();
        human2.name = "Shevchuk";
        human2.secondName = "Dmitriy";
        human2.age = 20;
        human2.weight = 92;
        human2.height = 1.92;

        Human human3 = new Human();
        human3.name = "Koval";
        human3.secondName = "Dmitriy";
        human3.age = 20;
        human3.weight = 75;
        human3.height = 1.76;

        Human human4 = new Human();
        human4.name = "Starodub";
        human4.secondName = "Aleksandr";
        human4.age = 21;
        human4.weight = 68;
        human4.height = 1.69;

        Human human5 = new Human();
        human5.name = "Sipakova";
        human5.secondName = "Ekaterina";
        human5.age = 17;
        human5.weight = 63;
        human5.height = 1.72;

        Human human6 = new Human();
        human6.name = "Sipakov";
        human6.secondName = "Aleksandr";
        human6.age = 49;
        human6.weight = 95;
        human6.height = 1.80;

        Human human7 = new Human();
        human7.name = "Sus";
        human7.secondName = "Konstantin";
        human7.age = 20;
        human7.weight = 76;
        human7.height = 1.78;

        Human human8 = new Human();
        human8.name = "Vishnivsky";
        human8.secondName = "Roman";
        human8.age = 21;
        human8.weight = 86;
        human8.height = 1.8;

        Human human9 = new Human();
        human9.name = "Lenin";
        human9.secondName = "Vladimir";
        human9.age = 145;
        human9.weight = 40;
        human9.height = 1.65;

        Human human10 = new Human();
        human10.name = "Stephen";
        human10.secondName = "King";
        human10.age = 67;
        human10.weight = 92;
        human10.height = 1.93;
        return new Human[]{human1, human2, human3, human4,
                human5, human6, human7, human8, human9, human10};
    }
}
