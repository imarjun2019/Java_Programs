package com.many;

import java.util.Set;

public class Course {

    private int cid;
    private String cname;
    private int duration;
    private Set student;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Set getStudent() {
        return student;
    }

    public void setStudent(Set student) {
        this.student = student;
    }
}
