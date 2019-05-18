package com.jumpingfox.rpsgame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static com.jumpingfox.rpsgame.GameResult.DRAW;
import static com.jumpingfox.rpsgame.GameResult.LOSS;
import static com.jumpingfox.rpsgame.GameResult.WIN;
import static com.jumpingfox.rpsgame.ShapeChoice.PAPER;
import static com.jumpingfox.rpsgame.ShapeChoice.ROCK;
import static com.jumpingfox.rpsgame.ShapeChoice.SCISSORS;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ShapeChoiceTest {

    private ShapeChoice firstChoice;
    private ShapeChoice secondChoice;
    private GameResult expectedResult;

    public ShapeChoiceTest(ShapeChoice firstChoice, ShapeChoice secondChoice, GameResult expectedResult) {
        this.firstChoice = firstChoice;
        this.secondChoice = secondChoice;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions() {
        return Arrays.asList(new Object[][]{
                {ROCK, SCISSORS, WIN},
                {ROCK, ROCK, DRAW},
                {ROCK, PAPER, LOSS},

                {PAPER, PAPER, DRAW},
                {PAPER, ROCK, WIN},
                {PAPER, SCISSORS, LOSS},

                {SCISSORS, PAPER, WIN},
                {SCISSORS, ROCK, LOSS},
                {SCISSORS, SCISSORS, DRAW}
        });
    }


    @Test
    public void compareChoices() {
        assertEquals(expectedResult, firstChoice.compareChoices(secondChoice));
    }
}