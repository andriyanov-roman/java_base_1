package oop.stat;

import java.util.ArrayList;

/**
 * Created by user on 5/7/2015.
 */
public class A {
    public int o;
    A a = new A();
    public static class C {

    }

    private A() {

    }

    public void makeConnection(String password, String url, String login) {
        System.out.println("Start connection to DB");
    }

    private final static ArrayList<String> colors = new ArrayList<>();
    private static ArrayList<String> secondColors = new ArrayList<>();

    static {
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
    }

    public int i = 0;
    public static int b = 1;

    public static void doSomething() {
        System.out.println("From class A" + colors.toString());
    }

    public void doSomethingElse() {
        System.out.println("From class A");
    }
}
