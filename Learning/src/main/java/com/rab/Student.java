package com.rab;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public Student(String name, int... marks) {
        this.name = name;
        for(int mark:marks){
            this.marks.add(mark);
        }
    }

    public String toString(){
        return "Student:name='" + name + "', marks=" + marks + "}";
    }
    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getSumOfMarks() {
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMarks() {
        return Collections.max(marks);
    }

    public BigDecimal getAverage() {
        int sum = getSumOfMarks();
        int number = getNumberOfMarks();
        return new BigDecimal(sum / number);
    }

    public void addMarks(int mark) {
        marks.add(mark);
    }

    public void removeMarkAtIndex(int index) {
        marks.remove(index);
    }
}
