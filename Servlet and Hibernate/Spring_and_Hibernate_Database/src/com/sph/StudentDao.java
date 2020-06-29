package com.sph;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
    HibernateTemplate ht;

    public void setHt(HibernateTemplate ht) {
        this.ht = ht;
    }

    public void saveStudentDetails(Student s)
    {
        ht.save(s);
    }

    public void updateStudent(Student s)
    {
        ht.update(s);
    }

    public void deleteStudent(Student s)
    {
        ht.delete(s);
    }

    public Student getDetails(int id)
    {
        Student s = (Student)ht.get(Student.class,id);
        return s;
    }
}
