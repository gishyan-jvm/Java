package com.arthur.education;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        UService user = new UService();
//
//        user.register("Arthur", "Gishyan");

//        Human.message = "We are trying static";
//
//        Integer sum = Human.sum(5,60);
//
//        System.out.println("Sum using static: " + sum);
//
//        Human human = new Human();
//        Human human1 = new Human();
//        Human human2 = new Human();
//        Human human3 = new Human();
//        Human human4 = new Human();
//        Human human5 = new Human();
//        Human human6 = new Human();
//        Human human7 = new Human();
//
//        System.out.println("Count via static: " + Human.getCount());

//        JFrame jFrame = new JFrame("Test app");
//        jFrame.setBackground(Color.BLACK);
//        jFrame.setSize(600,600);
//        jFrame.setVisible(true);
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        System.out.println(factorial(4));
        System.out.println(fibonacci(12));

    }

    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static int fibonacci(int number) {

        if (number == 0) return 0;

        if (number == 1 || number == 2) return 1;

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}