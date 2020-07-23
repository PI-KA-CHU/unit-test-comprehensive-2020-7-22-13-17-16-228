package com.oocl.unitTest;

public class GuessNumber {
    public String guess(int[] inputGuess, int[] answer) {

        int countAllCurrect = 0;
        int countNumberEqualAndIndexNot = 0;

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < inputGuess.length; j++) {
                if (answer[i] == inputGuess[j]) {
                    if (i == j) {
                        countAllCurrect ++;
                    }else {
                        countNumberEqualAndIndexNot ++;
                    }
                }
            }
        }
        return String.format("%sA%sB",countAllCurrect,countNumberEqualAndIndexNot);
    }
}
