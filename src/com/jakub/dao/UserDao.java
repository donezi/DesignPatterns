package com.jakub.dao;

import com.jakub.builder.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser (User user);
}
