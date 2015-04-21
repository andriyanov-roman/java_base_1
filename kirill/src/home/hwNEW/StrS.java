
public class StrS {
    public static void main(String[] args) {

        String  s= "You do not have to be French to enjoy a decent red wine But you do have to be French to recognize one";


        //PoliD(s);       //Ќайти палиндромы
        FindChange(s);    //Ќайти максимальное и минимальное слово и помен€ть их местами
        Sort(s);          //ќтсортировать по возрастанию
        dubl(s);          //¬ывести дубликаты и количество повторений



    }
    public static void PoliD (String s){               //ploho(
        String[] s3 = s.split("\\s");
        String[] o = s3;
        for (int i = 0; i < o.length; i++) {
            String buf = o[i];
            o[i] = o[o.length - i - 1];
            o[o.length - i - 1] = buf;
        }
        for (int j = 0; j < o.length; j++) {

            if (o[j].equals(s3[j])){
                System.out.print(o[j]+" ");
            }
        }
        System.out.println();
    }


    public static void dubl (String s){                     //доделать вывод кол-ва после каждого
        String[] s3 = s.split("\\s");
        int count=1;
        String cou="-";
        for (int i = 0; i < s3.length; i++) {
            for (int f = i+1; f < s3.length; f++) {
                if(s3[i].equals(s3[f]) && !s3[i].equals(cou)){
                    count++;
                    System.out.print(s3[i]+" ");s3[i]=cou;
                }
            }
        }
        System.out.println();
        System.out.println(count+" - kol-vo povtorov");

    }
    public static void showS (String st){
        String[] s = st.split("\\s");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+" ");
        }

    }
    public static void Sort (String st){
        String[] s3 = st.split("\\s");
        int max = s3[0].length();
        int min = s3[0].length();
        showS(st);
        System.out.println();
        for (int i = 0; i < s3.length; i++) {
            for (int f = i+1; f < s3.length; f++) {

                if (s3[i].length() > s3[f].length()) {
                    String t = s3[i];
                    s3[i] = s3[f];
                    s3[f] = t;

                }
            }
        }
        for (int i = 0; i < s3.length; i++) {
            System.out.print(s3[i]+" ");
        }
        System.out.println();
    }
    public static void FindChange (String s){
        String[] s3 = s.split("\\s");
        int max = s3[0].length();
        int min = s3[0].length();
        String minN="";
        String maxX="";
        //showS(s);
        for (int i = 0; i < s3.length; i++) {
            if(s3[i].length() > max) {
                max = s3[i].length();
                maxX = s3[i];
            }
            else if(s3[i].length() < min) {
                min = s3[i].length();
                minN = s3[i];
            }
        }
        System.out.println();
        int y = max;
        for (int i3 = 0; i3 < s3.length; i3++) {
            if (max == s3[i3].length())
                s3[i3] = minN;
            else if (min == s3[i3].length())
                s3[i3] = maxX;
        }
        for (int i = 0; i < s3.length; i++) {
            System.out.print(s3[i]+" ");
        }System.out.println();
    }
}

