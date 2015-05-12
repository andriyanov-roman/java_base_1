package figure;


 public abstract class Figure {
 private String name;

 public String getName() {
 return name;
 }

 public void setName(String name) {
 this.name = name;
 }

 public abstract double getPerimeter();
 public abstract double getSquare();


 }

