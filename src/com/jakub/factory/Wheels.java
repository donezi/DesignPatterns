package com.jakub.factory;

/**
 * Created by Jakub on 02.06.2017.
 */
public class Wheels {

    private int size;
    private String type;

    public Wheels(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
