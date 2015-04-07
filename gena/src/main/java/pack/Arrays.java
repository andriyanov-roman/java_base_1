package pack;

/**
 * Created by sigen on 4/2/2015.
 */
public class Arrays {
    public static void main(String[] args) {

int sum = 0; //переменная для задания с суммами
    int[] arr = new int[100];
    for(int i=0;i<100;i++)
    {
        arr[i] = i;
        if (arr[i] % 2 == 0)
        {
            System.out.println(i+ " = " + arr[i]);
        }
    }

    for(int i = arr.length;i>0;i--)
    {
        System.out.println(i + " = " + arr[i]);
    }

    for(int i = 0;i<arr.length/2;i++)
    {
        System.out.println("Первая половина" + i + " = " + arr[i]);
    }

    for(int i = arr.length/2; i<arr.length; i++)
        {
            System.out.println("вторая половина" + i + " = " + arr[i]);
        }

    for(int i = arr.length;i>arr.length/2;i--)
        {
            System.out.println("Первая половина" + i + " = " + arr[i]);
        }

    for(int i = arr.length/2; i>0; i--)
        {
            System.out.println("вторая половина" + i + " = " + arr[i]);
        }

    for(int i = arr.length;i>0;i--)
        {
            sum = sum + arr[i];
        }
        System.out.println("Сумма элементов" + sum);

    for(int i = arr.length;i>0;i--)
        {
            sum = sum + arr[i];
        }
        System.out.println("Среднее арифметическое" + sum/arr.length);




}
}
