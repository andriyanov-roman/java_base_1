//—оздайте программу, вывод€щую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 Е.
public class HWfour {
    public static void main(String[] args) {
        int x=1;

        for(int i=1; i<20; i++){
            x*=2;
            System.out.print(x+",");
        }

    }
}
