package com.leagues;

public class Leagues {

    private int lid;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    private String name;
    private String country;
    private int total_teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getTotal_teams() {
        return total_teams;
    }

    public void setTotal_teams(int total_teams) {
        this.total_teams = total_teams;
    }
}
