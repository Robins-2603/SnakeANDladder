package com.snake_ladder;

public class Game {
    public static void  main(String[] args) {
        System.out.println("Welcome to Snake & Ladder game");
        // assigning player1 at initial position 0
        int player1 = 0;
        System.out.println("player1 standing at " + player1);
        int randomCheck=(int) Math.floor(Math.random() * 10) % 6+1;
        System.out.println(randomCheck);

    }
}
