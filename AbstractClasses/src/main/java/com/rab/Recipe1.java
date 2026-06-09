package com.rab;

public class Recipe1 extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Gather the raw materials");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Cleanup the utensils");
    }
}
