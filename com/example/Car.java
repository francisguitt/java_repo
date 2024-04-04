package com.example;

public class Car {
    public String brand;
    public int age;
    public String color;
    public String model;
    public double mileage;

    public Car(String brand, int age,
               String color,
               String model,
               double mileage) {
        this.brand = brand;
        this.age = age;
        this.color = color;
        this.model = model;
        this.mileage = mileage;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMiliegae() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


}
