package com.arthur.education;

public class Main {
    public static void main(String[] args) {
        helloPrinter("Hello", "Arthur");
        divOfTwo(8,4);


        System.out.println("Sum : " + sumOfTwo(5,6));



    }

    public static void helloPrinter(String message, String userName) {
        System.out.println(message + "\n" + userName);
    }

    public static int sumOfTwo(int num1, int num2) {
        return num1 + num2;
    }

    public static void divOfTwo(int num1, int num2) {
        System.out.println("Division : " + (float)(num1 / num2));
    }
}
