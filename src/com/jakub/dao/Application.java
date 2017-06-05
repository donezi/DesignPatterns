package com.jakub.dao;

import com.jakub.builder.User;

import java.io.File;
import java.util.List;


public class Application {
    private static final String PATH = "C:\\Users\\Jakub\\IdeaProjects\\DesignPatterns\\users";
    public static void main(String[] args) {
        UserDao userDao = new UserDaoInFile(new File(PATH));//or PATH
        userDao.addUser(User.builder()
                .firstName("Nowy")
                .lastName("Zawodnik")
                .age(40)
                .phoneNumber("777555333")
                .build());

        List<User> allUser = userDao.getAllUsers();
        allUser.forEach(System.out::println);
//        allUser.forEach(System.out::println);
    }
}
