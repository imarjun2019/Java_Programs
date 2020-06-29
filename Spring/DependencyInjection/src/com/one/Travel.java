package com.one;

public class Travel implements Journey {
    private Vehicle v;
    public void setV(Vehicle v)
    {
        this.v = v;
    }

    @Override
    public void startJourney() {
        System.out.println("Journey has Started");
        v.move();
    }

}
