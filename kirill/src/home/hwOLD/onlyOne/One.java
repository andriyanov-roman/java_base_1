package onlyOne;

/**
 * Created by Pipin on 09.05.2015.
 */
public class One {

    private static int count=0;
    private  String name = "Jhonatan";
    private int age = 25;
    private int weight = 60;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if (count<2)
        this.name =name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (count<2)
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (count<2)
        this.weight = weight;
    }

    public One(){
        count++;
    }

}
