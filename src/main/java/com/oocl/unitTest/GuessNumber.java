package com.oocl.unitTest;

import java.util.HashMap;
import java.util.Map;

public class GuessNumber {
    public String guess(int[] inputGuess, int[] answer) {

        int countAllCurrect = 0;
        int countNumberEqual = 0;
        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == inputGuess[i]) {
                countAllCurrect ++;
            }
            numberIndexMap.put(answer[i], i);
        }

        for (int i = 0; i < inputGuess.length; i++) {
            if (numberIndexMap.get(inputGuess[i]) != null) {
                countNumberEqual ++;
            }
        }
        return String.format("%sA%sB",countAllCurrect,countNumberEqual - countAllCurrect);
    }
}
