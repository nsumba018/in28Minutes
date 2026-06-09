package com.rab;

public class Employee extends Person{
    private String employeeName;
    private String employeePosition;

    public Employee(String name, String employeePosition) {
        super(name);
        this.employeePosition = employeePosition;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition;
    }


    public String toString(){
        return super.toString() + ", Position: " + employeePosition;
    }
}
