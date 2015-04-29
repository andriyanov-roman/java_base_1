package exampl.bfGame;

/**
 * Created by ������� on 28.04.2015.
 */
public class BattleField {

    public static void main(String[] args) {
        Engine engine = new Engine();
        Cannon cannon = new Cannon();

        Tank t1 = new Tank();
        engine.setPower(500);
        engine.setVolume(0.5);
        engine.setType("Disel");
        cannon.setCaliber(120);
        cannon.setLenght(6);

        t1.setCannon(cannon);
        t1.setEngine(engine);
        t1.setBody(200);

        Tank t2 = new Tank();
        t2.setCannon(cannon);
        t2.setEngine(engine);
        t2.setBody(150);

        t1.shoot(t2);
        t2.shoot(t1);
        System.out.println(t2.getBody());
        System.out.println(t1.getBody());
    }
}
