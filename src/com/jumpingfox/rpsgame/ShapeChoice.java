package com.jumpingfox.rpsgame;

/**
 * Possible shapes a player can choose from
 * */
public enum ShapeChoice {
    ROCK,
    PAPER,
    SCISSORS;

    /**
     * Compare current choice with other one
     * @param otherChoice choice to compare to
     * @return GameResult
     * */
    public GameResult compareChoices(ShapeChoice otherChoice) {
        if (this == otherChoice) {
            return GameResult.DRAW;
        }

        switch (this) {
            case ROCK:
                return (otherChoice == SCISSORS ? GameResult.WIN : GameResult.LOSS);
            case PAPER:
                return (otherChoice == ROCK ? GameResult.WIN : GameResult.LOSS);
            case SCISSORS:
                return (otherChoice == PAPER ? GameResult.WIN : GameResult.LOSS);
        }

        return GameResult.DRAW;
    }
}
