//—оздайте программу, вывод€щую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 Е.
public class HWthree {
    public static void main(String[] args) {
        int x=90;
        System.out.print(x);


        while (x>=5){
            x-=5;
            System.out.print(", "+x);
        }
    }
}
