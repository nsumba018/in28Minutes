package com.rab;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student = new Student("Herve", 98,99,100);
        Student student1 = new Student("Nsumba", 95,96,94);
        Student student2 = new Student("Irakoze", 99,99,100);
        int number = student.getNumberOfMarks();
        System.out.println("NUmber of marks: " + number);
        int sum = student.getSumOfMarks();
        System.out.println("Sum of the marks are: " + sum);
        int maximum = student.getMaximumMarks();
        System.out.println("Maximum of the marks is: " + maximum);
        BigDecimal average = student.getAverage();
        System.out.println("Average: " + average);
        System.out.println(student);
        student.addMarks(78);
        student.removeMarkAtIndex(1);
        System.out.println(student);
    }
}