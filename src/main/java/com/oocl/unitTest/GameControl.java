package com.oocl.unitTest;

import com.oocl.unitTest.enums.GameEnums;

import java.util.List;

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

    private String isInputLegal(List<Integer> inputNumber){
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);
        if (!isLegal) {
            return WRONG_INPUT_MESSAGE;
        }
        return null;
    }

    public String start(List<Integer> inputGuess, List<Integer> answer){
        String checkResult = isInputLegal(inputGuess);
        if (checkResult != null) {
            return checkResult;
        }

        return playGame(inputGuess, answer);
    }

    public String playGame(List<Integer> inputGuess, List<Integer> answer) {
        if (isWin) {
            return WIN_GAME_MESSAGE;
        }

        if (isGameHasRemainingTimes()) {
            reduceRemainingTime();
            String guessResult = guessNumber.guess(inputGuess, answer);
            return checkIsWin(guessResult) ? WIN_GAME_MESSAGE : guessResult;
        }
        return FAIL_GAME_MESSAGE;
    }

    private boolean isGameHasRemainingTimes(){
        return remainingTimes > 0;
    }

    private void reduceRemainingTime(){
        this.remainingTimes --;
    }

    private boolean checkIsWin(String guessResult){
        final String WIN_RETURN_MESSAGE = "4A0B";
        if (WIN_RETURN_MESSAGE.equals(guessResult)) {
            this.isWin = true;
            return true;
        }
        return false;
    }
}
