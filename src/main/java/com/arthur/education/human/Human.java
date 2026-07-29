package com.arthur.education.human;

import java.util.Date;

public class Human {

    protected String name;
    protected String lastName;
    protected String gender;
    protected Date age;
    public static String message;
    private static int count;

    public Human() {
        count++;
    }

    public Human(String name, String lastName, String gender, Date age) {

    }

    public static Integer sum(int... ints) {

        Integer result = 0;

        for (int anInt : ints) {
            result += anInt;
        }
        return result;
    }

    public String getName() {
        if (this.name.trim().isEmpty()) {
            return "Name is empty";
        } else if (!this.name.matches("[a-zA-Z]")) {
            return "Agreed only letters";
        }
        return this.name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Date getAge() {
        return age;
    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name.trim();
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
