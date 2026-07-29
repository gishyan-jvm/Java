package com.arthur.education;

import com.arthur.education.abstraction.UService;
import com.arthur.education.human.Human;

public class Main {
    public static void main(String[] args) {
//        UService user = new UService();
//
//        user.register("Arthur", "Gishyan");

        Human.message = "We are trying static";

        Integer sum = Human.sum(5,60);

        System.out.println("Sum using static: " + sum);

        Human human = new Human();
        Human human1 = new Human();
        Human human2 = new Human();
        Human human3 = new Human();
        Human human4 = new Human();
        Human human5 = new Human();
        Human human6 = new Human();
        Human human7 = new Human();

        System.out.println(human.getCount());
    }
}
