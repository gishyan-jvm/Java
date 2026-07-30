package com.arthur.education.abstraction;

public abstract class UserServiceAbstract {

    public abstract void login(String username, String password);

    public void register(String name, String lastName) {
        System.out.printf("User %s %s registered using abstract class", name, lastName);
    }

}
