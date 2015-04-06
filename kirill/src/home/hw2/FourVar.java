//Задано четыре переменных, найти вторую по величине
public class FourVar {
    public static void main(String[] args) {
        byte    a=4,
                b=12,
                c=8,
                d=14,
                secondX,
                otvet,
                secondY;

        if (a>b)
            secondX=b;
        else secondX=a;

        if (c>d)
            secondY=d;
        else secondY=c;

        if (secondX>secondY)
            otvet=secondX;
        else otvet=secondY;
        System.out.println("Vtoraya po velichine- "+otvet);

    }
}
