/**
 * Created by Pipin on 21.04.2015.
 */
public class HateLudi {
    public static void main(String[] args) {
        Forma[] h = getHumans();

        h[1].walk(2.70, 40);
        h[3].howwalk(96);
        FindH(h);
        Sort(h);

    }
    public static void Sort(Forma[] s){
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].getSecondName().length() > s[j + 1].getSecondName().length()) {
                    String t = s[j + 1].getSecondName();
                    s[j + 1].setSecondName(s[j].getSecondName());
                    s[j].setSecondName(t);

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].getSecondName() + " ");
        }
        System.out.println();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].getName().length() > s[j + 1].getName().length()) {
                    String t = s[j + 1].getName();
                    s[j + 1].setName(s[j].getName());
                    s[j].setName(t);

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].getAge() > s[j + 1].getAge()) {
                    int t = s[j + 1].getAge();
                    s[j + 1].setAge(s[j].getAge());
                    s[j].setAge(t);

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].getWeight() > s[j + 1].getWeight()) {
                    double t = s[j + 1].getWeight();
                    s[j + 1].setWeight(s[j].getWeight());
                    s[j].setWeight(t);

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].getWeight() + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].getHeight() > s[j + 1].getHeight()) {
                    double t = s[j + 1].getHeight();
                    s[j + 1].setHeight (s[j].getHeight());
                    s[j].setHeight(t);

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].getHeight() + " ");
        }
        System.out.println();
    }

    public static void FindH(Forma[] z) {  //Найти human с самой длинной фамилией и поменять местами в массиве с самой короткой
        String max = z[0].getSecondName();
        String min = z[0].getSecondName();
        int maxx=z[0].getSecondName().length();
        int minn=z[0].getSecondName().length();
        for (int i = 0; i < z.length; i++) {
            if(z[i].getSecondName().length() > maxx) {
                max = z[i].getSecondName();
                maxx= z[i].getSecondName().length();
            }
            else if(z[i].getSecondName().length() < minn) {
                min = z[i].getSecondName();
                minn = z[i].getSecondName().length();
            }
        }
        String y = max;                                                                     //Поменять минимальное и максимальное числа в массиве местами
        for (int i1 = 0; i1 < z.length; i1++) {
            if (max.equals(z[i1].getSecondName()))
                z[i1].setSecondName(min);
            else if (min.equals(z[i1].getSecondName()))
                z[i1].setSecondName(y);
        }
        showN(z);
    }

    public static void showN(Forma[] humans){
        for(int i=0; i<humans.length; i++){
            System.out.print(humans[i].getSecondName()+" ");
        }    System.out.println();
    }

    public static Forma[] getHumans() {
        Forma h1 = new Forma();
        h1.setAge(60);
        h1.setHeight(1.98);
        h1.setName("Petr");
        h1.setSecondName("Petrovich");
        h1.setWeight(65);

        Forma h2 = new Forma();
        h2.setAge(30);
        h2.setHeight(1.70);
        h2.setName("Egor");
        h2.setSecondName("Zlo");
        h2.setWeight(151);

        Forma h3 = new Forma();
        h3.setAge(20);
        h3.setHeight(1.89);
        h3.setName("Victor");
        h3.setSecondName("Victorius");
        h3.setWeight(80);

        Forma h4 = new Forma();
        h4.setAge(15);
        h4.setHeight(1.50);
        h4.setName("Eva");
        h4.setSecondName("Evovna");
        h4.setWeight(41.6);

        Forma h5 = new Forma();
        h5.setAge(33);
        h5.setHeight(2.10);
        h5.setName("Evgeniy");
        h5.setSecondName("Fedorovich");
        h5.setWeight(86);

        Forma h6 = new Forma();
        h6.setAge(45);
        h6.setHeight(1.65);
        h6.setName("Vova");
        h6.setSecondName("Derovich");
        h6.setWeight(69);

        Forma h7 = new Forma();
        h7.setAge(60);
        h7.setHeight(1.68);
        h7.setName("David");
        h7.setSecondName("Zarya");
        h7.setWeight(65);

        Forma h8 = new Forma();
        h8.setAge(60);
        h8.setHeight(1.79);
        h8.setName("Semen");
        h8.setSecondName("Dvadir");
        h8.setWeight(65);

        Forma h9 = new Forma();
        h9.setAge(60);
        h9.setHeight(1.50);
        h9.setName("Dima");
        h9.setSecondName("Stalker");
        h9.setWeight(65);

        Forma h10 = new Forma();
        h10.setAge(26);
        h10.setHeight(1.70);
        h10.setName("Olya");
        h10.setSecondName("Fifa");
        h10.setWeight(59);
        return new Forma[]{h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};
    }
}