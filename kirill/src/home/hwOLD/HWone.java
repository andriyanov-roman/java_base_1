//—оздайте программу, вывод€щую на экран все четырЄхзначные числа последовательности 1000 1003 1006 1009 1012 1015 Е.
public class HWone {
    public static void main(String[] args) {
        int x=1000;
        System.out.print(x);


        while (x<10000){
            x+=3;
            System.out.print(", "+x);
        }
    }
}

