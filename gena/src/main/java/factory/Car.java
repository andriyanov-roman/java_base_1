package factory;

import java.util.Date;

/**
 * Created by sigen on 5/5/2015.
 */
public class Car {
    private String name;
    private String number;
    private String colour;
    private Date date;
    private String fabricName;
    private boolean ready;
    private String customerName;
    private String customerSecondName;
    private int customerId;
    private double cost;
    //private Owner owner;
    private String type;
    private String description;

    Car(String name, String number, String colour, Date date, String fabricName, boolean ready, double cost, String customerName, String customerSecondName, int customerId, String type, String description ){
        //super(customerName, customerSecondName, customerId);
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSecondName = customerSecondName;
        this.number = number;
        this.name = name;
        this.colour = colour;
        this.date = date;
        this.description = description;
        this.cost = cost;
        this.ready = ready;
        this.fabricName = fabricName;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFabricName() {
        return fabricName;
    }

    public void setFabricName(String fabricName) {
        this.fabricName = fabricName;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    /*
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    */

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSecondName() {
        return customerSecondName;
    }

    public void setCustomerSecondName(String customerSecondName) {
        this.customerSecondName = customerSecondName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
