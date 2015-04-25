package OOP;

/**
 * Created by ������� on 25.04.2015.
 */
public class Company {
    public static void main(String[] args) {


    }


public static Workers[] getWorkers() {

    Workers w1 = new Workers();
    w1.setName("Eugene");
    w1.setSecondName("Deyneka");
    w1.setAge(22);
    w1.setGender("Male");

    return new Workers[]{w1};
    }
}