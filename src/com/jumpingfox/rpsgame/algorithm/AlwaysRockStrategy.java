package com.jumpingfox.rpsgame.algorithm;

import com.jumpingfox.rpsgame.ShapeChoice;

public class AlwaysRockStrategy implements IStrategy {

    @Override
    public ShapeChoice getNextChoice() {
        return ShapeChoice.ROCK;
    }
}
