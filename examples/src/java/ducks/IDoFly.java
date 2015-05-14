package ducks;

/**
 * Created by user on 5/12/2015.
 */
public interface IDoFly {
    int i = 0;
    void doFly();

    public default void doSomething() {

    }

    public static void doSomethingStatic() {

    }
}
