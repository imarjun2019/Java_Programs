package com.tightcpl;

public class Engine {
    private int eid;
    private String brand,model;

    public Engine(int eid, String brand, String model) {
        this.eid = eid;
        this.brand = brand;
        this.model = model;
    }

    public void EngineDetails()
    {
        System.out.println("\n\n==========Engine Details==========");
        System.out.printf("Engine id: %d\nEngine Model: %s\nEngine Brand: %s",eid,model,brand);
    }

}

