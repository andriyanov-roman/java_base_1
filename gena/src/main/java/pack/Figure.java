package pack;

/**
 * Created by sigen on 4/30/2015.
 */
public class Figure {

    Figure(){}

    Figure(String name){
        this.name = name;
    }
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter(){
        return 0;
    }

    public double getSquare(){
        return 0;
    }
}
