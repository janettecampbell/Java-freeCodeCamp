package com.janettecampbell;

public class Dog {
    protected static int count = 0;
    protected String name;
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count++; // includes extended Cat instances
        Dog.display();
//        Dog.display2(); // doesn't work because no instance
    }

    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old!");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge (int age) {
        this.age = age;

    }

    private int add2() {
        return this.age + 2;
    }

    public static void display() {
        System.out.println("I am a dog!");
    }

    public void display2() {
        System.out.println("I am a dog2!");
    }
}
