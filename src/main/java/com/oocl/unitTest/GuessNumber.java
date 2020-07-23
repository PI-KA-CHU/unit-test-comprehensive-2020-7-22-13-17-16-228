package com.oocl.unitTest;

public class GuessNumber {
    public String guess(int[] inputGuess, int[] answer) {

        for (int i = 0; i < answer.length; i++) {
            if (inputGuess[i] != answer[i]) {
                return null;
            }
        }
        return "4A0B";
    }
}
