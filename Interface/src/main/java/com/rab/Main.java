package com.rab;

import com.rab.interfaces.ChessGame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChessGame chessGame = new ChessGame();
        chessGame.up();
        chessGame.left();
        chessGame.right();
        chessGame.down();
    }
}