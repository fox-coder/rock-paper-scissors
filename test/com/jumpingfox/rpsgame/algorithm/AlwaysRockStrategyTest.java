package com.jumpingfox.rpsgame.algorithm;

import com.jumpingfox.rpsgame.ShapeChoice;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlwaysRockStrategyTest {

    private IStrategy strategy = new AlwaysRockStrategy();

    @RepeatedTest(100)
    void getNextChoice() {
        assertEquals(ShapeChoice.ROCK, strategy.getNextChoice());
    }
}