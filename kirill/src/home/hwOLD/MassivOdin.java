//Ќайти индексы положительных чисел и сумму отрицательных чисел в одномерном массиве
public class MassivOdin {
    public static void main(String[] args) {
        int[] ms={-5, 11, 35, 0, -220};
        int sum=0;
        for(int i=0; i<ms.length; i++){
            if (ms[i]<0){
                sum+=ms[i];}
            else System.out.print(i+", ");}
        System.out.println(" :Index polozhitelnix chisel");
        System.out.println(sum+" :Summa vsex otricat elementov");

//ƒан массив чисел, среди которых имеетс€ один ноль. ¬ывести на печать все числа до нул€ включительно.	  

        for(int u=0; u<ms.length; u++){
            if (ms[u]==0) break;
            else System.out.print(ms[u]+",");}
        System.out.println("-Chisla do nulya");

    }

}
