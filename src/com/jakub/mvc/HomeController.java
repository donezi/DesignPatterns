package com.jakub.mvc;


import com.jakub.builder.User;

public class HomeController implements Controller {
    @Override
    public Object handle() {
        return new User("Jakub", "Piechocki", "656454858", 30);
    }
}
