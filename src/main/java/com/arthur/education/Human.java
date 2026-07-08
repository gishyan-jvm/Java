package com.arthur.education;

public class Human {

    private String name;
    String lastName;
    String gender;
    int age;

    Human() {

    }

    public String getName() {
        if (this.name.trim().isEmpty()) {
            return "Name is empty";
        }
        else if (!this.name.matches("[a-zA-Z]")) {
            return "Agreed only letters";
        }
        return this.name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }
}
