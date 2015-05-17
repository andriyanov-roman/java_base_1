package ducks;

import java.util.ArrayList;

/**
 * Created by user on 5/12/2015.
 */
public class Main {
    public static void main(String[] args) {
        SimpleFly simpleFly = new SimpleFly();
        RocketFly rocketFly = new RocketFly();
        HomeDuck home = new HomeDuck();
        home.setDoFly(simpleFly);
        home.getDoFly().doFly();
        home.setDoFly(rocketFly);
        home.getDoFly().doFly();


    }
}
