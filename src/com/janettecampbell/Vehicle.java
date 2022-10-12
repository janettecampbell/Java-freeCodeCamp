package com.janettecampbell;

public interface Vehicle {
    final int gears = 5;

    void speedUp(int a);
    void slowDoan(int a);
    void changeGear(int a);

    default void out() {
        System.out.println("Default method");
    }

    static int math(int b){
        return b + 9;
    }

}
