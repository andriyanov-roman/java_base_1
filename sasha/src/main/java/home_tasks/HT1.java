package home_tasks;

/**
 * Created by Андрей on 02.04.2015.
 */
public class HT1 {
    public static void main(String[] args){

        byte b1 = 7;
        short s1 = 55;
        int i1 = 30;
        long l1 = 40;

        byte b2 = 3;
        short s2 = 5;
        int i2 = 5;
        long l2 = 45;

        byte b3 = (byte) (b1 + b2);
        byte b4 = (byte) ((byte) (s1 + s2)/b3);
        int i3 = (s1 / s2)*(b4 / b2);
        //TODO some equations

        int x, y, z;
        x=1;
        y=2;
        z=x;
        x=y;
        y=z;

        int a, b;
        a=3;
        b=4;
        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("Byte Sum = " + (b1 + b2));
        //TODO sum of bytes

        System.out.println("Short Sub = " + (s1 - s2));
        //TODO subtraction of shorts

        System.out.println("Int Div = " + (i1 / i2));
        //TODO division of ints

        System.out.println("Long Mult = " + l1 * l2);
        //TODO multiple of longs

        System.out.println("Byte Sum of 2 = " + b3);
        //TODO result of sum 2 bytes

        System.out.println("Byte Sum of 2 Short Div to Byte = " + b4);
        //TODO result of sum 2 shorts div to byte

        System.out.println("Int = " + i3);
        //TODO result of div 2 shorts multiple to div of 2 bytes

        System.out.println("Var X change from 1 to = " + x);
        System.out.println("Var Y change from 2 to = " + y);
        //TODO results of variables change (with another one)

        System.out.println("Var A change from 3 to = " + a);
        System.out.println("Var B change from 4 to = " + b);
        //TODO results of variables change (without another one)

//some changes
    }

}
