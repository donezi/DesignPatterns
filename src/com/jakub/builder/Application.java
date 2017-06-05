package com.jakub.builder;


public class Application {
    public static void main(String[] args) {

        User user = User.builder()
                .firstName("Jakub")
                .lastName("Piechocki")
                .phoneNumber("656454858")
                .age(30)
                .build();
//        User user = new User();
//        user.setFirstName("Jakub");
//        user.setLastName("Piechocki");
//        user.setPhoneNumber("656454858");
//        user.setAge(30);
//
        System.out.println(user);
    }
}
