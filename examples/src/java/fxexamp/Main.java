package fxexamp;

/**
 * Created by user on 5/14/2015.
 */
public class Main {
    public static void main(String[] args) {
        new SimpleFXMenu().startProgram(args);
        AbstractMyInterface myInterface = new AbstractMyInterface();
        myInterface.setMyInterface(new MyInterface() {
            @Override
            public void doSomething() {

            }

            @Override
            public void doSomethingElse() {

            }
        });
    }
}
