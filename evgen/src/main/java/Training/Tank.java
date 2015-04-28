package Training;

/**
 * Created by ������� on 28.04.2015.
 */
public class Tank {
   private Engine engine;
   private String color;
   private int body;
   private Cannon cannon;


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public Cannon getCannon() {
        return cannon;
    }

    public void setCannon(Cannon cannon) {
        this.cannon = cannon;
    }

    public void shoot(Tank tank) {
        int body = tank.getBody();
        tank.setBody(body - this.getCannon().damage());
    }
    /* t1.shoot(t2);*/

}
