package com.janettecampbell;

public class Student implements Comparable<Student> {
    private String name;

    public Student (String name) {
        this.name = name;
    }

    // override equals to check for name equality
    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        }else {
            return false;
        }
    }

    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
//        return "Student (" +  this.name + ")";
        return this.name;
    }
}
