package com.oocl.unitTest;

public class GameControl {

    private int remainingTimes;
    private GuessNumber guessNumber;

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
        if (hasRemainingTimes()) {
            setRemainingTimes(this.remainingTimes - 1);
            return guessNumber.guess(inputGuess, answer) + "\n";
        }

        return "Wrong Input，Input again\n";
    }

    private boolean hasRemainingTimes(){
        if (this.remainingTimes > 0) {
            return true;
        }

        return false;
    }
}
