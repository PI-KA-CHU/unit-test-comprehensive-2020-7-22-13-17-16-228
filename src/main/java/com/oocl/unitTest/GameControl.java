package com.oocl.unitTest;

public class GameControl {

    private int remainingTimes;
    private GuessNumber guessNumber;
    private LegalChecker legalChecker;
    private boolean isWin = false;

    public GameControl(int remainingTimes) {
        this.remainingTimes = remainingTimes;
        this.guessNumber = new GuessNumber();
        legalChecker = new LegalChecker();
    }

    public int getRemainingTimes() {
        return remainingTimes;
    }

    public void setRemainingTimes(int remainingTimes) {
        this.remainingTimes = remainingTimes;
    }

    private String isInputLegal(int[] inputNumber){
        boolean isLegal = legalChecker.checkIsLegal(inputNumber);
        if (!isLegal) {
            return "Wrong Input，Input again\n";
        }
        return null;
    }

    public String playGame(int[] inputGuess, int[] answer) {
        if (isWin) {
            return "you are win!\n";
        }
        if (remainingTimes > 0) {
            setRemainingTimes(this.remainingTimes - 1);
            String output = guessNumber.guess(inputGuess, answer);
            if ("4A0B".equals(output)) {
                this.isWin = true;
                return "you are win!\n";
            }
            return output + "\n";
        }
        return "Wrong Input，Input again\n";
    }

    public String start(int[] inputGuess, int[] answer){
        String checkResult = isInputLegal(inputGuess);
        if (checkResult != null) {
            return checkResult;
        }

        return playGame(inputGuess, answer);
    }

}
