package org.example.Model;

import java.util.ArrayList;
import java.util.Collection;

public class Student {
    private String name;
    private String surname;
    private Collection<Double> marks;
    public Student(String name, String surname, Collection<Double> marks){
        this.name = name;
        this.surname = surname;
        this.marks = marks;
    }
    public Collection<Double> getMarks() {
        return marks;
    }
    public void setMarks(Collection<Double> marks) {
        this.marks = marks;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
