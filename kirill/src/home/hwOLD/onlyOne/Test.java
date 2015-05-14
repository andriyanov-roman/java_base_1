package onlyOne;

/**
 * Created by Pipin on 09.05.2015.
 */
public class Test {
    public static void main(String[]args){

        One n1 = new One();
        n1.setName("boris");
        n1.setAge(10);
        n1.setWeight(50);

        System.out.println(n1.getName()+" "+n1.getAge()+" "+n1.getWeight());

        One n2 = new One();
        n2.setName("Vova");
        n2.setAge(90);
        n2.setWeight(40);

        System.out.println(n2.getName() + " " + n2.getAge() + " " + n2.getWeight());


}
}
