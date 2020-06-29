package com.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Course {
    private Map studentCourse;


    public void setStudentCourse(Map studentCourse) {
        this.studentCourse = studentCourse;
    }

public void details()
{
    Set s = studentCourse.entrySet();
    Iterator i = s.iterator();

    while(i.hasNext())
    {
        Map.Entry me = (Map.Entry)i.next();
        System.out.println(me.getKey() + " " + me.getValue());
    }
}
}
