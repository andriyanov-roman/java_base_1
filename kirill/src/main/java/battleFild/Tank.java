package battleFild;

/**
 * Created by Pipin on 28.04.2015.
 */
public class Tank {
    private String color;
    private int body;
    private String name;
    private Engine engine;
    private Cannon cannon;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cannon getCannon() {
        return cannon;
    }

    public void setCannon(Cannon cannon) {
        this.cannon = cannon;
    }

    public void shoot(Tank tank){
       int body = tank.getBody();
        tank.setBody(body- this.getCannon().damage());
    }



}
