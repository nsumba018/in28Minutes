package com.rab;

public class Student  extends Person{
    private String college;
    private String faculty;

    public Student(String name, String email, String phoneNumber, String college, String faculty) {
        super(name, email, phoneNumber);
        this.college = college;
        this.faculty = faculty;
    }
}
