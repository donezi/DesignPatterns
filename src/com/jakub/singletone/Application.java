package com.jakub.singletone;

import java.util.Scanner;

/**
 * Created by Jakub on 02.06.2017.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("")) {
                Consumer.processValue();
            } else {
                Producer.addValue(value);
            }
            System.out.println();
        }
    }
}
