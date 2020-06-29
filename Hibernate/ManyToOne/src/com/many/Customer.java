package com.many;

public class Customer {

    private int cid;
    private String name;
    private Vendor v;

    public Vendor getV() {
        return v;
    }

    public void setV(Vendor v) {
        this.v = v;
    }

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

   }
