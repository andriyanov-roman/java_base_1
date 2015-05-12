package oop;


public class Single {
    private String name;
    private String type;
    private String print;

    private Single() {
    }

    static private Single instance = new Single();

    public static Single getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    @Override
    public String toString() {
        return "Single{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", print='" + print + '\'' +
                '}';
    }
}
