package Battlefield;

/**
 * Created by Дима on 28.04.2015.
 */
public class Battlefield {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        t1.setName("Abrams");
        Engine engine = new Engine();
        Cannon cannon = new Cannon();
        engine.setPower(500);
        engine.setVolume(8.5);
        engine.setType("Diesel");
        cannon.setCaliber(120);
        cannon.setLength(6);
        t1.setBody(200);
        t1.setCannon(cannon);
        t1.setEngine(engine);

        Tank t2 = new Tank();
        t2.setName("T-80");
        t2.setCannon(cannon);
        t2.setEngine(engine);
        t2.setBody(150);
        t1.shoot(t2);
        t2.shoot(t1);
        System.out.println(t2.getBody());
        System.out.println(t1.getBody());

    }
}
