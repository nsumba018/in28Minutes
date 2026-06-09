package com.rab;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        String value = person.toString();
        person.setName("Herve");
        person.setEmail("herve.irakoze@auca.ac.rw");
        student.setName("Nsumba");
        student.setCollege("Auca");
        System.out.println(person);
        System.out.println(value);
    }
}