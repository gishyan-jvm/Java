package com.arthur.education.human;

import java.util.Date;

public class Student extends Human {

    private String course;
    private String faculty;
    private float aqs;

    public Student(String name, String lastName, String gender, Date age) {
        super(name, lastName, gender, age);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public float getAqs() {
        return aqs;
    }

    public void setAqs(float aqs) {
        this.aqs = aqs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", faculty='" + faculty + '\'' +
                ", aqs=" + aqs +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
