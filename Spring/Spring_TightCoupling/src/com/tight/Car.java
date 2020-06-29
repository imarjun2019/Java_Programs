package com.tight;

public class Car {
    private int cid;
    private String name, make, model;
    private Engine engine;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void CarDetails()
    {
        System.out.println("==========Car Details==========");
        System.out.printf("Car id: %d\nCar Name: %s\nCar Make: %s\nCar Model: %s",cid,name,make,model);
        System.out.println("\n\n==========Engine Details==========");
        System.out.printf("Engine id: %d\nEngine Model: %s\nEngine Brand: %s",engine.getEid(),engine.getModel(),engine.getBrand());
    }
}
