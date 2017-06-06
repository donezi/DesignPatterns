package com.jakub.mvc;


import com.jakub.builder.User;

public class AboutController implements Controller{

    @Override
    public Object handle() {
        return new User("Kasia", "Cyna", "456231897", 28);
    }
}
