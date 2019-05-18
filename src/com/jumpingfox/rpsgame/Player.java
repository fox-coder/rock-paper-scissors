package com.jumpingfox.rpsgame;

import com.jumpingfox.rpsgame.algorithm.IStrategy;

/**
 * Represent player
 * */
public class Player {

    private final String name;
    private final IStrategy strategy;
    private int winsCount;
    private int drawsCount;

    public Player(String name, IStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
        this.winsCount = 0;
        this.drawsCount = 0;
    }

    /**
     * choose a shape according to player's strategy
     * */
    public ShapeChoice play() {
        return strategy.getNextChoice();
    }

    public void increaseWins() {
        winsCount++;
    }

    public void increaseDraws() {
        drawsCount++;
    }

    public int getWinsCount() {
        return winsCount;
    }

    public int getDrawsCount() {
        return drawsCount;
    }

    @Override
    public String toString() {
        return "Player " + name +
               " has won " + winsCount +
               " games and made " + drawsCount +
               " draws";
    }
}
