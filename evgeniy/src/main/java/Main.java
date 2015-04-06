
class Main {
    public static void main(String[] args) {

        byte a = 2+1; //byte зарезервированое задание для компелтора
        //byte a2 = 1;
        short c = 5-1;
        //short c2 = 3;
        int b = 6/2;
        int b2= 2;
        int b3= 1;
        int b4= 1;
        long d = 2*3;

        //System.out.println(x = a);

        System.out.println(a += a);
        System.out.println(a = (byte) ((c+c)/a));
        System.out.println(b = (c/c)*(a/a));

        System.out.println(b4=b2);
        System.out.println(b2=b3);
        System.out.println(b3=b4);

        System.out.println(b2=b2+b3);
        System.out.println(b3=b2-b3);
        System.out.println(b2=b2-b3);
    }

}

