package com.jumpingfox.rpsgame.algorithm;

import com.jumpingfox.rpsgame.ShapeChoice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class RandomStrategyTest {

    private IStrategy strategy;

    @BeforeEach
    void setUp() {
        DeterministicRandom deterministicRandom = new DeterministicRandom();
        strategy = new RandomStrategy(deterministicRandom);
    }

    @RepeatedTest(100)
    void getNextChoice() {
        assertEquals(ShapeChoice.ROCK, strategy.getNextChoice());
        assertEquals(ShapeChoice.PAPER, strategy.getNextChoice());
        assertEquals(ShapeChoice.SCISSORS, strategy.getNextChoice());
        assertEquals(ShapeChoice.ROCK, strategy.getNextChoice());
    }

    private class DeterministicRandom extends Random {
        int sequentialNum = -1;

        DeterministicRandom(){
            super();
        }

        @Override
        public int nextInt(int bound) {
            sequentialNum = (sequentialNum + 1) % bound;
            return sequentialNum;
        }
    }

}