package HTask.Batellfild;

import com.sun.xml.internal.ws.api.pipe.Engine;

/**
 * Created by Евгений on 28.04.15.
 */
public class Batellfild {
    public static void main(String[] args) {
        Tank t1 = new Tank ();
        Motor engine = new Motor();
        Cannon cannon = new Cannon();
        engine.setPower(500);
        engine.setType("Disel");
        engine.setName("IS");
        cannon.setCaliber(120);
        cannon.setLength(5);
        t1.getBody(200);
        t1.getCannon(cannon);
        t1.setEngine(engine);



    }
}
