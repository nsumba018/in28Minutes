package com.rab;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FanRunner {
    public static void main(String[] args) {
    Fan fan = new Fan("Nvidia", 0.6799, "Green");
        fan.switchOn();
        System.out.println(fan);
        fan.setSpeed((byte)10);
        System.out.println(fan);
        fan.switchOff();
        System.out.println(fan);
    }
}