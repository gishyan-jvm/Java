package com.arthur.education.abstraction;

public class UserController implements UserService{

    @Override
    public void login(String userName, String password) {
        System.out.printf("User %s logged in successfully", userName);
    }

    @Override
    public void register(String userName, String email, String password) {
        System.out.printf("User %s registered successfully(", userName);
    }
}
