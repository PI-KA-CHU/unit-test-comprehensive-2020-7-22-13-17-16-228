package com.oocl.unitTest;

public class GameControl {

    private int remainingTimes;
    private GuessNumber guessNumber;
    private boolean isWin = false;

    public GameControl(int remainingTimes) {
        this.remainingTimes = remainingTimes;
        this.guessNumber = new GuessNumber();
    }

    public int getRemainingTimes() {
        return remainingTimes;
    }

    public void setRemainingTimes(int remainingTimes) {
        this.remainingTimes = remainingTimes;
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
            return output;
        }
        return "Wrong Input，Input again\n";
    }


}
