package com.arthur.education.abstraction;

public class UService extends UserServiceAbstract {

    @Override
    public void login(String username, String password) {
        //do something
        System.out.println("Login");
    }

    @Override
    public void register(String name, String lastName) {
        System.out.printf("User %s %s registered using UserService class", name, lastName);
    }
}
