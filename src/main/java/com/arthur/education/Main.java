package com.arthur.education;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.setName("*");
        System.out.println(human.getName());

        human.lastName = "Gishyan";
        human.gender = "Male";
        human.age = 19;
    }
}
