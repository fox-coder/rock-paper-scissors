package com.jumpingfox.rpsgame.algorithm;

import com.jumpingfox.rpsgame.ShapeChoice;

import java.util.Random;

public class RandomStrategy implements IStrategy {

    private final Random random;

    public RandomStrategy() {
        random = new Random(System.currentTimeMillis());
    }

    RandomStrategy(Random random) {
        this.random = random;
    }

    @Override
    public ShapeChoice getNextChoice() {
        ShapeChoice[] choices = ShapeChoice.values();
        return choices[random.nextInt(choices.length)];
    }
}
