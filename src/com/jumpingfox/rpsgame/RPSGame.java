package com.jumpingfox.rpsgame;

/**
 * Represent the game logic with two players
 * */
public class RPSGame {

    private Player player1;
    private Player player2;
    private int numberOfGames;

    public RPSGame(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.numberOfGames = 0;
    }

    /**
     * Play one round of the game
     * */
    private void playOnce() {
        ShapeChoice firstPlayerChoice = player1.play();
        ShapeChoice secondPlayerChoice = player2.play();

        GameResult result = firstPlayerChoice.compareChoices(secondPlayerChoice);
        switch (result) {
            case DRAW:
                player1.increaseDraws();
                player2.increaseDraws();
                break;
            case WIN:
                player1.increaseWins();
                break;
            case LOSS:
                player2.increaseWins();
                break;
        }
        numberOfGames++;
    }

    /**
     * Play several rounds of the game
     * @param amountOfGames number of games to play
     * */
    public void playSeveralRounds(int amountOfGames) {
        for (int i = 0; i<amountOfGames; i++) {
            playOnce();
        }
    }

    /**
     * Print the resulting statistics of played games
     * */
    public void printGameStats() {
        System.out.println("Total number of played games: " + numberOfGames);

        System.out.println(player1);
        System.out.println(player2);
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }
}
