package com.janettecampbell;

public class OuterClass2 {
    public void inner() {
        class InnerClass {
            public void display () {
                System.out.println("Inner Class");
            }
        }

        InnerClass in = new InnerClass();
        in.display();
    }
}
