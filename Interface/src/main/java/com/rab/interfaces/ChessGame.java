package com.rab.interfaces;

public class ChessGame implements GamingConsole{
    @Override
    public void up() {
        System.out.println("Move to the front");
    }

    @Override
    public void down() {
        System.out.println("Move ot the back");
    }

    @Override
    public void left() {
        System.out.println("Move to the left");
    }

    @Override
    public void right() {
        System.out.println("Move to the right");
    }
}
