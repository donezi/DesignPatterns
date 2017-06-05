package com.jakub.dao;


import com.jakub.builder.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoInMemory implements UserDao {

    private List<User> users;

    public UserDaoInMemory() {
        users = new ArrayList<>();
        users.add(User.builder()
                .firstName("Jakub")
                .lastName("Piechocki")
                .age(30)
                .phoneNumber("656454858")
                .build());
        users.add(User.builder()
                .firstName("Kasia")
                .lastName("Cyna")
                .age(28)
                .phoneNumber("721852961")
                .build());

    }
    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
