package ducks;

/**
 * Created by user on 5/12/2015.
 */
public class RubberDuck extends Duck implements IDoVoice {

    public void doVoice() {
        System.out.println("I rubber duck can squeak");
    }
}
