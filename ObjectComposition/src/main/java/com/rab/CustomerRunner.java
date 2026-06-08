package com.rab;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CustomerRunner {
    public static void main(String[] args) {
        Address homeAddress = new Address("line1", "Kigali",60999);
        Customer customer = new Customer("Range", homeAddress);

        Address workAddress = new Address("line 1 for work", "Bujumbura", 78099);
        customer.setWorkAddress(workAddress);
        System.out.println(customer);

    }
}