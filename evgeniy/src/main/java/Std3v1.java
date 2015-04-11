/**
 * Created by Евгений on 09.04.15.
 */
public class Std3v1 {
    public static void main(String[] args) {
        //int i1=1, c=2, d1=3;
        //long[] d={1,2,3,20000000000L};
        //boolean[] booleans = {true,false,true,false};
        int[] mod = new int[10];
        mod[0] = 5;
        mod[1] = 15;
        mod[2] = 51;
        mod[3] = 115;
        mod[4] = 151;
        mod[5] = 511;

        int sum = 0, max = 0, min = 0, r = 0, a = 0;
        for (int i = 0; i < mod.length; i++) {
            //sum=sum+mod[i];
            //System.out.println(mod[i]);
            // if(min==mod[i])
            if (max < mod[i]) {
                max = mod[i];
                r = i;
            }

            if (min > mod[i]) {
                min = mod[i];
                a = i;
            }
            System.out.println(mod[i]);
        }
        mod[r] = min;
        mod[a] = max;

        for (int i = 0; i < mod.length; i++) {
            System.out.println(mod[i]);
        }
        //max=max+min;
        // min=max-min;
        //max=max-min;

        //System.out.println(sum);
        //System.out.println(min);
        //System.out.println(max);

    }
}
