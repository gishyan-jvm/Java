package com.arthur.education.abstraction;

public interface UserService {
    void login(String userName, String password);
    void register(String userName, String email, String password);
}
