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
                if (s[j].secondName.length() > s[j + 1].secondName.length()) {
                    String t = s[j + 1].secondName;
                    s[j + 1].secondName = s[j].secondName;
                    s[j].secondName = t;

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].secondName + " ");
        }
        System.out.println();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].name.length() > s[j + 1].name.length()) {
                    String t = s[j + 1].name;
                    s[j + 1].name = s[j].name;
                    s[j].name = t;

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].name + " ");
        }
        System.out.println();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].age > s[j + 1].age) {
                    int t = s[j + 1].age;
                    s[j + 1].age = s[j].age;
                    s[j].age = t;

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].weight > s[j + 1].weight) {
                    double t = s[j + 1].weight;
                    s[j + 1].weight = s[j].weight;
                    s[j].weight = t;

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].weight + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s.length - 1 - i ; j++) {
                if (s[j].height > s[j + 1].height) {
                    double t = s[j + 1].height;
                    s[j + 1].height = s[j].height;
                    s[j].height = t;

                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i].height + " ");
        }
        System.out.println();
    }

    public static void FindH(Forma[] z) {  //Найти human с самой длинной фамилией и поменять местами в массиве с самой короткой
        String max = z[0].secondName;
        String min = z[0].secondName;
        int maxx=z[0].secondName.length();
        int minn=z[0].secondName.length();
        for (int i = 0; i < z.length; i++) {
            if(z[i].secondName.length() > maxx) {
                max = z[i].secondName;
                maxx= z[i].secondName.length();
            }
            else if(z[i].secondName.length() < minn) {
                min = z[i].secondName;
                minn = z[i].secondName.length();
            }
        }
        String y = max;                                                                     //Поменять минимальное и максимальное числа в массиве местами
        for (int i1 = 0; i1 < z.length; i1++) {
            if (max.equals(z[i1].secondName))
                z[i1].secondName = min;
            else if (min.equals(z[i1].secondName))
                z[i1].secondName = y;
        }
        showN(z);
    }

    public static void showN(Forma[] humans){
        for(int i=0; i<humans.length; i++){
            System.out.print(humans[i].secondName+" ");
        }    System.out.println();
    }

    public static Forma[] getHumans() {
        Forma h1 = new Forma();
        h1.age = 60;
        h1.height = 1.98;
        h1.name = "Petr";
        h1.secondName = "Petrovich";
        h1.weight = 65;

        Forma h2 = new Forma();
        h2.age = 30;
        h2.height = 1.70;
        h2.name = "Egor";
        h2.secondName = "Zlo";
        h2.weight = 150;

        Forma h3 = new Forma();
        h3.age = 20;
        h3.height = 1.89;
        h3.name = "Victor";
        h3.secondName = "Victorius";
        h3.weight = 80;

        Forma h4 = new Forma();
        h4.age = 15;
        h4.height = 1.50;
        h4.name = "Eva";
        h4.secondName = "Evovna";
        h4.weight = 40;

        Forma h5 = new Forma();
        h5.age = 33;
        h5.height = 2.10;
        h5.name = "Evgeniy";
        h5.secondName = "Fedorovich";
        h5.weight = 86;

        Forma h6 = new Forma();
        h6.age = 45;
        h6.height = 1.65;
        h6.name = "Vova";
        h6.secondName = "Derovich";
        h6.weight = 69;

        Forma h7 = new Forma();
        h7.age = 60;
        h7.height = 1.68;
        h7.name = "David";
        h7.secondName = "Zarya";
        h7.weight = 65;

        Forma h8 = new Forma();
        h8.age = 60;
        h8.height = 1.79;
        h8.name = "Semen";
        h8.secondName = "Dvadir";
        h8.weight = 65;

        Forma h9 = new Forma();
        h9.age = 60;
        h9.height = 1.50;
        h9.name = "Dima";
        h9.secondName = "Stalker";
        h9.weight = 65;

        Forma h10 = new Forma();
        h10.age = 26;
        h10.height = 1.70;
        h10.name = "Olya";
        h10.secondName = "Fifa";
        h10.weight = 59;
        return new Forma[]{h1,h2,h3,h4,h5,h6,h7,h8,h9,h10};
    }
}