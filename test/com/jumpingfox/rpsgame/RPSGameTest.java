package com.jumpingfox.rpsgame;

import com.jumpingfox.rpsgame.algorithm.AlwaysRockStrategy;
import com.jumpingfox.rpsgame.algorithm.RandomStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class RPSGameTest {

    private RPSGame rpsGame;
    private Player player1;
    private Player player2;

    @Test
    void playDrawGame() {
        player1 = new Player("Player 1", new AlwaysRockStrategy());
        player2 = new Player("Player 2", new AlwaysRockStrategy());
        rpsGame = new RPSGame(player1, player2);
        rpsGame.playSeveralRounds(100);
        assertEquals(100, rpsGame.getNumberOfGames());
        assertEquals(100, player1.getDrawsCount());
        assertEquals(100, player2.getDrawsCount());
        assertEquals(0, player1.getWinsCount());
        assertEquals(0, player2.getWinsCount());
    }

    @Test
    void playRandomGame() {
        player1 = new Player("Player 1", new RandomStrategy());
        player2 = new Player("Player 2", new RandomStrategy());
        rpsGame = new RPSGame(player1, player2);
        rpsGame.playSeveralRounds(100);
        assertEquals(100, rpsGame.getNumberOfGames());
        assertEquals(100, player1.getWinsCount() + player2.getWinsCount() + player1.getDrawsCount());
        assertEquals(player1.getDrawsCount(), player2.getDrawsCount());
    }

}