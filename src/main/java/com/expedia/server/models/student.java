package com.expedia.server.models;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {

    private String name;
    @Id
    private int rollNo;
    private int grade;
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", grade=" + grade +
                ", city='" + city + '\'' +
                '}';
    }
}
