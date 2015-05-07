package factoryCars;

import java.util.Calendar;
import java.util.Date;

public class Machine {

    private String name;
    private String type;
    private String owner;
    private int nomber;
    private String color;
    private String factoryname;
    private String status;
    private String desc;
    private double price;
    private Calendar prodDate = Calendar.getInstance();

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getOwner(){
        return owner;
    }
    public int getNomber(){
        return nomber;
    }
    public String getColor(){
        return color;
    }
    public String getFactoryname(){
        return factoryname;
    }
    public String getStatus(){
        return status;
    }
    public String getDesc(){
        return desc;
    }
    public double getPrice(){
        return price;
    }
    public Date getProdDate(){
        return prodDate.getTime();
    }

    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setOwner(String owner){
        this.owner=owner;
    }
    public void setNomber(int nomber){
        this.nomber=nomber;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFactoryname(String factoryname){
        this.factoryname=factoryname;
    }
    public void setStatus(String status){
        this.status=status;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setProdDate(int year, int month, int date){
        this.prodDate.set(year, month, date);
    }

}
