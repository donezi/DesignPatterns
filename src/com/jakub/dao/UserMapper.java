package com.jakub.dao;


import com.jakub.builder.User;

public class UserMapper {
    public User map(String userInString) {
        String[] split = userInString.split(";");
        return new User(split[0], split[1], split[3], Integer.parseInt(split[2]));
    }

    public String map(User user) {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder
                .append(user.getFirstName())
                .append(";")
                .append(user.getLastName())
                .append(";")
                .append(user.getAge())
                .append(";")
                .append(user.getPhoneNumber())
                .toString();
    }
}
