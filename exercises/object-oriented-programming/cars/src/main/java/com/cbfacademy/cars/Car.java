package com.cbfacademy.cars;

public class Car {

    private String make;
    private String model;
    private int year;
    private String colour;

    public Car(String make, String model, String colour, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;

    }

    public String getMake() {

        return make;
    }

    public String getModel() {

        return model;
    }

    public int getYear() {

        return year;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;

    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDetails() {
        String details = String.format(
                "The car is a %s, and a %s, made in %s. It is %s",
                this.make, this.model, this.year, this.colour);

        return details;
    }

}