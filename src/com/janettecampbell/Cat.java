package com.janettecampbell;

public class Cat extends Dog{
    private int food;

    public Cat(String name, int age, int food) {
        // if person enters all arguments
        super(name, age);
        this.food = food; // new variable just for Cat
    }

    public Cat(String name, int age) {
        // if person enters only two arguments
        super(name, age);
        this.food = 50;
    }

    public Cat (String name) {
        // if person enters only one argument
        super(name, 0); // Age came from Dog so must have value
        this.food = 50;
    }

    public void speak() {
        System.out.println("Meow, my name is " + this.name + " and I get fed " + food);
    }

    public void eat (int x) {
        this.food -= x;
    }
}
