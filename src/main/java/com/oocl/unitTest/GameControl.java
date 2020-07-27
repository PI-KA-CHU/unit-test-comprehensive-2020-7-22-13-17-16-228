package com.oocl.unitTest;

import com.oocl.unitTest.enums.GameEnums;

public class GameControl {

    private int remainingTimes;
    private GuessNumber guessNumber;
    private LegalChecker legalChecker;
    private boolean isWin = false;

    private String WRONG_INPUT_MESSAGE = GameEnums.WRONG_INPUT.getMessage();
    private String WIN_GAME_MESSAGE = GameEnums.WIN_GAME.getMessage();
    private String FAIL_GAME_MESSAGE = GameEnums.FAIL_GAME.getMessage();

    public GameControl(int remainingTimes) {
        this.remainingTimes = remainingTimes;
        this.guessNumber = new GuessNumber();
        this.legalChecker = new LegalChecker();
    }


    public void setRemainingTimes(int remainingTimes) {
        this.remainingTimes = remainingTimes;
    }

    private String isInputLegal(int[] inputNumber){
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);
        if (!isLegal) {
            return WRONG_INPUT_MESSAGE;
        }
        return null;
    }

    public String playGame(int[] inputGuess, int[] answer) {
        if (isWin) {
            return WIN_GAME_MESSAGE;
        }
        if (remainingTimes > 0) {
            setRemainingTimes(this.remainingTimes - 1);
            String output = guessNumber.guess(inputGuess, answer);
            if ("4A0B".equals(output)) {
                this.isWin = true;
                return WIN_GAME_MESSAGE;
            }
            return output;
        }
        return FAIL_GAME_MESSAGE;
    }

    public String start(int[] inputGuess, int[] answer){
        String checkResult = isInputLegal(inputGuess);
        if (checkResult != null) {
            return checkResult;
        }

        return playGame(inputGuess, answer);
    }

}
