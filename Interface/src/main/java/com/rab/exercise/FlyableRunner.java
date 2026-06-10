package com.rab.exercise;

interface FlyAble{
    void fly();
}

class Birds implements FlyAble{

    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}

class Aeroplane implements  FlyAble{

    @Override
    public void fly() {
        System.out.println("Fly with fuel");
    }
}
public class FlyableRunner {
    public static void main(String[] args){
        FlyAble[] flyAbles = {new Birds(), new Aeroplane()};
        for(FlyAble object: flyAbles){
            object.fly();
        }
    }
}
