//—оздайте программу, вывод€щую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 Е.
public class HWtwo {
    public static void main(String[] args) {
        int x=1;
        System.out.print(x);

        for(int i=1; i<=55; i++){
            x+=2;
            System.out.print(", "+x);
        }
    }
}

