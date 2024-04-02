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

    public int getAge() {
        return this.age;
    }

    public String gtColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public double getMiliegae() {
        return this.mileage;
    }


}
