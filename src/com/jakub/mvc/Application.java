package com.jakub.mvc;


import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.handle("about json");

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (counter<5) {
            counter++;
            String s = scanner.nextLine();
            frontController.handle(s);
        }
    }
}
