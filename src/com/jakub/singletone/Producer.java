package com.jakub.singletone;

import java.security.PublicKey;

/**
 * Created by Jakub on 02.06.2017.
 */
public class Producer {

    public static void addValue(String value) {
        Queue.getInstance().push(value);
    }
}
