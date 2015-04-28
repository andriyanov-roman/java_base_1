package battleFild;

/**
 * Created by Pipin on 28.04.2015.
 */
public class MAP {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Engine engine = new Engine();
    Cannon cannon= new Cannon();
                engine.setPower(500);
        engine.setType("Desel");
        engine.setVolume(8.5);
        cannon.setCaliber(120);
        cannon.setLength(6);

        t1.setEngine(engine);
        t1.setCannon(cannon);

        Tank t2 = new Tank();
        t2.setCannon(cannon);
        t2.setEngine(engine);
        t2.setBody(150);

        t1.shoot((t2));
        System.out.println(t2.getBody());
        System.out.println(t1.getBody());

        Jet f1 = new Jet();


    }

}
