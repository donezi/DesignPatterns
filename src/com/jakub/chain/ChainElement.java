package com.jakub.chain;

public interface ChainElement {

    boolean isMyResponsibility(int phoneNumber);

    void doAction();
}