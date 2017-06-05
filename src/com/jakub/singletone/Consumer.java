package com.jakub.singletone;

/**
 * Created by Jakub on 02.06.2017.
 */
public class Consumer {
    public static void processValue() {
        Queue queue = Queue.getInstance();
        System.out.println("Next value is: " + queue.pop());
    }
}
