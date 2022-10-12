package com.janettecampbell;

public class OuterClass1 {
    public class InnerClass {
        public void display() {
            System.out.println("This is an inner class");
        }
    }

    public void inner() {
        OuterClass.InnerClass in = new OuterClass.InnerClass();
        in.display();
    }
}
