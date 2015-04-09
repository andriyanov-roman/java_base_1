package work;

/**
 * Created by user on 4/9/2015.
 */
public class LoopsTest {
    public static void main(String[] args) {


        int[] arr = {1, 33, 2, 4, 4, 6, 6, 4, 3, 5, 6, 7, 8,};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[++i])
                max = arr[i];
        }


        System.out.print(max);


    }


}

