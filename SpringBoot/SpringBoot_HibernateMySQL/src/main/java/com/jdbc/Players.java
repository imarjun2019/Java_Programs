package com.jdbc;

import org.springframework.stereotype.Component;



import javax.persistence.*;


@Entity
@Table(name = "players")
public class Players {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pid;
    @Column(name="name")
    private String name;
    @Column(name="team")
    private String team;
    @Column(name="country")
    private String country;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
