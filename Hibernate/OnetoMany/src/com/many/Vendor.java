package com.many;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Vendor {

    private int id;
    private String name;
    //private Set x;
    //private List x;
    private Map x;

    public Map getX() {
        return x;
    }

    public void setX(Map x) {
        this.x = x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    public Set getX() {
        return x;
    }

    public void setX(Set x) {
        this.x = x;
    }

     */
}
