package oop;

/**
 * Created by sigen on 5/12/2015.
 */
public class SingleController {
    public static void main(String[] args) {
        Single single = Single.getInstance();
        single.setName("Moto");
        single.setPrint("Hello");
        System.out.println(single.toString());
        Single single1 = Single.getInstance();
        System.out.println(single1.toString());
    }

}
