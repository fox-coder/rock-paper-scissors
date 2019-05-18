package com.jumpingfox.rpsgame;

import com.jumpingfox.rpsgame.algorithm.AlwaysRockStrategy;
import com.jumpingfox.rpsgame.algorithm.RandomStrategy;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Player 1", new RandomStrategy());
        Player player2 = new Player("Player 2", new AlwaysRockStrategy());

        RPSGame rpsGame = new RPSGame(player1, player2);
        rpsGame.playSeveralRounds(100);
        rpsGame.printGameStats();

    }
}
