package com.oocl.unitTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuessNumber {
    public String guess(List<Integer> inputGuess, List<Integer> answer) {

        int countAllCurrect = 0;
        int countNumberEqual = 0;
        Map<Integer, Integer> numberIndexMap = new HashMap<>();

        for (int i = 0; i < answer.size(); i++) {
            if (answer.get(i).equals(inputGuess.get(i))) {
                countAllCurrect ++;
            }
            numberIndexMap.put(answer.get(i), i);
        }

        for (int i = 0; i < inputGuess.size(); i++) {
            if (numberIndexMap.get(inputGuess.get(i)) != null) {
                countNumberEqual ++;
            }
        }
        return String.format("%sA%sB",countAllCurrect,countNumberEqual - countAllCurrect);
    }
}
