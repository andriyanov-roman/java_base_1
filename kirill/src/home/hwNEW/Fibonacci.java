
public class Fibonacci {
    public static void main(String[] args) {
        int i=2,x=0,y=1,next;
        System.out.print(x+", "+y+", ");

        while (i!=20){
            i++;
            next=x+y;
            x=y;
            y=next;
            System.out.print(next+"; ");
        }

    }

}

