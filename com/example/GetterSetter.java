package com.example;

public class GetterSetter {
    private String item;
    private String descriptions;
    private double price;

    //Sets
    public void setItem(String item) {
        this.item = item;
    }

    public void setDescription(String descriptions) {
        this.descriptions = descriptions;
    }


    public void setPrice(double price) {
        this.price = price;

    }


    //Gets
    public String getItem() {
        return this.item;

    }

    public String getDescriptions() {
        return this.descriptions;

    }

    public double getPrice() {
        return this.price;
    }

}
