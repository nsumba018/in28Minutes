package com.rab;
//every class which do not extend any other class by default it extends Object to use all the build in methods that Object has to offer
//that is why when we create an object of the class i has other methods which we did not create ourselves and they are the mehtods from Object
public class Person {
    private String name;
    private String email;
    private String phoneNumber;

    public Person(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("name: %s, email: %s, phoneNumber: %s", name, email,phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
