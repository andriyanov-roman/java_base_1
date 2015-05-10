package work.oop.factory;

import java.time.LocalDate;

/**
 * Класс Авто
 */
public class Avto extends FactoryCars {
    private String name; //название
    private String proprietor;//владелец
    private String style; // тип
    private int number; //номер
    private String color; //цвет
    private String ready; //готовность
    private String description; //описание
    private int price; //стоимость

    public String getProprietor() {
        return proprietor;
    }

    public void setProprietor(String proprietor) {
        this.proprietor = proprietor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getReady() {
        return ready;
    }

    public void setReady(String ready) {
        this.ready = ready;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


    @Override
    public String toString() {
        return super.toString() + name + ":" + description + ":" + ready;
    }


}
