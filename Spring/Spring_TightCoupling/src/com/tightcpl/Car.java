package com.tightcpl;

public class Car {
    private int cid;
    private String name, make, model;
    private Engine engine;

    public Car(int cid, String name, String make, String model, Engine engine) {
        this.cid = cid;
        this.name = name;
        this.make = make;
        this.model = model;
        this.engine = engine;
    }
    public void CarDetails()
    {
        System.out.println("==========Car Details==========");
        System.out.printf("Car id: %d\nCar Name: %s\nCar Make: %s\nCar Model: %s",cid,name,make,model);
        engine.EngineDetails();
    }
}
