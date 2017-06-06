package com.jakub.mvc;


public interface View<T> {
    String home(T model);
}